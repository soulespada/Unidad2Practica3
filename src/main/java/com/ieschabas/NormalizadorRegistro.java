package com.ieschabas;

public class NormalizadorRegistro {
    //Crea una clase llamada NormalizadorRegistro que reciba un usuario, un correo y un
    //teléfono.
    //La clase debe: - Devolver el usuario formateado correctamente. - Mostrar el correo en formato canónico. - Extraer el prefijo del teléfono. - Generar una clave numérica basada en los datos introducidos.
    //El programa principal debe pedir los datos al usuario, crear un objeto de la clase y mostrar
    //todos los resultados.
    private String usuario;
    private String correo;
    private String telefono;

    public NormalizadorRegistro(String usuario, String correo, String telefono) {
        this.usuario = usuario;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String formatUsuario(){
        usuario = usuario.trim().toLowerCase().substring(0,1).toUpperCase()+usuario.substring(1).replace(" ","").replaceAll("^a-zA-Z0-9","");
      /**  usuario = usuario.substring(0,1).toUpperCase() + usuario.substring(1);
        usuario = usuario.replaceAll("[^a-zA-Z0-9]", "");*/
        return usuario;
    }
    public String formatCorreo(){
        correo = correo.trim().toLowerCase();

        if (correo.endsWith("@gmail.com") || correo.endsWith("@hotmail.com")) {
                // Extraemos el nombre antes del @
                String nombre = correo.substring(0, correo.indexOf("@"));
                correo = nombre + "@alu.edu.gva.es";
        }

            return correo;

    }
    public String prefijoTel(){
        String prefijo = telefono.substring(0,3);
                return prefijo;
    }
    public int generarClave(){
        return (usuario+prefijoTel()+correo).hashCode();
    }

}
