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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jéssica
 */
public class Login {
    
    public Login(){
        
    }
    
    public Usuario verificarLogin(String email, String senha){
        Connection conexao = Conexao.getConexao();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Usuario usuario = new Usuario();
        
        if (conexao != null){
            String query;
            query = "Select * from usuario where email=? and senha=?;";
 
            try {
                preparedStatement = conexao.prepareStatement(query);
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, senha);
                resultSet = preparedStatement.executeQuery();

                if(resultSet.first() != false){
                    usuario.setId(resultSet.getInt("codUsuario"));
                    usuario.setNome(resultSet.getString("nomeUsuario"));
                    usuario.setEmail(resultSet.getString("email"));
                    usuario.setSenha(resultSet.getString("senha"));
                    usuario.setSexo(resultSet.getString("sexo"));
                    usuario.setDataNascimento(resultSet.getString("DataNascimento"));
                    usuario.setTelefone(resultSet.getString("telefone"));
                    usuario.setCurriculo(resultSet.getString("Curriculo"));
                    usuario.setAprendiz(resultSet.getBoolean("flagAprendiz"));
                }else{
                    usuario = null;
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
        
        return usuario;
    }

    
}
