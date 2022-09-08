/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Scanner;
import Entidad.Persona;

/**
 *
 * @author Mega
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in);
    //Persona a1 = new Persona();

    String nombre;
    int edad;
    String sexo;
    int peso;
    double altura;

    public void crearPersona() {

        System.out.println("Ingrese los datos de la persona");
        System.out.print("Nombre :");
        nombre = leer.next();
        System.out.print("Edad : ");
        edad = leer.nextInt();
        System.out.println("H : Hombre , M : Mujer , O : Otro");
        System.out.print("Sexo : ");
        sexo = leer.next();
        if (sexo.equals("h")) {
            //System.out.println("Hombre");
        } else if (sexo.equals("m")) {
            //System.out.println("Mujer");
        } else if (sexo.equals("o")) {
            //System.out.println("Otro");
        } else {
            System.out.println("Error");
        }
        System.out.print("Peso :");
        peso = leer.nextInt();
        System.out.print("Altura : ");
        altura = leer.nextDouble();
        altura = altura / 100;
        new Persona(nombre, edad, sexo, peso, altura);
        System.out.println("");

    }

    public int calcularMC() {

        int devolver;
        double imc = peso / Math.pow(altura, 2);
        System.out.print("Indice de Masa Corporal : " + imc);
        if (imc > 25) {
            System.out.println(" Sobrepeso");
            
            return devolver=1;
        } else if (imc <= 25 && imc >= 20) {
            System.out.println(" Peso Ideal");
           
            return  devolver=0;
        } else {
            System.out.println(" Debajo del Peso Ideal");
            
            return devolver=1;
        }
}
    public boolean mayorDeEdad() {
        boolean mayor ;
        
        System.out.println("");
        if (edad >= 18) {
            
            System.out.println("Es mayor de edad");
            return mayor=true;
        } else {
            System.out.println("Es menor de edad");
            return mayor= false;
        }
    }
}

