/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio;

import com.bd.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jéssica
 */
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String sexo;
    private String dataNascimento;
    private String telefone;
    private String curriculo;
    private boolean aprendiz;

    public static Usuario usuarioAtual;
        
    public Usuario(){
    
    }
    
    public Usuario(int id, String nome, String email, String senha, String sexo, String dataNascimento, String telefone, String curriculo, boolean aprendiz){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.curriculo = curriculo;
        this.aprendiz = aprendiz;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }
    
    public boolean isAprendiz() {
        return aprendiz;
    }

    public void setAprendiz(boolean aprendiz) {
        this.aprendiz = aprendiz;
    }
    
     
    
    public int cadastrarUsuario(AreaAtuacao areaAtuacao, AreaInteresse areaInteresse){
        Connection conexao = Conexao.getConexao();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        if (conexao != null){
            String query1;
            query1 = "INSERT INTO usuario" +
                    "(nomeUsuario, email, senha, sexo, telefone, dataNascimento, curriculo, flagAprendiz)" +
                    "VALUES (?,?,?,?,?,?,?,?);";
            
            try {
                preparedStatement = conexao.prepareStatement(query1);
                preparedStatement.setString(1, this.getNome());
                preparedStatement.setString(2, this.getEmail());
                preparedStatement.setString(3, this.getSenha());
                preparedStatement.setString(4, this.getSexo());
                preparedStatement.setString(5, this.getTelefone());
                preparedStatement.setString(6, this.getDataNascimento());
                preparedStatement.setString(7, this.getCurriculo());
                preparedStatement.setBoolean(8, this.isAprendiz());
                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
            String query2;
            query2 = "SELECT codUsuario FROM usuario ORDER BY codUsuario DESC LIMIT 1;";
          
            try{  
                preparedStatement = conexao.prepareStatement(query2);
                resultSet = preparedStatement.executeQuery();
                
                resultSet.first();
                this.setId(resultSet.getInt("codUsuario"));
            } catch (SQLException ex) {
                Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String query3;
            query3 = "INSERT INTO areaDeInteresse" +
                     "(codUsuario, AICalculo, AIAlgebra, AIFisica, AIFilosofia, AIHistoria, AILogica, AIMatematica, AIOutro)" +
                     "VALUES (?,?,?,?,?,?,?,?,?);";
            
            try {
                preparedStatement = conexao.prepareStatement(query3);
                preparedStatement.setInt(1, this.getId());
                preparedStatement.setBoolean(2, areaInteresse.isCalculo());
                preparedStatement.setBoolean(3, areaInteresse.isAlgebra());
                preparedStatement.setBoolean(4, areaInteresse.isFisica());
                preparedStatement.setBoolean(5, areaInteresse.isFilosofia());
                preparedStatement.setBoolean(6, areaInteresse.isHistoria());
                preparedStatement.setBoolean(7, areaInteresse.isLogica());
                preparedStatement.setBoolean(8, areaInteresse.isMatematica());
                preparedStatement.setBoolean(9, areaInteresse.isOutro());
                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                    try {
                        if(this.isAprendiz() == true)
                            conexao.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            
            
            if(this.isAprendiz() != true){
                query3 = "INSERT INTO areaDeAtuacao" +
                         "(codUsuario, AACalculo, AAAlgebra, AAFisica, AAFilosofia, AAHistoria, AALogica, AAMatematica, AAOutro)" +
                         "VALUES (?,?,?,?,?,?,?,?,?);";
                try {
                    preparedStatement = conexao.prepareStatement(query3);
                    preparedStatement.setInt(1, this.getId());
                    preparedStatement.setBoolean(2, areaAtuacao.isCalculo());
                    preparedStatement.setBoolean(3, areaAtuacao.isAlgebra());
                    preparedStatement.setBoolean(4, areaAtuacao.isFisica());
                    preparedStatement.setBoolean(5, areaAtuacao.isFilosofia());
                    preparedStatement.setBoolean(6, areaAtuacao.isHistoria());
                    preparedStatement.setBoolean(7, areaAtuacao.isLogica());
                    preparedStatement.setBoolean(8, areaAtuacao.isMatematica());
                    preparedStatement.setBoolean(9, areaAtuacao.isOutro());
                    preparedStatement.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
                }finally{
                    try {
                        conexao.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            return 0;
        }else{
            return 1;
        }   
       
    }
        
    
    public int atualizarUsuario(){
        Connection conexao = Conexao.getConexao();
        PreparedStatement preparedStatement = null;
        
        if (conexao != null){
            String query;
            query = "UPDATE usuario " +
                    "SET nomeUsuario = ?, email = ?, senha = ?, sexo = ?, telefone = ?, dataNascimento = ?, curriculo = ? " +
                    "WHERE codUsuario = ?;";
                              
            try {
                preparedStatement = conexao.prepareStatement(query);
                preparedStatement.setString(1, this.getNome());
                preparedStatement.setString(2, this.getEmail());
                preparedStatement.setString(3, this.getSenha());
                preparedStatement.setString(4, this.getSexo());
                preparedStatement.setString(5, this.getTelefone());
                preparedStatement.setString(6, this.getDataNascimento());
                preparedStatement.setString(7, this.getCurriculo());
                preparedStatement.setInt(8, this.getId());
                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
            }
            return 0;
        }else{
            return 1;
        }   
    
    }
    
    
    
    public List<Usuario> pesquisarUsuarioPorNome(){
        Connection conexao = Conexao.getConexao();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Usuario> listaUsuario = new ArrayList<>();
        
         if (conexao != null){
            String query;
            query = "SELECT codUsuario, nomeUsuario, email, sexo, telefone, dataNascimento, curriculo " +
                    "FROM usuario " +
                    "WHERE nomeUsuario LIKE ? ; ";
            
            try {
                preparedStatement = conexao.prepareStatement(query);
                preparedStatement.setString(1, this.getNome() + "%");
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
                Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
  
        return listaUsuario;
    }

    
    
    
    public List<Usuario> pesquisarTodosUsuarios(){
        Connection conexao = Conexao.getConexao();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Usuario> listaUsuario = new ArrayList<>();
        
        
         if (conexao != null){
            String query;
            query = "SELECT codUsuario, nomeUsuario, email, sexo, telefone, dataNascimento, curriculo FROM usuario;";
            
            try {
                preparedStatement = conexao.prepareStatement(query);
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
                Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
  
        return listaUsuario;
    }
    
    
    
    
    
    
    
    
    
    
    
    
  //teste Jéssica
  //teste software 

    
    
    //fim da classe 
}
