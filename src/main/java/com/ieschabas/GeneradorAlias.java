package com.ieschabas;

public class GeneradorAlias {
    private String nombre;
    private String ciclo;
    private String alias;
    private int codigo;
    public GeneradorAlias(){};
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public GeneradorAlias(String nombre, String ciclo,String alias,int codigo) {
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.alias = alias;
        this.codigo = codigo;
    }

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
    public int generarCodigo(){
        codigo = alias.hashCode();
        return codigo;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
