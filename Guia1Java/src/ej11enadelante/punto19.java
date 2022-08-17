/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
      Matriz                Matriz Trazpuesta
    0  -2   4       ---->       0   2  -4
    2   0   2       ---->      -2   0  -2    <----M. antisimetrica
   -4  -2   0       ---->       4   2   0
 */
package ej11enadelante;

import java.util.Random;

public class punto19 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        /*matriz[0][0]=0;
        matriz[0][1]=-2;
        matriz[0][2]=4;
        matriz[1][0]=2;
        matriz[1][1]=0;
        matriz[1][2]=2;
        matriz[2][0]=-4;
        matriz[2][1]=-2;
        matriz[2][2]=0;*/
        llenar(matriz);//Si se desea comprobar una matriz trazpuesta antisimetrica descomentar las matrices inicializadas y comentar el subproceso llenar                   
        System.out.println("");
        mostrar(matriz);
    }

    public static int[][] llenar(int[][] matriz) {

        //Random aleatorio = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * (-10 - (10) + 1) + 10);
                System.out.print(" " + matriz[i][j] + " ");
                if (j == 2) {
                    System.out.println("");
                }
            }
        }
        return matriz;
    }

    public static void mostrar(int[][] matriz) {
        int[][] matriz2 = new int[3][3];
        int contador = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[j][i] = matriz[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matriz2[i][j] + " ");
                if (j == 2) {
                    System.out.println("");
                }
                if (matriz[i][j] == matriz2[i][j] * -1) {
                        contador++;
                    }
            }
        }
        if(contador==9){
            System.out.println("Es una matriz antisimetrica");
        }else System.out.println("No es antisimetrica");
    }
}
