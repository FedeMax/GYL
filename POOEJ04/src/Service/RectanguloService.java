/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Scanner;
import Entidad.Rectangulo;

public class RectanguloService {

    Scanner leer = new Scanner(System.in);
    Rectangulo r1 = new Rectangulo();

    public void crearRectangulo() {
        System.out.println("Ingrese el valor de la Base del Rectangulo");
        r1.setBase(leer.nextInt());
        System.out.println("Ingrese el valor de la Altura del Rectangulo");
        r1.setAltura(leer.nextInt());
    }

    public void superficieRectangulo() {
        System.out.println("La superficie del rectangulo es : " + r1.getBase() * r1.getAltura());
    }

    public void perimetroRectangulo() {
        System.out.println("El perimetro del rectangulo es : " + 2 * (r1.getBase() + r1.getAltura()));
    }

    public void dibujarRectangulo() {
        int base = r1.getBase();
        int altura = r1.getAltura();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1) {
                    System.out.print(" * ");
                }
                else if (i > 0 || i == altura - 2) {
                    if (j == 0 || j == base-1 ) {
                        System.out.print(" * ");
                    }else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
