/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones03;

import Service.AlumnoService;
import java.util.Scanner;

public class Colecciones03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        AlumnoService as = new AlumnoService();
        Scanner leer = new Scanner(System.in);
        
        as.crearLista();
        as.mostrarlista();
        System.out.println("Ingrese el alumno del que desee saber la nota final");
        String nombre = leer.next();
        as.notaFinal(nombre);
    }
    
}
