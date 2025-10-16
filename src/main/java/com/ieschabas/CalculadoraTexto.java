package com.ieschabas;
/**
 * Clase que recibe una cadena con dos numeros y un operador y segun el operador hace una operacion diferente
 * @author Adrian
 * @version 1.0
 */
public class CalculadoraTexto {
    private double a;
    private double b;
    private char operador;

    /**
     * Constructor vacío de la clase CalculadoraTexto
     */
    public CalculadoraTexto(){};

    /**
     * Constructor sobrecargado de la clase CalculadoraTexto
     * @param a
     * @param b
     * @param operador
     */
    public CalculadoraTexto(double a, double b,char operador) {
        this.a = a;
        this.b = b;
        this.operador=operador;
    }

    /**
     * Getters de la clase CalculadoraTexto
     * @return
     */
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public char getOperador() {
        return operador;
    }

    /**
     * Setters de la clase CalculadoraTexto
     * @param a
     */
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    /**
     * Método tipo double que mediante un switch que recibe el operador calcula
     * @return resultado
     */
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
