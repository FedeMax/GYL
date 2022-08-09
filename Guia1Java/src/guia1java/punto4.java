/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia1java;
import java.util.Scanner;

public class punto4 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en C°");
        int C = leer.nextInt();
        int F = 32 + (9*C/5);
        System.out.println("Su equivalente en Farenheit es "+F);
    }
}
