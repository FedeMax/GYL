/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Scanner;
import java.util.Date;

public class PersonaService {

    Persona alguien = new Persona();
    Scanner leer = new Scanner(System.in);
    Date fecha = new Date();
    Date fechaActual = new Date();

    public void crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        alguien.setNombre(leer.nextLine());
        System.out.println("Ingrese la fecha de nacimiento");
        System.out.print("Dia: ");
        alguien.setDia(leer.nextInt());
        System.out.print("Mes: ");
        alguien.setMes(leer.nextInt());
        System.out.print("Año(se toma a partir del 1900): ");
        alguien.setAnio(leer.nextInt());
        fecha.setDate(alguien.getDia());
        fecha.setMonth(alguien.getMes());
        fecha.setYear(alguien.getAnio());
    }

    public void calcularEdad() {
        System.out.println("");
        System.out.println("La fecha actual es " + fechaActual.getDay() + "/" + fechaActual.getMonth() + "/" + (fechaActual.getYear() - 100));
        alguien.setEdad((fechaActual.getYear() - fecha.getYear()));
        System.out.println("La edad de la persona es " + alguien.getEdad());
        menorQue(alguien.getEdad());
    }

    public void menorQue(int edad) {
        System.out.println("");
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
    }

    public void mostrarPersona() {
        System.out.println("Nombre:" + alguien.getNombre());
        System.out.println(fecha.getDate() + "/" + fecha.getMonth() + "/" + fecha.getYear());
    }
}
