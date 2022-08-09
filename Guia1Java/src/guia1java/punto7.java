/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package guia1java;
import java.util.Scanner;
public class punto7 {
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String Frase = leer.nextLine(); String bien = "eureka";
        if (Frase.equals(bien)){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
        
    }
}
