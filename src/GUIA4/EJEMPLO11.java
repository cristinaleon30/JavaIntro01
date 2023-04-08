/*Escribir un programa que procese una secuencia de caracteres ingresada
por teclado y terminada en punto, y luego codifique la palabra o frase 
ingresada de la siguiente manera: cada vocal se reemplaza por el carácter
que se indica en la tabla y el resto de los caracteres (incluyendo a las 
vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres
y retorne la codificación correspondiente. Utilice la estructura
“según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 
 */
package GUIA4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJEMPLO11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra;
        do {
            System.out.println("Ingrese una secuencia de caracteres que termine en punto: ");
            palabra = leer.next();
             }while(!palabra.endsWith("."));
             codificador(palabra);
        
    }
    public static void codificador(String palabra){
        String auxiliar = "";
        for (int i = 0; i < palabra.length(); i++) {
            switch(palabra.substring(i,i+1)){
                case "a":
                case "A":
                    auxiliar += "@";
                    break;
                case "e":
                case "E":
                    auxiliar += "#";
                    break;
                case "i":
                case "I":
                    auxiliar += "$";
                    break;
                case "o":
                case "O":
                    auxiliar += "%";
                    break;
                case "u":
                case "U":
                    
                    /* se puede asi: auxiliar = auxiliar.concat("*) o tambien asi
                    auxiliar = auxiliar + "*"; o asi auxliar +="*"; */
                    auxiliar += "*";
                default:
                    auxiliar +=palabra.substring(i,i+1);
                    
            }
        }
        System.out.println("la palabra modificada es: "+ auxiliar);
    }
    
}
       


        
       
    