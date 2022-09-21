/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej14;

import Service.PuntosService;

public class POOEJ14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PuntosService ps = new PuntosService();
        ps.crearPuntos();
        ps.distancia();
    }
    
}
