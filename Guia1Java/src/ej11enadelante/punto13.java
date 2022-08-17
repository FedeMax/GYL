/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package ej11enadelante;

import java.util.Scanner;

public class punto13 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado");
        int tama = leer.nextInt();

        for (int i = 0; i < tama; i++) {
            for (int j = 0; j < tama; j++) {
                if (i == 0 || i == (tama - 1)) {
                    System.out.print(" * ");
                } else if (i != 0 && i < tama) {
                    if (j == 0 || j == (tama - 1)) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
                if (j == tama - 1) {
                    System.out.println("");
                }

            }

        }

    }
}
