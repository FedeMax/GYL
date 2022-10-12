/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;
import Utilidades.Comparadores;
import java.util.Collections;

public class PeliculaServicio {

    ArrayList<Pelicula> lista;
    Scanner leer;

    public PeliculaServicio() {
        this.lista = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void pedirDatos() {
        System.out.println("Ingrese el Titulo de la pelicula");
        String nombre = leer.next().toUpperCase();
        System.out.println("Ingrese el Director");
        String director = leer.next().toUpperCase();
        System.out.println("Indique la duracion de la pelicula en horas");
        int tiempo = leer.nextInt();
        lista.add(new Pelicula(nombre, director, tiempo));
        System.out.println("Desea agregar otra pelicula");
        String seguir = leer.next();
        if (seguir.equalsIgnoreCase("si")) {
            pedirDatos();
        }
    }

    public void mostrarPeliculas() {
        for (Pelicula index : lista) {
            System.out.println(index);
        }
    }

    public void masDeUnaHora() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        ArrayList<Pelicula> mayora1hora = new ArrayList<>();
        System.out.println("Peliculas mayor a 1 hora");
        for (Pelicula indice : lista) {
            if (indice.getDuracion() > 1) {
                mayora1hora.add(indice);
            }
        }
        for (Pelicula pelicula : mayora1hora) {
            System.out.println(pelicula.getTitulo());
        }
    }

    public void ordenarDeMenorAMayor() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Se ordenaran de menor a mayor");
        Collections.sort(lista, Comparadores.mayorAMenor);
        for (Pelicula pelicula : lista) {
            System.out.println(pelicula);
        }
    }

    public void mayorAMenor() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Se ordenaran de mayor a menor");
        Collections.reverse(lista);
        for (Pelicula pelicula : lista) {
            System.out.println(pelicula);
        }
    }

    public void porTitulo() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Se ordenaran por titulo");
        Collections.sort(lista, Comparadores.porTitulo);
        for (Pelicula pelicula : lista) {
            System.out.println(pelicula);
        }
    }

    public void porDirector() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Se ordenaran por director");
        Collections.sort(lista, Comparadores.porDirector);
        for (Pelicula pelicula : lista) {
            System.out.println(pelicula);
        }
    }
}
