/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd;

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
}
