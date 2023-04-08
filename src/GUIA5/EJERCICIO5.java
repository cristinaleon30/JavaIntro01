/*Realice un programa que compruebe si una matriz dada es antisimétrica. Se
  dice que una matriz A es antisimétrica cuando ésta es igual a su propia
  traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
  La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
  sus filas por columnas (o viceversa).

 */
package GUIA5;
public class EJERCICIO5 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        // Rellenar la matriz con valores aleatorios
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                matriz1[j] = (int) (Math.random() * 10);
            }
        }
        // Mostrar la matriz original
        System.out.println("Matriz original:");
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
        // Calcular la traspuesta cambiada de signo
        int[][] traspuestaCambiadaDeSigno = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                traspuestaCambiadaDeSigno[j][i] = -matriz[i][j];
            }
        }
        // Mostrar la traspuesta cambiada de signo
        System.out.println("Traspuesta cambiada de signo:");
        for (int[] traspuestaCambiadaDeSigno1 : traspuestaCambiadaDeSigno) {
            for (int j = 0; j < traspuestaCambiadaDeSigno.length; j++) {
                System.out.print(traspuestaCambiadaDeSigno1[j] + " ");
            }
            System.out.println();
        }
    }
}

