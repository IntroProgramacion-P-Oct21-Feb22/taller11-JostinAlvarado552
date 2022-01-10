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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje = obtenerpromediocualitativo();
        System.out.printf("%s", mensaje);
    }

    public static String obtenerpromediocualitativo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double suma;
        double promedio;

        String cadena;
        String cualitativo = "";

        System.out.println("Ingrese la primera nota");
        double nota1 = entrada.nextDouble();
        System.out.println("Ingrese la primera nota");
        double nota2 = entrada.nextDouble();
        System.out.println("Ingrese la primera nota");
        double nota3 = entrada.nextDouble();
        System.out.println("Ingrese la primera nota");
        double nota4 = entrada.nextDouble();

        suma = nota1 + nota2 + nota3 + nota4;
        promedio = suma / 4;

        if (promedio >= 0 && promedio <= 5) {
            cualitativo = "es Regular";
        } else {
            if (promedio > 5 && promedio <= 8) {
                cualitativo = "es Bueno";
            } else {
                if (promedio > 8 && promedio <= 9) {
                    cualitativo = "es Muy Bueno";
                } else {
                    if (promedio > 9 && promedio <= 10) {
                        cualitativo = "es Sobresaliente";
                    }
                }
            }
        }

        cadena = String.format("El promedio de las notas: %.2f, %.2f, %.2f, %.2f, %s\n",
                nota1, nota2, nota3, nota4, cualitativo);
        return cadena;
    }
}
