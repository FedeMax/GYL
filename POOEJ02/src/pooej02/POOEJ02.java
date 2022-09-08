/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej02;

import Entidad.Circunferencia;

public class POOEJ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Circunferencia circulo = new Circunferencia();

        circulo.setRadio(10);
        System.out.println("El Radio es " + circulo.getRadio());

        circulo.crearCincurferencia();
        
        System.out.println("El Area es "+circulo.area());
        
        System.out.println("El Perimetro es "+circulo.perimetro());
    }

}
