/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package ej11enadelante;

import java.util.Scanner;

public class punto11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int num2;
        int selector;
        String si = "n";
        System.out.println("Ingrese dos numeros");
        num = leer.nextInt();
        num2 = leer.nextInt();
        do {
            System.out.println("Ingrese que desea realizar");
            System.out.println("1)Sumar");
            System.out.println("2)Restar");
            System.out.println("3)Multiplicar");
            System.out.println("4)Dividir");
            System.out.println("5)Salir");
            selector = leer.nextInt();
            switch (selector) {
                case 1:
                    System.out.println("La suma de los numeros es " + num + num2);
                    break;
                case 2:
                    System.out.println("La resta de los numeros es " + (num - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es " + (num * num2));
                    break;
                case 4:
                    System.out.println("La division es " + (num / num2));
                    break;
                case 5:
                    System.out.println("Seguro que desea salir?");
                    System.out.println("Ingrese S para salir y N para volver al menu");
                    si = leer.next();
                    if (si.equals("s")) {
                        break;
                    } else  break;
                    
            }
        }while (!si.equals("s"));
    }
}
