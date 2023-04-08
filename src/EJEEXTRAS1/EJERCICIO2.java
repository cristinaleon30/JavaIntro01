/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.

 */
package EJEEXTRAS1;

/**
 *
 * @author PC
 */
public class EJERCICIO2 {
    public static void main(String[] args) {
    int A = 5;
    int B = 10;
    int C = 15;
    int D = 20;
    int aux;
    
        System.out.println("valores iniciales de las variables");
        System.out.println("A = 5; B = 10; C = 15; D = 20");
        System.out.println(" ");
    aux = B;
     B = C;
     C = aux;
        System.out.println(" B = " +B);
        System.out.println(" ");
        
     aux = C;
     C = A;
     A = aux;
        System.out.println(" C = " + C);
        System.out.println(" ");
        
     aux = A;
     A = D;
     D = aux;
        System.out.println(" A = "+A);
        System.out.println(" ");
        
     aux = D;
     D = B;
     B = aux;
        System.out.println(" D = "+D);
        System.out.println(" ");
    }
}
