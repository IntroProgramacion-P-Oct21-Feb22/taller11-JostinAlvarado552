/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String mensaje = "";
        int opcion;
        System.out.printf("Ingrese (1) para obtener el Area de un Cuadrado,"
                + "(2) para obtener el Area de un Triangulo y "
                + "(3) para obtener el Area de un Rectangulo");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            mensaje = obtenerareacuadrado();
        } else {
            if (opcion == 2) {
                mensaje = obtenerareatriangulo();
            } else {
                if (opcion == 3) {
                    mensaje = obtenerarearectangulo();
                }
            }
        }
        System.out.printf("%s\n", mensaje);
    }
    public static String obtenerareacuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double area;
        String cadena = "";
        System.out.println("Ingrese el lado del cuadrado");
        lado = entrada.nextDouble();
        area = lado * lado;
        cadena = String.format("El area del cuadrado es : %s\n",
                area);
        return cadena;
    }

    public static String obtenerareatriangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        String cadena = "";
        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingresela altura del triangulo");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;
        cadena = String.format("El area del triangulo es : %s\n",
                area);
        return cadena;
    }

    public static String obtenerarearectangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        String cadena = "";

        System.out.println("Ingrese la base del rectangulo");
        base = entrada.nextDouble();

        System.out.println("Ingrese la altura del rectangulo");
        altura = entrada.nextDouble();

        area = (base * altura);
        cadena = String.format("El area del rectangulo es : %s\n",
                area);
        return cadena;
    }

}
