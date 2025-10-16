package com.ieschabas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
      GeneradorAlias generadorAlias1 = new GeneradorAlias();
        String nombreCompleto = " ";
        String cicloCompleto;
        System.out.println("Introduce tu nombre completo: ");
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
        System.out.println("Tu alias generado es: "+generadorAlias1.generarAlias()+" y tu código es: "+generadorAlias1.generarCodigo());
        System.out.println(generadorAlias1.getCodigo());
        System.out.println(generadorAlias1.getAlias());


        System.out.println("Introduce una expresion escrita en formato:'n1+n2'");
        String usuario = scan.nextLine().trim();
        char operador=' ';
        if(usuario.contains("+")){operador = '+';}
        else if (usuario.contains("-")) {operador='-';}
        else if(usuario.contains("*")){operador='*';}
        String []partes = usuario.split("[+\\-*]");
        double a = Double.parseDouble(partes[0]);
        double b = Double.parseDouble(partes[1]);

        CalculadoraTexto calculadoraTexto = new CalculadoraTexto(a,b,operador);
        System.out.println("Resultado: "+ calculadoraTexto.calcular());


        System.out.println("Introduce el nombre del producto y el precio base");
        String nombreProducto = scan.nextLine();
        double precioProducto = scan.nextDouble();
        FormateadorFactura formateadorFactura = new FormateadorFactura(nombreProducto,precioProducto,0.21);
        System.out.println(formateadorFactura.toString());
        scan.nextLine();

        System.out.println("Introduce tu ficha con este formato:\nNombre Apellido - YYYY-MM-DD - Ciudad");
        String ficha = scan.nextLine();
        String nombreApellidoFicha ="";

        String []fichaSeparada = ficha.trim().split(" - ");
        int length = fichaSeparada.length;
        System.out.println(length);


        nombreApellidoFicha = fichaSeparada[0].trim();
        String fechaNacimiento = fichaSeparada[1].trim();

        String ciudad = fichaSeparada[2].trim();
        String []nombresSeparados = nombreApellidoFicha.split(" +");
        String nombreFicha = nombresSeparados[0];
        String apellidoFicha = nombresSeparados[1];
        FichaPersonal fichaPersonal = new FichaPersonal(nombreFicha, apellidoFicha, fechaNacimiento, ciudad);
        System.out.println(fichaPersonal.mostrarFicha());

        System.out.println("Introduce usuario:");
       String usuarioRegistro= scan.nextLine();
        System.out.println("Introduce tu correo:");
       String correo= scan.nextLine();
        System.out.println("Introduce tu telefono con prefijo incluido:");
       String telefono = scan.nextLine();
        NormalizadorRegistro normalizadorRegistro = new NormalizadorRegistro(usuarioRegistro,correo,telefono);
        System.out.println(normalizadorRegistro.formatUsuario());
        System.out.println(normalizadorRegistro.formatCorreo());
        System.out.println(normalizadorRegistro.prefijoTel());
        System.out.println("Tu código asociado es:"+normalizadorRegistro.generarClave());







    }




    }
