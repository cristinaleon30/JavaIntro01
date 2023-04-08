/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
 
 */
package EJEEXTRAS1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJERCICIO4 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int opcion;
    System.out.println("Ingrese un numero entre el 1 y el 10:");
    opcion = leer.nextInt();
    switch (opcion) {
    case 1:
    System.out.println("En numero romano es = I ");
    break;
    case 2:
    System.out.println("En numero romano es = II");
    break;
    case 3:
    System.out.println("En numero romano es = III");
    break;
    case 4:
    System.out.println("En numero romano es = IV");
    break;
    case 5:
    System.out.println("En numero romano es = V");
    break;
    case 6:
    System.out.println("En numero romano es = VI");
    break;
    case 7:
    System.out.println("En numero romano es = VII");
    break;
    case 8:
    System.out.println("En numero romano es = VIII");
    break;
    case 9:
    System.out.println("En numero romano es = IX");
    break;
    case 10:
    System.out.println("En numero romano es = X");
    break;
    
    
}
}
}
