/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones05;

import Servicio.PaisService;

public class Colecciones05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PaisService ps = new PaisService();
        
        ps.ingresarPais();
        ps.mostrarPaises();
        ps.ordenarPaises();
        ps.removerPais();
    }
    
}
