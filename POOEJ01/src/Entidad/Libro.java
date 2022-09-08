/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

public class Libro {

    public int ISBN;
    public String Titulo;
    public String Autor;
    public int Npag;

    public Libro(int ISBN, String Titulo, String Autor, int Npag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Npag = Npag;

    }

    public Libro() {

    }

    public void Pedir() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el ISBN");
        this.ISBN = leer.nextInt();
        System.out.println("Ingrese el Titulo");
        this.Titulo = leer.next();
        System.out.println("Ingrese el Autor");
        this.Autor = leer.next();
        System.out.println("Ingrese el N° de Paginas");
        this.Npag = leer.nextInt();
    }

    public void Mostrar() {
        System.out.println("El ISBN es " + this.ISBN);
        System.out.println("El Titulo es " + this.Titulo);
        System.out.println("El Autor es " + this.Autor);
        System.out.println("N° de Paginas " + this.Npag);
    }
}
