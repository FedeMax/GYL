/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package guia1java;
import java.util.Scanner;
public class punto5 {
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        System.out.println("Su doble es "+ num*2 + " Su triple es "+ num*3 + " Su raiz cuadrada es "+ Math.sqrt(num));
    }
}
