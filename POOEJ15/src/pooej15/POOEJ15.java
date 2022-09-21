/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej15;

import Service.RaicesServices;

public class POOEJ15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RaicesServices raiz = new RaicesServices();
        
        raiz.llenar();
        
        raiz.calcular();
    }
    
}
