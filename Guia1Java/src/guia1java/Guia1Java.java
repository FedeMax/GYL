
package guia1java;
import java.util.Scanner;
public class Guia1Java {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
     
        System.out.println("Ingrese dos numeros por teclado");
        int num = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num+num2;
        System.out.println("La Suma de ambos valores son: " +suma);
    }
    
}
