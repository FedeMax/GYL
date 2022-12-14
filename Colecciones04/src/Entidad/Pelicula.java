/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

public class Pelicula {

    private String titulo;
    private String director;
    private Integer  duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String Director, int duracion) {
        this.titulo = titulo;
        this.director = Director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String Director) {
        this.director = Director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula " + titulo + ", director " + director + ", duracion " + duracion + " horas";
    }
       
}
