/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cancion;
import java.util.Scanner;

public class CancionService {

    Cancion tema = new Cancion();
    Scanner leer = new Scanner(System.in);

    public void llenar() {
        System.out.println("Ingrese el nombre de la cancion");
        tema.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor");
        tema.setAutor(leer.next());
    }
    public void mostrar(){
        System.out.println(tema.toString());
    }
}
