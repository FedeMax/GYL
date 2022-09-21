/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej13;

import Service.CancionService;

public class POOEJ13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CancionService ts = new CancionService();

        ts.llenar();
        ts.mostrar();
    }
    
}
