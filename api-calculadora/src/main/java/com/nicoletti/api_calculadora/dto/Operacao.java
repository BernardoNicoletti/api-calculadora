package com.nicoletti.api_calculadora.dto;

public class Operacao {

    private double valor1;
    private double valor2;
    private String tipo;

    public Operacao() {
    }

    public Operacao(double valor1, double valor2, String tipo) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.tipo = tipo;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}