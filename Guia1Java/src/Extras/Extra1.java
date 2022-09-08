/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package Extras;

import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
     
        int minutos,horas,horas2,dias;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tiempo a calcular en minutos");
        minutos= leer.nextInt();
        horas=minutos/60;
        dias= Math.floorDiv(horas, horas);
        horas2=(minutos-dias*24*60)/60;
        System.out.println("Son "+dias+" Dias "+horas2+" Horas ");
        
    }
}
