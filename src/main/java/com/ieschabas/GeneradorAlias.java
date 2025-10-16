package com.ieschabas;
/**
 * Clase que recibe un nombre y curso y a partir de estos lo transforma en un alias y crea un hashcode a partir de este y lo muestra
 * @author Adrian
 * @version 1.0
 */
public class GeneradorAlias {
    private String nombre;
    private String ciclo;
    private String alias;
    private int codigo;

    /**
     * Constructor vacío de la clase GeneradorAlias
     */
    public GeneradorAlias(){};
    /**
     * Constructor sobrecargado de la clase GeneradorAlias
     * @param nombre
     * @param ciclo
     * @param alias
     * @param codigo
     */
    public GeneradorAlias(String nombre, String ciclo,String alias,int codigo) {
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.alias = alias;
        this.codigo = codigo;
    }
    /**
     * getters de la clase GeneradorAlias
     * @return nombre, ciclo, alias, codigo
     */
    public String getNombre() {
        return nombre;
    }
    public String getCiclo() {
        return ciclo;
    }
    public String getAlias() {
        return alias;
    }
    public int getCodigo() {
        return codigo;
    }

    /**
     * Setters de la clase GeneradorAlias
     * @param nombre, ciclo, alias, codigo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Método String que devuelve un alias creado a partir de separar el nombre y el ciclo por espacios en un Array, coge las iniciales las pone en mayúscula y las junta, devolviendo el Alias personalizado
     * @return alias
     */
    public String generarAlias(){
     //    alias = nombre.substring(0,3)+ciclo.substring(0,3);
        // alias = alias.toUpperCase();
     //   return alias;
        String []Nombres=  nombre.split(" ");
        String alias1="";
        for(int i=0;i<Nombres.length;i++){

            alias1+=Nombres[i].substring(0,1).toUpperCase();
        }
        String []Ciclo = ciclo.split(" ");
        String alias2 ="";
        for(int i=0;i< Ciclo.length;i++){
            alias2+=Ciclo[i].substring(0,1).toUpperCase();
        }
        alias =alias1+alias2;

        return alias;
    }

    /**
     * Metodo que devuelve un int que es el hashcode del alias
     * @return
     */
    public int generarCodigo(){
        codigo = alias.hashCode();
        return codigo;
    }






}
