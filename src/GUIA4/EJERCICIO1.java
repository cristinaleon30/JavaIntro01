/*Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática
y deben devolver sus resultados para imprimirlos en el main. 
 
 */
package GUIA4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJERCICIO1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       double n1;
       double n2;
      
        System.out.println("Ingrese primer numero: ");
         n1 = leer.nextDouble();
        
        System.out.println("Ingrese segundo numero: ");
         n2  = leer.nextDouble();
         
        System.out.println("Que operacion desea realizar? \n suma \n resta \n multiplicacion \n division");
        String operacion = leer.next();
        
          switch (operacion.toLowerCase()){
             case "suma":
                 sumar(n1, n2);
                 break;
                 
             case "resta":
                 restar (n1, n2);
                 break;
             case "multiplicacion":
                 multiplicar (n1, n2);
                 break;
             case "division":
                 dividir (n1, n2);
                 break;
            
                 
         }
                
        
 }
    public static double sumar(double n1, double n2) {
    	double suma;
    	suma = n1 + n2;
         System.out.println("El resultado de la suma es : "+suma);
    	return suma;
         
    }
    
    public static double restar(double n1, double n2) {
    	double resta;
    	resta = n1 - n2;
         System.out.println("El resultado de la resta es : "+resta);
    	return resta;
	}
    public static double multiplicar(double n1, double n2) {
    	double multiplicacion;
    	multiplicacion =  n1 * n2;
         System.out.println("El resultado de la multiplicacion es : "+ multiplicacion);
    	return multiplicacion;
	}
    public static double dividir(double n1, double n2) {
    	double division;
    	division = n1 / n2;
         System.out.println("El resultado de la division es : "+division);
    	return division;
	}

}
