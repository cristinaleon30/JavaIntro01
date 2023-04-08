/*Recorrer un vector de N enteros contabilizando
cuántos números son de 1 dígito, cuántos de 2 dígitos,
etcétera (hasta 5 dígitos).

 
 */
package GUIA5;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJERCICIO3 {
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cifra1 = 0, cifra2 = 0, cifra3 = 0, cifra4 = 0, cifra5 = 0;
            System.out.println("Ingrese el tamaño del vector");
            int tam = leer.nextInt();
            int[] vector = new int[tam];
            for (int i = 0; i < tam; i++) {
                System.out.println("Ingrese numeros aleatorios entre 1 y 5 cifras");
                vector[i] = leer.nextInt();
                int aux = 0;
                int cont = 0;
                while (vector[i]>0){
                    aux = vector[i]/10;
                    vector[i] = aux;
                    cont ++;
                }
                switch(cont){
                    case 1:
                        cifra1 = cifra1 + 1;
                        break;
                    case 2:
                        cifra2 = cifra2 + 1;
                        break; 
                    case 3:
                        cifra3 = cifra3 + 1;
                        break; 
                    case 4:
                        cifra4 = cifra4 + 1;
                        break;
                    case 5:
                        cifra5 = cifra5 + 1;
                        break;    
                    
                }
            }
            System.out.println("Cantidad de numeros de 1 cifra "+cifra1);
            System.out.println("Cantidad de numeros de 2 cifra "+cifra2);
            System.out.println("Cantidad de numeros de 3 cifra "+cifra3);
            System.out.println("Cantidad de numeros de 4 cifra "+cifra4);
            System.out.println("Cantidad de numeros de 5 cifra "+cifra5);
        
    }
}
