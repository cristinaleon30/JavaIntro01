/*Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
 */
package GUIA2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJERCICIO5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        int numDoble = num * 2;
        int numTriple = num * 3;       
        double raizCuadrada = Math.sqrt(num);
        System.out.println("Su doble es: "+ numDoble);
        System.out.println("Su triple es: "+ numTriple);
        System.out.println("Su raiz cuadrada es: "+ raizCuadrada);
                
    }
}
