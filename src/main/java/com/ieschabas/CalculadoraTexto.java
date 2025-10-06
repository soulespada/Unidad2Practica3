package com.ieschabas;

public class CalculadoraTexto {
    private double a;
    private double b;
    private char operador;

    public CalculadoraTexto(){};

    public CalculadoraTexto(double a, double b,char operador) {
        this.a = a;
        this.b = b;
        this.operador=operador;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public double calcular(){
        switch (operador){
            case '+':return a+b;
            case '-':return a-b;
            case '*':return a*b;
            default:
                throw new IllegalStateException("Unexpected value: " + operador);
        }
    }
}
