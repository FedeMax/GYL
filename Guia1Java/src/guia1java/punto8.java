/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package guia1java;

import java.util.Scanner;

public class punto8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra maximo de 8 caracteres");
        String frase = leer.nextLine();
        if (frase.length() > 8) {
            System.out.println("Incorrecto");
        } else {
            System.out.println("Correcto");

        }
    }
}
