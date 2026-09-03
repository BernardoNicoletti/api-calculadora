package com.nicoletti.api_calculadora.dto;

public class Resultado {

    private String mensagem;
    private double resultado;

    public Resultado(String mensagem, double resultado) {
        this.mensagem = mensagem;
        this.resultado = resultado;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}