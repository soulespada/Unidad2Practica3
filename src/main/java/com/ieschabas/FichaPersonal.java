package com.ieschabas;
/**
 * Clase que recibe una cadena, la separa y formatea y la muestra
 * @author Adrian
 * @version 1.0
 */
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

    /**
     * Constructor vacío de la clase FichaPersonal
     */
    public FichaPersonal(){}
    /**
     * Constructor sobrecargado de la clase FichaPersonal
     * @param nombre
     * @param apellido
     * @param fechaNacimiento
     * @param ciudad
     */
    public FichaPersonal(String nombre, String apellido, String fechaNacimiento, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
    }

    /**
     * Getters
     * @return apellido, nombre, fechaNacimiento, Ciudad
     */
    public String getApellido() {
        return apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Setters
     * @param apellido, nombre, fechaNacimiento, Ciudad
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Método que devuelve un String de la edad aproximada cogiendo el año de nacimiento y restandoselo a 2025
     * @return edadString
     */
    public String calcularEdad(){
        String años = fechaNacimiento.substring(0,4);
        int añoInt = Integer.parseInt(años);
        int edadAprox = 2025-añoInt;
        String edadString = String.valueOf(edadAprox);
        return edadString;

    }

    /**
     * Metodo que devuelve un String con todos los datos de FichaPersonal
     * @return FichaPersonal
     */
    public String mostrarFicha(){
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nFecha de nacimiento: " + fechaNacimiento + "\nCiudad: "+ ciudad + "\nEdad aproximada: " + calcularEdad();
    }

}
