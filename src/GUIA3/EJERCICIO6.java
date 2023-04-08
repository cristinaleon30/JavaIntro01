/*Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.

 
 */
package GUIA3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJERCICIO6 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese dos numeros enteros");
            int num1 = leer.nextInt();
            int num2 = leer.nextInt();
            
            boolean salida = true;
            
            do {
                System.out.println("Que desea hacer");
                System.out.println("Menu \n 1-Sumar \n 2-Restar \n 3-Multiplicar \n 4-Dividir \n 5-Salir \n Elija opción:" );
                int eleccion = leer.nextInt();
                
                switch (eleccion){
                    case 1: 
                        System.out.println("La suma de los numeros es: " + (num1 + num2)); 
                        break;
                    case 2:
                        System.out.println("La resta de los numeros es: " + (num1 - num2));
                        break;
                    case 3: 
                        System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
                        break;
                    case 4:
                        System.out.println("La division de los numeros es: " + (num1 / num2));
                        break;
                    case 5:
                        System.out.println("Desea salir? S/N");
                            String eleccion2 = leer.next();
                            if ("S".equalsIgnoreCase(eleccion2)) {
                                salida = false;
                            }
                }
                    
                
           }while (salida);
    }


}
