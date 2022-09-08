/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej07;

import Service.PersonaService;
import java.util.Scanner;

public class POOEJ07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int gente;
        int imc =0;int mayores=0;
        
        System.out.println("Indique cuantas personas desea crear");
        Scanner leer = new Scanner(System.in);
        gente= leer.nextInt();
        for (int i = 0; i < gente; i++) {
           
            PersonaService alguien = new PersonaService();
            
            alguien.crearPersona();
            imc +=alguien.calcularMC();
           if (alguien.mayorDeEdad()){
               mayores++;
           }
            System.out.println("");
        }
        System.out.println("Cantidad de personas lejos del rango de peso "+ imc*100/gente+"%");
        System.out.println("Hay "+mayores+" personas con mayoria de edad");
    }

}
