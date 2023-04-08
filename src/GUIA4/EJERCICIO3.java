/*Crea una aplicación que a través de una función nos convierta 
una cantidad de euros introducida por teclado a otra moneda, 
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros,
la cantidad de euros y la moneda a convertir que será una cadena, 
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 
 */
package GUIA4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJERCICIO3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros");
        double euros = leer.nextDouble();
        
        System.out.println("A que moneda desea convertir? \n libras \n yenes \n dolar");
        String moneda = leer.next();
        conversor (euros,moneda );
    }
    
    public static void conversor(Double euros, String moneda){
        double resultado = 0;
        switch(moneda.toLowerCase()) {
            case  "libras":
                resultado = euros* 0.86;
            break; 
            case  "yenes":
                resultado = euros* 129.852;
            break; 
            case  "dolares":
                resultado = euros* 1.28611;
            break; 
            default:
                System.out.println("Ingreso una moneda incorrecta");
                
            
            
            
            }
        System.out.println(euros+" Euros son:  "+resultado);
           
            
            
        
    }
                
    }
   
