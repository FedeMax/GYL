/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia04;

import Entidad.Circulo;
import Entidad.Rectangulo;

public class Herencia04 {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(5, 10);
        Rectangulo rectangulo = new Rectangulo(6, 10);

        circulo.calcularPerimetro();
        System.out.println("");
        circulo.calcularArea();
        System.out.println("---------------------------------------");
        rectangulo.calcularPerimetro();
        System.out.println("");
        rectangulo.calcularArea();

    }

}
