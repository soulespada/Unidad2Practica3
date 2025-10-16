package com.ieschabas;
/**
 * Clase main que instancia todas las clases
 * @author Adrian Hidalgo
 * @version 1.0
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /**
         * Instancia clase GeneradorAlias
         */
        Scanner scan = new Scanner(System.in);
        //instanciamos el objeto vacio
      GeneradorAlias generadorAlias1 = new GeneradorAlias();
        String nombreCompleto = " ";
        String cicloCompleto;
        System.out.println("Introduce tu nombre completo: ");
        //pide un nombre y apellidos y comprueba si tiene espacios
        while (true) {
            nombreCompleto = scan.nextLine();
            if (nombreCompleto.contains(" ")) {
                break;
            } else {
                System.out.println("Introduce tu nombre y apellidos con espacios");
            }
        }
        generadorAlias1.setNombre(nombreCompleto);
        System.out.println("Introduce tu ciclo: ");
        generadorAlias1.setCiclo(scan.nextLine());
        //cargamos el alias y el codigo
        System.out.println("Tu alias generado es: "+generadorAlias1.generarAlias()+" y tu código es: "+generadorAlias1.generarCodigo());
        System.out.println(generadorAlias1.getCodigo());
        System.out.println(generadorAlias1.getAlias());

    /**
     * Instancia clase CalculadoraTexto
     */
        System.out.println("Introduce una expresion escrita en formato:'n1+n2'");
        //Quitamos espacios
        String usuario = scan.nextLine().trim();
        char operador=' ';
        //establecemos el operador
        if(usuario.contains("+")){operador = '+';}
        else if (usuario.contains("-")) {operador='-';}
        else if(usuario.contains("*")){operador='*';}
        //dividimos mediante el parametro operador
        String []partes = usuario.split("[+\\-*]");
        double a = Double.parseDouble(partes[0]);
        double b = Double.parseDouble(partes[1]);
        //instanciamos el objeto de clase CalculadoraTexto sobrecargándolo
        CalculadoraTexto calculadoraTexto = new CalculadoraTexto(a,b,operador);
        System.out.println("Resultado: "+ calculadoraTexto.calcular());

        /**
         * Instancia de la clase FormateadorFactura
         */
        //escaneamos los datos
        System.out.println("Introduce el nombre del producto y el precio base");
        String nombreProducto = scan.nextLine();
        double precioProducto = scan.nextDouble();
        //sobrecargamos el objeto y le pasamos el iva
        FormateadorFactura formateadorFactura = new FormateadorFactura(nombreProducto,precioProducto,0.21);
        //imprimimos los datos
        System.out.println(formateadorFactura.toString());
        scan.nextLine();
        /**
         * Instancia de la clase FichaPersonal
         */
        System.out.println("Introduce tu ficha con este formato:\nNombre Apellido - YYYY-MM-DD - Ciudad");
        String ficha = scan.nextLine();
        String nombreApellidoFicha ="";
        //Separamos por " - "
        String []fichaSeparada = ficha.trim().split(" - ");
        //establecemos cada posicion del array quitando espacios por si acaso
        nombreApellidoFicha = fichaSeparada[0].trim();
        String fechaNacimiento = fichaSeparada[1].trim();
        String ciudad = fichaSeparada[2].trim();
        //separamos nombre de apellido separando por un espacio o más
        String []nombresSeparados = nombreApellidoFicha.split(" +");
        String nombreFicha = nombresSeparados[0];
        String apellidoFicha = nombresSeparados[1];
        //instanciamos el objeto de la clase FichaPersonal y la mostramos
        FichaPersonal fichaPersonal = new FichaPersonal(nombreFicha, apellidoFicha, fechaNacimiento, ciudad);
        System.out.println(fichaPersonal.mostrarFicha());

        /**
         * Instancia de la clase NormalizadorRegistro
         */
        System.out.println("Introduce usuario:");
       String usuarioRegistro= scan.nextLine();
        System.out.println("Introduce tu correo:");
       String correo= scan.nextLine();
        System.out.println("Introduce tu telefono con prefijo incluido:");
       String telefono = scan.nextLine();
       //instanciamos el objeto
        NormalizadorRegistro normalizadorRegistro = new NormalizadorRegistro(usuarioRegistro,correo,telefono);
        System.out.println(normalizadorRegistro.formatUsuario());
        System.out.println(normalizadorRegistro.formatCorreo());
        System.out.println(normalizadorRegistro.prefijoTel());
        System.out.println("Tu código asociado es:"+normalizadorRegistro.generarClave());







    }




    }
