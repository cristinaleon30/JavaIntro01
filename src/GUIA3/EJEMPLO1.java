/*Implementar un programa que le pida dos números enteros al usuario y determine 
si ambos o alguno de ellos es mayor a 25.

 */
package GUIA3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJEMPLO1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
       
        System.out.println("Ingrese primer numero: ");
        num1= leer.nextInt();
        
        System.out.println("Ingrese segundo numero: ");
        num2 = leer.nextInt();
        
        if ( num1 >25 && num2 >25) { 
            System.out.println(num1+ num2+ " son mayores 25"); 
        }else if(num1 >25 && num2 <25){ 
            System.out.println(num1+" es mayor a 25");                
                    }else if(num1 <25 && num2 >25){
                        System.out.println(num2+"es mayor a 25");
        }else{
                        System.out.println("ninguno de los dos numeros son mayores a 25");
                    }

 }
} 