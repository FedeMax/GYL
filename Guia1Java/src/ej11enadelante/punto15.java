/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package ej11enadelante;

public class punto15 {

    public static void main(String[] args) {

        int[] cien = new int[100];

        mostrar(cien);

    }

    public static void mostrar(int cien[]) {

        for (int i = 100; i > 0; i--) {
            cien[i - 1] = i;
            System.out.println(cien[i - 1]);;

        }

    }
}
