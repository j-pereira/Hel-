/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio;

import com.bd.Conexao;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import telas.TelaPortfolio;

/**
 *
 * @author Jéssica
 */
public class Portfolio {
    int codigo;
    String nome;
    String caminho;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }
    
    
    
    public int adicionarItem(String origemString, String destinoString){
        Connection conexao = Conexao.getConexao();
        PreparedStatement preparedStatement = null;
        
        if(conexao != null){
            String query;
            query = "INSERT INTO portfolio " +
                    "(codUsuario, nomePortfolio, caminho) " +
                    "VALUES (?,?,?);";
            
            try {
                preparedStatement = conexao.prepareStatement(query);
                preparedStatement.setInt(1, Usuario.usuarioAtual.getId());
                preparedStatement.setString(2, this.getNome());
                preparedStatement.setString(3, this.getCaminho());
                preparedStatement.executeUpdate();

                Path origem = Paths.get(origemString);
                Path destino = Paths.get(destinoString);

                try {
                    Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);
                    return 0;

                } catch (IOException ex) {
                    Logger.getLogger(TelaPortfolio.class.getName()).log(Level.SEVERE, null, ex);
                    return 1;
                } 

            } catch (SQLException ex) {
                Logger.getLogger(Portfolio.class.getName()).log(Level.SEVERE, null, ex);
                return 1;
            }finally{
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Portfolio.class.getName()).log(Level.SEVERE, null, ex);
                    return 1;
                }
            }
        }else{
            return 1;
        }
            
    }
      
        
    public int baixarItem(){
        String home = System.getProperty("user.home");
        Path origem = Paths.get(this.getCaminho() + this.getNome());
        Path destino = Paths.get(home + "/Downloads/" + this.getNome());

        try {
            Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);
            return 0;
        } catch (IOException ex) {
            Logger.getLogger(TelaPortfolio.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    
    }
    
        
    
    public List<Portfolio> listarItemPortfolio(int id){
        Connection conexao = Conexao.getConexao();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Portfolio> listaItem = new ArrayList<>();
        
        if (conexao != null){
            String query;
            query = "SELECT nomePortfolio, caminho " +
                    "FROM portfolio " +
                    "WHERE codUsuario = ?;";
            
            try {
                preparedStatement = conexao.prepareStatement(query);
                preparedStatement.setInt(1, id);
                resultSet = preparedStatement.executeQuery();
                
                while(resultSet.next()){
                    Portfolio portfolio = new Portfolio();
                    portfolio.setNome(resultSet.getString("nomePortfolio"));
                    portfolio.setCaminho(resultSet.getString("caminho"));
                                       
                    listaItem.add(portfolio);
                }
                                
            } catch (SQLException ex) {
                Logger.getLogger(Portfolio.class.getName()).log(Level.SEVERE, null, ex);
            }
              
        }
        return listaItem;
    }
    
    

    public int excluirItem(){
        Connection conexao = Conexao.getConexao();
        PreparedStatement preparedStatement = null;
        
        if(conexao != null){
            String query;
            query = "DELETE FROM portfolio " +
                    "WHERE nomePortfolio = ? AND codUsuario = ?;";
            
            try {
                preparedStatement = conexao.prepareStatement(query);
                preparedStatement.setString(1, this.getNome());
                preparedStatement.setInt(2, Usuario.usuarioAtual.getId()); 
                preparedStatement.executeUpdate();

                File file = new File(this.getCaminho() + this.getNome());
                if(file.delete()){
                    return 0;
                }else{
                    return 1;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Portfolio.class.getName()).log(Level.SEVERE, null, ex);
                return 1;
            }finally{
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Portfolio.class.getName()).log(Level.SEVERE, null, ex);
                    return 1;
                }
            }
        }else{
            return 1;
        }
        
        

    }






}
