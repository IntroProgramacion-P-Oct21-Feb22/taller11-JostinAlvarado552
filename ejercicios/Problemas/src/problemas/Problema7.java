/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        String[] ciudades;
        ciudades = obtenerDatos();
        conteo(ciudades);
    }

    public static String[] obtenerDatos() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite = 0;
        System.out.println("Ingrese limite de ingreso de datos");
        limite = entrada.nextInt();
        entrada.nextLine();
        String[] arregloResultante = new String[limite];
        for (int i = 0; i < limite; i++) {
            System.out.println("Ingrese ciudad del Ecuador");
            arregloResultante[i] = entrada.nextLine();
        }
        return arregloResultante;
    }

    public static void conteo(String[] ciudades) {
        int num;
        String cadena = "";
        for (int i = 0; i < ciudades.length; i++) {
            num = ciudades[i].length();
            if (num == 4 || num == 5) {
                cadena = String.format("%s, %s", cadena, ciudades[i]);
            }
        }
        System.out.printf("Las ciudades con 4 o 5 letras son:%s\n",cadena);
    }
}
