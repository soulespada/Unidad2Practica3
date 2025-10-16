package com.ieschabas;
/**
 * Clase que recibe un String nombre y dos doubles precio y calcula el precio con iva y lo muestra por pantalla
 * @author Adrian
 * @version 1.0
 */
public class FormateadorFactura {//Crea una clase llamada FormateadorFactura que reciba el nombre de un producto, su precio base y el porcentaje de IVA.
    // La clase debe:
    // - Mostrar una línea de ticket con el producto y el precio base formateados.
    // - Calcular y devolver el total con IVA incluido.
    // El programa principal debe leer los datos del usuario y mostrar el ticket completo.

    private String nombre;
    private double precioBase;
    private double iva;

    /**
     * Constructor vacío de la clase FormateadorFactura
     */
    public FormateadorFactura(){}
    /**
     * Constructor sobrecargado de la clase FormateadorFactura
     */
    public FormateadorFactura(String nombre, double precioBase, double iva) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.iva = iva;
    }

    /**
     * Getters de la clase FormateadorFactura
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    public double getprecioBase() {
        return precioBase;
    }
    public double getIva() {
        return iva;
    }
    /**
     * Setters de la clase FormateadorFactura
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precioBase = precioBase;
    }
    public void setIva(double iva) {
        this.iva = iva;
    }

    /**
     * Metodo String que calcula el precio con iva y te muestra los atributos
     * @return nombre, precio
     */
    public String toString(){
        double precioTotal = precioBase * iva + precioBase;
        //pasamos a String el int
        String precioString = String.valueOf(precioBase);

        String preciototalString = String.valueOf(precioTotal);
        return "Producto: " + nombre + "|| Precio sin iva: " + precioString + " €" +" ||Precio con IVA incluido: "+preciototalString+"€";
    }
}
