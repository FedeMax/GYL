/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones03;

import Service.BarajaService;


public class Relaciones03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BarajaService bs= new BarajaService();
        bs.crearBaraja();
        bs.menu();
    }
    
}
