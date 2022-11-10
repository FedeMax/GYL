/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones01;

import java.util.Scanner;
import Entidad.Persona;
import Entidad.Perro;

public class Relaciones01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Perro perro1 = new Perro();
        Persona persona2 = new Persona();
        Perro perro2 = new Perro();
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los datos de la primera persona");
        System.out.println("Nombre");
        persona1.setNombre(leer.next());
        System.out.println("Ingrese el apellido");
        persona1.setApellido(leer.next());
        System.out.println("Ingrese la edad");
        persona1.setEdad(leer.nextInt());
        System.out.println("Ingrese el documento");
        persona1.setDocumento(leer.nextInt());
        System.out.println("Ingrese los datos del perro de la persona\nNombre:");
        perro1.setNombre(leer.next());
        System.out.println("Raza");
        perro1.setRaza(leer.next());
        System.out.println("Edad");
        perro1.setEdad(leer.nextInt());
        System.out.println("Tamaño");
        perro1.setTamano(leer.next());
        persona1.setPerro(perro1);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ingrese los datos de la segunda persona");
        System.out.println("Nombre");
        persona2.setNombre(leer.next());
        System.out.println("Ingrese el apellido");
        persona2.setApellido(leer.next());
        System.out.println("Ingrese la edad");
        persona2.setEdad(leer.nextInt());
        System.out.println("Ingrese el documento");
        persona2.setDocumento(leer.nextInt());
        System.out.println("Ingrese los datos del perro de la persona\nNombre:");
        perro2.setNombre(leer.next());
        System.out.println("Raza");
        perro2.setRaza(leer.next());
        System.out.println("Edad");
        perro2.setEdad(leer.nextInt());
        System.out.println("Tamaño");
        perro2.setTamano(leer.next());
        persona2.setPerro(perro2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Datos de la primera persona");
        System.out.println(persona1.toString());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Datos de la segunda persona");

        System.out.println(persona2.toString());
    }

}
