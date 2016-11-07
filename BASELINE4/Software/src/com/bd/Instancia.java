/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jéssica
 */
public class Instancia {
    private static Instancia instancia;
    
    private Instancia (){ }
    
    public static Instancia getInstancia(){
        if(instancia == null)
            instancia = new Instancia();
        
        return instancia;
    }
    
    public int verificaBD(){
        Connection conexao = Conexao.getConexao();
        PreparedStatement preparedStatement = null;
        
        if(conexao != null){
            String sql = " use testeexec; ";
           
            try {
                preparedStatement = conexao.prepareStatement(sql);
                preparedStatement.executeUpdate();
                return 0;
            } catch (SQLException ex) {
                Logger.getLogger(Instancia.class.getName()).log(Level.SEVERE, null, ex);
                 return 1;
            }
            
        }else{
            return 1;
        }
        
    }
    
    
    public int criarBD(){
        Connection conexao = Conexao.getConexaoSemBD();
        PreparedStatement preparedStatement = null;
                
        if(conexao != null){
            String sql = " CREATE DATABASE BDhelpme; " +
                         " use BDhelpme; " +
                         " create table usuario( " +
                         "    codUsuario int not null auto_increment, " +
                         "    nomeUsuario char(50) not null, " +
                         "    email char(50) not null, " +
                         "    senha char(20) not null, " +
                         "    sexo char(10) null, " +
                         "    telefone char(15) null, " +
                         "    dataNascimento date not null, " +
                         "    curriculo varchar(500) not null, " +
                         "    flagAprendiz binary not null, " +
                         "    primary key (codUsuario), " +
                         "    unique (email) " +
                         " ); " +

                         " create table areaDeAtuacao( " +
                         "    codAreaDeAtuacao int not null auto_increment, " +
                         "    codUsuario int null, " +
                         "    AACalculo binary not null default 0, " +
                         "    AAAlgebra binary not null default 0, " +
                         "    AAFisica binary not null default 0, " +
                         "    AAFilosofia binary not null default 0, " +
                         "    AAHistoria binary not null default 0, " +
                         "    AALogica binary not null default 0, " +
                         "    AAMatematica binary not null default 0, " +
                         "    AAOutro binary not null default 0, " +
                         "    primary key(codAreaDeAtuacao), " +
                         "    foreign key(codUsuario) references usuario (codUsuario) " +
                         " ); " +
                    
                         " create table areaDeInteresse( " +
                         "    codAreaDeInteresse int not null auto_increment, " +
                         "    codUsuario int null, " +
                         "    AICalculo binary not null default 0, " +
                         "    AIAlgebra binary not null default 0, " +
                         "    AIFisica binary not null default 0, " +
                         "    AIFilosofia binary not null default 0, " +
                         "    AIHistoria binary not null default 0, " +
                         "    AILogica binary not null default 0, " +
                         "    AIMatematica binary not null default 0, " +
                         "    AIOutro binary not null default 0, " +
                         "    primary key(codAreaDeInteresse), " +
                         "    foreign key(codUsuario) references usuario (codUsuario) " +
                         " ); " +
                    
                         " create table portfolio( " +
                         "    codPortfolio int not null auto_increment, " +
                         "    codUsuario int not null, " +
                         "    nomePortfolio char(30) not null, " +
                         "    caminho char(200) not null, " +
                         "    primary key(codPortfolio), " +
                         "    foreign key (codUsuario) references usuario(codUsuario) " +
                         " ); ";
           
            try {
                preparedStatement = conexao.prepareStatement(sql);
                preparedStatement.executeUpdate();
                return 0;
            } catch (SQLException ex) {
                Logger.getLogger(Instancia.class.getName()).log(Level.SEVERE, null, ex);
                return 1;
            }finally{
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Instancia.class.getName()).log(Level.SEVERE, null, ex);
                    return 1;
                }
                
                   
            }
        }else{
            return 1;
        }
        
    }
    
    
    
}
