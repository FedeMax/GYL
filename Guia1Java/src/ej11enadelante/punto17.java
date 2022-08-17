/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ej11enadelante;

import java.util.Scanner;
import java.util.Random;

public class punto17 {

    public static void main(String[] args) {

        int tama;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        tama = leer.nextInt();
        int[] vector = new int[tama];

        llenar(tama, vector);

        mostrar(tama, vector);
    }

    public static void llenar(int tama, int[] vector) {
        Random aleatorio = new Random();
        for (int i = 0; i < tama; i++) {
            vector[i] = aleatorio.nextInt(tama);
        }
    }

    public static void mostrar(int tama, int[] vector) {
        int digito = 0;
        int digito2 = 0;
        int digito3 = 0;
        int digito4 = 0;
        int digito5 = 0;
        for (int i = 0; i < tama; i++) {
            if (vector[i] < 10) {
                digito++;
            } else if (vector[i] >= 10 && vector[i] < 100) {
                digito2++;
            } else if (vector[i] >= 100 && vector[i] < 1000) {
                digito3++;
            } else if (vector[i] >= 1000 && vector[i] < 10000) {
                digito4++;
            } else {
                digito5++;
            }

        }
        System.out.println("Hay " + digito + " numeros de 1 digito");
        System.out.println("Hay " + digito2 + " numeros de 2 digito");
        System.out.println("Hay " + digito3 + " numeros de 3 digito");
        System.out.println("Hay " + digito4 + " numeros de 4 digito");
        System.out.println("Hay " + digito5 + " numeros de 5 digito");
        
    }
}