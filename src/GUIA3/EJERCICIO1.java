/*Crear un programa que dado un número determine si es par o impar.
*/
package GUIA3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJERCICIO1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = leer.nextInt();
        
        if(numero % 2 == 0) {
            System.out.println(numero+" Es un numero par");
        }else{
            System.out.println(numero+" Es un numero impar");
            
        }
        
    }
}
