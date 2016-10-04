/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio;

import com.bd.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    private int telefone;
    private String curriculo;
    private boolean aprendiz;

        
    public Usuario(){
    
    }
    
    public Usuario(int id, String nome, String email, String senha, String sexo, String dataNascimento, int telefone, String curriculo, boolean aprendiz){
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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
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
    
     
    
    public void cadastrarUsuario(/*AreaAtuacao areaAtuacao, AreaInteresse areaInteresse*/){
        Connection conexao = Conexao.getConexao();
        PreparedStatement preparedStatement = null;
        
        if (conexao != null){
            String query;
            query = "INSERT INTO usuario" +
                    "(nomeUsuario, email, senha, sexo, telefone, dataNascimento, curriculo, flagAprendiz)" +
                    "VALUES (?,?,?,?,?,?,?,?);";
                    
            try {
                preparedStatement = conexao.prepareStatement(query);
                preparedStatement.setString(1, this.getNome());
                preparedStatement.setString(2, this.getEmail());
                preparedStatement.setString(3, this.getSenha());
                preparedStatement.setString(4, this.getSexo());
                preparedStatement.setInt(5, this.getTelefone());
                preparedStatement.setString(6, this.getDataNascimento());
                preparedStatement.setString(7, this.getCurriculo());
                preparedStatement.setBoolean(8, this.isAprendiz());
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
        }     
        
    }
    


  //teste Breno
    
    
    
}
