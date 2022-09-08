/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej08;

import Service.CadenaService;

public class POOEJ08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        CadenaService a1 = new CadenaService();
        a1.perdir();
        a1.mosrarVocales();
        a1.invertirFrase();
        a1.vecesRepetido();
        a1.compararLongitud();
        a1.unirFrase();
        a1.reemplazar();
        a1.contiene();
    }
    
}
