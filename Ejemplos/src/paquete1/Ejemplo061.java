/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java
        Scanner entrada = new Scanner(System.in);
        String dato;
        // arreglo de tipo entero 5 pero es valor de tipo cadena "string"
        String[] arreglo1 = new String[5]; //  se guardaran nombres de personas
        
        // Se asigna valores al arreglo, pidiendo valores por teclado
        // se usa un ciclo repetitivo
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Ingrese un valor para el arreglo");
            dato = entrada.nextLine();
            // se asigna la variable dato a la posición del arreglo
            // de acuerdo al valor de i
            arreglo1[i] = dato;
        }
        
        // Se hace uso del ciclo repetitivo for para recorrer el arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.printf("Subíndice o Índice %d, con valor %s\n",
                    i, arreglo1[i]);
        }
        
    }

}
