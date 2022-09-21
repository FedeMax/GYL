/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej11;

import java.util.Date;
import java.util.Scanner;

public class POOEJ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();

        Date fecha = new Date();
        Date fechaActual = new Date();
        fecha.setDate(dia);
        fecha.setMonth(mes-1);
        fecha.setYear(anio+100);
        System.out.println(fecha.toString());
        System.out.println(fechaActual.toString());
    }

}
