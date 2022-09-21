/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Puntos;
import java.util.Scanner;

public class PuntosService {

    Puntos ej = new Puntos();

    Scanner leer = new Scanner(System.in);

    public void crearPuntos() {
        System.out.println("Ingrese x1");
        ej.setX1(leer.nextInt());
        System.out.println("Ingrese y1");
        ej.setY1(leer.nextInt());
        System.out.println("Ingrese x2");
        ej.setX2(leer.nextInt());
        System.out.println("Ingrese y2");
        ej.setY2(leer.nextInt());
    }

    public void distancia() {
        double dist;
        System.out.println("La distancia se mide con la formula");
        System.out.println("d(P1,P2)=√(x2−x1)^2+(y2−y1)^2");
        dist = Math.sqrt(Math.pow((ej.getX2()-ej.getX1()), 2)+Math.pow((ej.getY2()-ej.getY1()), 2));
        System.out.println("La distancia entre los puntos es "+dist);
    }

}
