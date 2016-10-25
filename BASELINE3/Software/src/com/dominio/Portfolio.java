/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
        Path origem = Paths.get(origemString);
        Path destino = Paths.get(destinoString);
        
        
        try {
            Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);
            return 0;
        
        } catch (IOException ex) {
            Logger.getLogger(TelaPortfolio.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        } 
        
    }
    
    
    
    
    
    
}
