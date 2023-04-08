/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.

 */
package EJEEXTRAS1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJERCICIO3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         
        System.out.println("Ingrese una letra");
            String letra = leer.next(); 
            
            if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u") ) {
                System.out.println(letra +" Es una vocal");
            }
            else{
                System.out.println(" NO ES VOCAL");
            }
            
            
    }
    
}
