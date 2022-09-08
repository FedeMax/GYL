/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package Extras;

import java.util.Scanner;

public class Extra4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 10");
        System.out.println("Y se mostrara su eqivalente en romano");
        int num;
        do {
            num = leer.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Su equivalente es I");
                    break;
                case 2:
                    System.out.println("Su equivalente es II");
                    break;
                case 3:
                    System.out.println("Su equivalente es III");
                    break;
                case 4:
                    System.out.println("Su equivalente es IV");
                    break;
                case 5:
                    System.out.println("Su equivalente es V");
                    break;
                case 6:
                    System.out.println("Su equivalente es VI");
                    break;
                case 7:
                    System.out.println("Su equivalente es VII");
                    break;
                case 8:
                    System.out.println("Su equivalente es VIII");
                    break;
                case 9:
                    System.out.println("Su equivalente es IX");
                    break;
                case 10:
                    System.out.println("Su equivalente es X");
                    break;
                default:
                    System.out.println("EL Numero no esta dentro del rango establecido");
                    break;
            }
        } while (num < 11 && num > 0);
    }

}
