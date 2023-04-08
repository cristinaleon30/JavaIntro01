/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 
 */
package EJEEXTRAS1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJERCICIO1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int minutos, dias, horas;
        
        System.out.println("Ingrese el total de minutos que desea convertir: ");
        minutos = leer.nextInt();
        
        horas = minutos/60;
        dias = minutos/24;
        
        System.out.println("");
        System.out.println("dias: "+ dias);
        System.out.println("horas: "+ horas);
    }
  
}
