/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 
 */
package GUIA2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJERCICIO2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tu nombre");
         String nombre = leer.next();
         
         System.out.println(nombre);
    }
    
}
