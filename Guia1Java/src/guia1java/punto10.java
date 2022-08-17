/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package guia1java;

import java.util.Scanner;

public class punto10 {

    public static void main(String[] args) {

        int limite;
        int suma = 0;
        //int valor;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un valor limite");
        limite = leer.nextInt();
        do {
            System.out.println("Ingrese un valor");
            suma += leer.nextInt();
            }
        while(suma<limite);
        System.out.println("El valor sumado es "+ suma + " El limite era "+ limite);
    }
}


