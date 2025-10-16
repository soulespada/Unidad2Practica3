package com.ieschabas;
/**
 *Clase que formatea un registro y lo muestra por pantalla
 * @author Adrian
 * @version 1.0
 */
public class NormalizadorRegistro {
    //Crea una clase llamada NormalizadorRegistro que reciba un usuario, un correo y un
    //teléfono.
    //La clase debe: - Devolver el usuario formateado correctamente. - Mostrar el correo en formato canónico. - Extraer el prefijo del teléfono. - Generar una clave numérica basada en los datos introducidos.
    //El programa principal debe pedir los datos al usuario, crear un objeto de la clase y mostrar
    //todos los resultados.
    private String usuario;
    private String correo;
    private String telefono;
    /**
     * Constructor sobrecargado de la clase NormalizadorRegistros
     */
    public NormalizadorRegistro(String usuario, String correo, String telefono) {
        this.usuario = usuario;
        this.correo = correo;
        this.telefono = telefono;
    }
    /**
     * Constructor vacio de la clase NormalizadorRegistros
     */
    public NormalizadorRegistro(){}

    /**
     * Getters
     * @return Usuario Correo Telefono
     */
    public String getUsuario() {
        return usuario;
    }
    public String getCorreo() {
        return correo;
    }
    public String getTelefono() {
        return telefono;
    }

    /**
     * Setters
     * @param usuario, correo, telefono
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Método que formatea el usuario
     * @return usuario
     */
    public String formatUsuario(){
        //Cogemos la primera posicion, la pasamos a mayuscula y lo sumamos al resto de la cadena eliminando espacios
        usuario = usuario.trim().toLowerCase().substring(0,1).toUpperCase()+usuario.substring(1).replace(" ","").replaceAll("^a-zA-Z0-9","");
      /**  usuario = usuario.substring(0,1).toUpperCase() + usuario.substring(1);
        usuario = usuario.replaceAll("[^a-zA-Z0-9]", "");*/
        return usuario;
    }
    /**
     * Método que formatea el usuario
     * @return usuario
     */
    public String formatCorreo(){
        correo = correo.trim().toLowerCase();
        //cambiamos el correo al formato que queremos comprobando primero si acaba en gmail o en hotmail
        if (correo.endsWith("@gmail.com") || correo.endsWith("@hotmail.com")) {
                //Extraemos el nombre antes del @
                String nombre = correo.substring(0, correo.indexOf("@"));
                correo = nombre + "@alu.edu.gva.es";
        }
            return correo;
    }
    /**
     * Método que coge los 3 primeros caracteres del telefono(prefijo)
     * @return prefijo
     */
    public String prefijoTel(){
        String prefijo = telefono.substring(0,3);
                return prefijo;
    }
    /**
     * Método que crea un hashcode con el input del usuario
     * @return clave
     */
    public int generarClave(){
        return (usuario+prefijoTel()+correo).hashCode();
    }

}
