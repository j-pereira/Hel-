/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio;

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
   
    
    
            
}
