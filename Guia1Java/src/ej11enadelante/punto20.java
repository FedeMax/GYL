/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ej11enadelante;

import java.util.Scanner;

public class punto20 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        llenar(matriz);
        comprobar(matriz);
    }

    public static void llenar(int[][] matriz) {
        int num;
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("Ingrese un numero para rellenar la matriz ");
                    num = leer.nextInt();
                } while (num < 0 && num > 10);
                matriz[i][j] = num;
            }

        }
    }

    public static void comprobar(int[][] matriz) {
        int fila = 0, fila2 = 0, fila3 = 0;
        int columna = 0, columna2 = 0, columna3 = 0;
        int diagonal = 0, diagonal2 = 0;
        int contador = 0, contador2 = 2;
        for (int i = 0; i < 3; i++) {
            diagonal += matriz[contador][contador];
            diagonal2 += matriz[contador][contador2];
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    fila += matriz[0][j];
                    columna += matriz[j][i];
                } else if (i == 1) {
                    fila2 += matriz[1][j];
                    columna2 += matriz[j][i];
                } else {
                    fila3 += matriz[2][j];
                    columna3 += matriz[j][i];
                }
                System.out.print(" "+matriz[i][j]+" ");
            }
            contador++;
            contador2--;
            System.out.println("");
        }
        if(diagonal==diagonal2 && fila==fila2 && fila==fila3 && columna==columna2 && columna==columna3){
            System.out.println("Es un cubo magico");
        }else System.out.println("No es un cubo magico");
    }
}
