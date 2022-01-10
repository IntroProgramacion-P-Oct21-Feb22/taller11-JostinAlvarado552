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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese (1) para calcular el valor a pagar de luz"
                + " o ingrese (2)para calcular el predio de un inmueble");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            calcularvalorluz();
        } else {
        }
        if (opcion == 2) {
            calcularpredio();
        }
    }

    public static void calcularvalorluz() {
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        System.out.println("Ingrese su nombre y apellido");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su numero de cèdula");
        int cedula = entrada.nextInt();
        System.out.println("Ingrese el costo del kilovatio");
        double costokilovatio = entrada.nextDouble();
        System.out.println("Ingrese los kilovatios consumidos en el mes");
        double kilovatiosmes = entrada.nextDouble();
        double valorpagar = costokilovatio * kilovatiosmes;
        cadena = String.format("%sCliente %s cedula %d "
                + "debe cancelar el valor de $%.2f",
                cadena,
                nombre,
                cedula,
                valorpagar);
        System.out.printf("%s", cadena);
    }

    public static void calcularpredio() {
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        System.out.println("Ingrese su nombre y apellido");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su numero de cèdula");
        int cedula = entrada.nextInt();
        System.out.println("Ingrese el costo del inmueble");
        double costoinmueble = entrada.nextDouble();
        double predio = (costoinmueble * 2) / 100;
        cadena = String.format("%sCliente %s cedula %d tiene un bien inmueble "
                + "valorado en $%.2f y tiene que pagar de predio $%.2f",
                cadena,
                nombre,
                cedula,
                costoinmueble,
                predio);
        System.out.printf("%s", cadena);
    }
}
