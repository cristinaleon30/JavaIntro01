/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */
package GUIA3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJERCICIO2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        String frase1 = "eureka";
        if (frase.equals(frase1)) {
            System.out.println("CORRECTO");
            
        }else{
            System.out.println("INCORRECTO");
        }
    }
}
