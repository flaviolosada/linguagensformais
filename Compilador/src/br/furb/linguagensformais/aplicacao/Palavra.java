/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.furb.linguagensformais.aplicacao;

/**
 *
 * @author Gabriel Bernardi
 */
public class Palavra {
    
    private String sequencia;
    private EnumResultado resultado;
    private int linha;

    public Palavra(){}

    public String getSequencia() {
        return sequencia;
    }

    public void setSequencia(String sequencia) {
        this.sequencia = sequencia;
    }

    public EnumResultado getResultado() {
        return resultado;
    }

    public void setResultado(EnumResultado resultado) {
        this.resultado = resultado;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }
}
