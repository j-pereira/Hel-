/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio;

import com.bd.Conexao;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Pair;

/**
 *
 * @author Jéssica
 */
public class AreaAtuacao {
    private int codigo;
    private boolean calculo;
    private boolean algebra;
    private boolean fisica;
    private boolean filosofia;
    private boolean historia;
    private boolean logica;
    private boolean matematica;
    private boolean outro;

    public AreaAtuacao(){
    
    }
    
    public AreaAtuacao(int codigo, boolean calculo, boolean algebra, boolean fisica, boolean filosofia, boolean historia, boolean logica, boolean matematica, boolean outro){
        this.codigo = codigo;
        this.calculo = calculo;
        this.algebra = algebra;
        this.fisica = fisica;
        this.filosofia = filosofia;
        this.historia = historia;
        this.logica = logica;
        this.matematica = matematica;
        this.outro = outro;
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isCalculo() {
        return calculo;
    }

    public void setCalculo(boolean calculo) {
        this.calculo = calculo;
    }

    public boolean isAlgebra() {
        return algebra;
    }

    public void setAlgebra(boolean algebra) {
        this.algebra = algebra;
    }

    public boolean isFisica() {
        return fisica;
    }

    public void setFisica(boolean fisica) {
        this.fisica = fisica;
    }

    public boolean isFilosofia() {
        return filosofia;
    }

    public void setFilosofia(boolean filosofia) {
        this.filosofia = filosofia;
    }

    public boolean isHistoria() {
        return historia;
    }

    public void setHistoria(boolean historia) {
        this.historia = historia;
    }

    public boolean isLogica() {
        return logica;
    }

    public void setLogica(boolean logica) {
        this.logica = logica;
    }

    public boolean isMatematica() {
        return matematica;
    }

    public void setMatematica(boolean matematica) {
        this.matematica = matematica;
    }

    public boolean isOutro() {
        return outro;
    }

    public void setOutro(boolean outro) {
        this.outro = outro;
    }
   
        
    
    
    public List<Pair<String, Boolean>> areasSelecionadas() {
        List<Pair<String, Boolean>> areasSelecionadas = new ArrayList<>();
        
        areasSelecionadas.add(new Pair<>("Calculo", isCalculo()));
        areasSelecionadas.add(new Pair<>("Algebra", isAlgebra()));
        areasSelecionadas.add(new Pair<>("Fisica", isFisica()));
        areasSelecionadas.add(new Pair<>("Filosofia", isFilosofia()));
        areasSelecionadas.add(new Pair<>("Historia", isHistoria()));
        areasSelecionadas.add(new Pair<>("Logica", isLogica()));
        areasSelecionadas.add(new Pair<>("Matematica", isMatematica()));
        areasSelecionadas.add(new Pair<>("Outro", isOutro()));
        
        
        return areasSelecionadas;
    }
    
    
    
    
      
    
    
    public int atualizarAreaAtuacao (){
        Connection conexao = Conexao.getConexao();
        PreparedStatement preparedStatement = null;
        
        if (conexao != null){
            try {
                String query;
                query = "UPDATE areaDeAtuacao " +
                        "SET AACalculo=?, AAAlgebra=?, AAFisica=?, AAFilosofia=?, AAHistoria=?, AALogica=?, AAMatematica=?, AAOutro=? " +
                        "WHERE codUsuario = ?;";
                
                
                preparedStatement = conexao.prepareStatement(query);
                preparedStatement.setBoolean(1, this.isCalculo());
                preparedStatement.setBoolean(2, this.isAlgebra());
                preparedStatement.setBoolean(3, this.isFilosofia());
                preparedStatement.setBoolean(4, this.isFisica());
                preparedStatement.setBoolean(5, this.isHistoria());
                preparedStatement.setBoolean(6, this.isLogica());
                preparedStatement.setBoolean(7, this.isMatematica());
                preparedStatement.setBoolean(8, this.isOutro());
                preparedStatement.setInt(9, Usuario.usuarioAtual.getId());
                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(AreaAtuacao.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AreaAtuacao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return 0;
        }else{
            return 1;
        }
    }
    
    
    
    
    
    public List<Usuario> pesquisarAreaAtuacao (){
        Connection conexao = Conexao.getConexao();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Usuario> listaUsuario = new ArrayList<>();
        
        
        if (conexao != null){
            try {
                String query;
                query = "SELECT codUsuario, nomeUsuario, email, sexo, telefone, dataNascimento, curriculo " +
                        "FROM usuario " +
                        "WHERE codUsuario IN (" +
                            "SELECT codUsuario " +
                            "FROM areaDeAtuacao " +
                            "WHERE (AACalculo = ?) AND (AAAlgebra = ?) AND (AAFisica = ?) AND (AAFilosofia = ?) AND (AAHistoria = ?) AND (AALogica = ?) AND (AAMatematica = ?) AND (AAOutro = ?) ); ";

                preparedStatement = conexao.prepareStatement(query);
                preparedStatement.setBoolean(1, this.isCalculo());
                preparedStatement.setBoolean(2, this.isAlgebra());
                preparedStatement.setBoolean(3, this.isFilosofia());
                preparedStatement.setBoolean(4, this.isFisica());
                preparedStatement.setBoolean(5, this.isHistoria());
                preparedStatement.setBoolean(6, this.isLogica());
                preparedStatement.setBoolean(7, this.isMatematica());
                preparedStatement.setBoolean(8, this.isOutro());
                resultSet = preparedStatement.executeQuery();
                
                while(resultSet.next()){
                    Usuario usuario = new Usuario();
                    usuario.setId(resultSet.getInt("codUsuario"));
                    usuario.setNome(resultSet.getString("nomeUsuario"));
                    usuario.setEmail(resultSet.getString("email"));
                    usuario.setSexo(resultSet.getString("sexo"));
                    usuario.setTelefone(resultSet.getString("telefone"));
                    usuario.setDataNascimento(resultSet.getString("dataNascimento"));
                    usuario.setCurriculo(resultSet.getString("curriculo"));
                    
                    listaUsuario.add(usuario);
                }
                               
            } 
            catch (SQLException ex){
                Logger.getLogger(AreaAtuacao.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AreaAtuacao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
         
        }
        return listaUsuario;
           
    }
    
    
    
    public List<Usuario> pesquisarAreasAtuacaoInteresse (AreaInteresse areaInteresse){
        Connection conexao = Conexao.getConexao();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Usuario> listaUsuario = new ArrayList<>();
        
        if (conexao != null){
            String query;
            query = "SELECT codUsuario, nomeUsuario, email, sexo, telefone, dataNascimento, curriculo " +
                    "FROM usuario " +
                    "WHERE codUsuario IN ( " +
                    "   SELECT codUsuario " +
                    "   FROM areaDeAtuacao " +
                    "   WHERE (AACalculo = ?) AND (AAAlgebra = ?) AND (AAFisica = ?) AND (AAFilosofia = ?) AND (AAHistoria = ?) AND (AALogica = ?) AND (AAMatematica = ?) AND (AAOutro = ?) " +
                    "   AND codUsuario IN ( " +
                    "       SELECT codUsuario " +
                    "       FROM areaDeInteresse " +
                    "       WHERE (AICalculo = ?) AND (AIAlgebra = ?) AND (AIFisica = ?) AND (AIFilosofia = ?) AND (AIHistoria = ?) AND (AILogica = ?) AND (AIMatematica = ?) AND (AIOutro = ?) " +
                    "    ) ); ";

    
            try {
                preparedStatement = conexao.prepareStatement(query);
                preparedStatement.setBoolean(1, this.isCalculo());
                preparedStatement.setBoolean(2, this.isAlgebra());
                preparedStatement.setBoolean(3, this.isFilosofia());
                preparedStatement.setBoolean(4, this.isFisica());
                preparedStatement.setBoolean(5, this.isHistoria());
                preparedStatement.setBoolean(6, this.isLogica());
                preparedStatement.setBoolean(7, this.isMatematica());
                preparedStatement.setBoolean(8, this.isOutro());

                preparedStatement.setBoolean(9, areaInteresse.isCalculo());
                preparedStatement.setBoolean(10, areaInteresse.isAlgebra());
                preparedStatement.setBoolean(11, areaInteresse.isFilosofia());
                preparedStatement.setBoolean(12, areaInteresse.isFisica());
                preparedStatement.setBoolean(13, areaInteresse.isHistoria());
                preparedStatement.setBoolean(14, areaInteresse.isLogica());
                preparedStatement.setBoolean(15, areaInteresse.isMatematica());
                preparedStatement.setBoolean(16, areaInteresse.isOutro());
                resultSet = preparedStatement.executeQuery();
                
                while(resultSet.next()){
                    Usuario usuario = new Usuario();
                    usuario.setId(resultSet.getInt("codUsuario"));
                    usuario.setNome(resultSet.getString("nomeUsuario"));
                    usuario.setEmail(resultSet.getString("email"));
                    usuario.setSexo(resultSet.getString("sexo"));
                    usuario.setTelefone(resultSet.getString("telefone"));
                    usuario.setDataNascimento(resultSet.getString("dataNascimento"));
                    usuario.setCurriculo(resultSet.getString("curriculo"));
                    
                    listaUsuario.add(usuario);
                }
                                
            } catch (SQLException ex) {
                Logger.getLogger(AreaAtuacao.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AreaAtuacao.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        }
        
        return listaUsuario;
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //fim da classe        
}
