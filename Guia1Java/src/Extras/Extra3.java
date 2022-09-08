/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package Extras;


import java.util.Scanner;

public class Extra3 {

    public static void main(String[] args){

        Scanner leer = new Scanner(System.in);
        String letra;
        
        do{
            System.out.println("Ingrese una letra que no sea una vocal");
            letra= leer.next().substring(0,1);
        }while(!letra.equalsIgnoreCase("A") && !letra.equalsIgnoreCase("e") && !letra.equalsIgnoreCase("i") && !letra.equalsIgnoreCase("o") && !letra.equalsIgnoreCase("u"));
        System.out.println("Si estas leyndo esto ingresate una voal");
        System.out.println("SO TONTO");
        
      
    
    }

}
