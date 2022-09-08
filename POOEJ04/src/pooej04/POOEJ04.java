/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej04;

import Service.RectanguloService;

public class POOEJ04 {

    
    public static void main(String[] args) {
        
        RectanguloService primero = new RectanguloService();
        
        primero.crearRectangulo();
        primero.perimetroRectangulo();
        primero.superficieRectangulo();
        primero.dibujarRectangulo();
    }

}
