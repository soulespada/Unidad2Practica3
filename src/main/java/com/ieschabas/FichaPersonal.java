package com.ieschabas;

public class FichaPersonal {/**
 Crea una clase llamada FichaPersonal que reciba una cadena con el formato:
 "Nombre Apellido - YYYY-MM-DD - Ciudad"
 La clase debe:
 - Guardar cada parte como propiedades (nombre, apellido, fecha y ciudad).
 - Calcular el año de nacimiento y la edad aproximada.
 -Mostrar una etiqueta de identificación con los datos formateados.
 El programa principal debe pedir la cadena al usuario e imprimir la información de la ficha.
 */
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String ciudad;

    public FichaPersonal(){}

    public FichaPersonal(String nombre, String apellido, String fechaNacimiento, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String calcularEdad(){
        String años = fechaNacimiento.substring(0,4);
        int añoInt = Integer.parseInt(años);
        int edadAprox = 2025-añoInt;
        String edadString = String.valueOf(edadAprox);
        return edadString;

    }
    public String mostrarFicha(){
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nFecha de nacimiento: " + fechaNacimiento + "\nCiudad: "+ ciudad + "\nEdad aproximada: " + calcularEdad();
    }

}
