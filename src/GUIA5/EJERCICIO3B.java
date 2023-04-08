/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJERCICIO3B {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int cifra1 =0, cifra2 =0, cifra3=0, cifra4=0, cifra5=0;
        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();
        int [] vector = new int [tam];
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese numeros aleatorios entre 1 y 5 cifras");
            vector[i] = leer.nextInt();
            int aux = 0;
            int cont = 0;
            while (vector[i]>0) {
                aux = vector[i]/10;
                vector[i] = aux;
                cont++;
            }
            switch (cont) {
                case 1:
                    cifra1++;
                    break;
                case 2:
                    cifra2++;
                    break;
                case 3:
                    cifra3++;
                    break;
                case 4:
                    cifra4++;
                    break;
                case 5:
                    cifra5++;                    
                    break;
                
            }
        }
        System.out.println("Cantidad de numero de 1 cifra "+cifra1);
        System.out.println("Cantidad de numero de 2 cifras "+cifra2);
        System.out.println("Cantidad de numero de 3 cifras "+cifra3);
        System.out.println("Cantidad de numero de 4 cifras "+cifra4);
        System.out.println("Cantidad de numero de 5 cifras "+cifra5);
    }
} 


