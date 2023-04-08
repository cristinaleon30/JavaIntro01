/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJEMPLO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Maria";
        boolean bandera = true;
        char longitud = 0;
        int numero;
        byte enteros = 0;
        double decimales;
       
        System.out.println("Tu nombre es: "+ nombre);
        System.out.println("Ingrese un numero: ");
        Scanner num = new Scanner(System.in);
        numero = num.nextInt();
        System.out.println("El numero es: "+ numero);
         System.out.println("Ingrese un numero decimal: ");
        Scanner dec = new Scanner(System.in);
        decimales = dec.nextDouble();
        System.out.println("El numero decimal es: "+ decimales);
        
        
    }
    
}
