/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
    1   0   4       ---->       1   0   6
    0   5   0       ---->       0   5   0
    6   0  -9       ---->       4   0  -9
 */
package ej11enadelante;

import java.util.Random;

public class punto18 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        llenar(matriz);
        System.out.println("");
        mostrar(matriz);
    }

    public static int[][] llenar(int[][] matriz) {

        Random aleatorio = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = aleatorio.nextInt(10);
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

            }
        }
    }
}
