/*Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */
package GUIA2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJERCICIO1 {
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese segundo numero");
        int num2 = leer.nextInt();
        int result =  num1 +  num2;  
        System.out.println("El resultado de la suma es:"+ result);
       }
}
