/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones04;

import Servicio.PeliculaServicio;

public class Colecciones04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PeliculaServicio ps = new PeliculaServicio();

        ps.pedirDatos();
        System.out.println("");
        System.out.println("Listado de Peliculas");
        ps.mostrarPeliculas();
        System.out.println("");
        ps.masDeUnaHora();
        System.out.println("");
        ps.ordenarDeMenorAMayor();
        System.out.println("");
        ps.mayorAMenor();
        System.out.println("");
        ps.porTitulo();
        System.out.println("");
        ps.porDirector();
    }

}
