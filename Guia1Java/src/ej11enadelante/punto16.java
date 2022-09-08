/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ej11enadelante;

import java.util.Scanner;
import java.util.Random;

public class punto16 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tama = leer.nextInt();
        int num;
        int[] vector = new int[tama];

        llenador(vector, tama);

        System.out.println("Ingrese el numero a buscar en el vector");
        num = leer.nextInt();

        buscar(num, vector, tama);
    }

    public static void llenador(int vector[], int tama) {
        Random aleatorio = new Random();
        for (int i = 0; i < tama; i++) {
            vector[i] = aleatorio.nextInt(tama);
        }
    }

    public static void buscar(int num, int vector[], int tama) {

        int contador = 0;
        for (int i = 0; i < tama; i++) {
            if (vector[i] == num) {
                System.out.println("El numero " + num + " se encuentra en la posicion " + i);
                contador++;
            }
            if (contador == 0 && i == tama - 1) {
                System.out.println("No se encuentra el numero en el vector");
            }
        }
    }
}
