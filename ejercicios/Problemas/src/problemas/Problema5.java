/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema5 {
     public static void main(String[] args) {
      
      sumaarreglo();
     }

    public static void sumaarreglo() {
       String cadena = "";
       int suma = 0;
       int[][]informacion = {{1,2,3},{10,20,30},{100,200,300}};
        for (int i = 0; i < informacion.length; i++) {           
            for (int j = 0; j < informacion.length; j++) {
                suma = suma + informacion[i][j];
                    cadena = String.format("%s",suma);
                
            }
        }
        System.out.println(cadena);
    }
}
 