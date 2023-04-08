/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 
 */
package GUIA3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJERCICIO8 {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del cuadrado: ");
        int numero = leer.nextInt();
       
        if(numero>= 0 && numero<= 50){
            for(int i = 0; i < numero; i++) {
                System.out.print("*");
            }
            System.out.println(); 
            
            for(int i = 0; i <  numero-2; i++) {
                System.out.print("*");
                for(int j = 0; j <  numero-2; j++) {
                System.out.print(" ");
            }
                 System.out.println("*");
   }
            for(int i = 0; i < numero; i++) {
                System.out.print("*");
            }
            
    }
        System.out.println(" ");
    }
}
