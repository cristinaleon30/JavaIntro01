/*Crea una aplicación que nos pida un número por teclado y 
con una función se lo pasamos por parámetro para que nos
indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 
y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es 
divisible entre 5, sin embargo, 17 si es primo.

 
 */
package GUIA4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJERCICIO4 {
  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int numero = leer.nextInt();
              
        System.out.println("El numero ingresado es primo ? " + esPrimo (numero));
        }
    
    public static boolean esPrimo(int numero){
        int contador = 0;
        boolean primo = false;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0){
                contador = contador + 1;
              
            } 
           
            
        }
         if  (contador == 2){
                primo = true;
            }                 
        return primo;
    }
            
}

