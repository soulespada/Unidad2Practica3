package com.ieschabas;

public class FormateadorFactura {//Crea una clase llamada FormateadorFactura que reciba el nombre de un producto, su precio base y el porcentaje de IVA.
    // La clase debe:
    // - Mostrar una línea de ticket con el producto y el precio base formateados.
    // - Calcular y devolver el total con IVA incluido.
    // El programa principal debe leer los datos del usuario y mostrar el ticket completo.

    private String nombre;
    private double precioBase;
    private double iva;


    public FormateadorFactura(){}

    public FormateadorFactura(String nombre, double precioBase, double iva) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.iva = iva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getprecioBase() {
        return precioBase;
    }

    public void setPrecio(double precio) {
        this.precioBase = precioBase;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }


    public String toString(){
        double precioTotal = precioBase * iva + precioBase;
        String precioString = String.valueOf(precioBase);

        String preciototalString = String.valueOf(precioTotal);
        return "Producto: " + nombre + "|| Precio sin iva: " + precioString + " €" +" ||Precio con IVA incluido: "+preciototalString+"€";
    }
}
