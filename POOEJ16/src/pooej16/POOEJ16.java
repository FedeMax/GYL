/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej16;

    import Service.NIFService;

public class POOEJ16 {


    
    public static void main(String[] args) {
        // TODO code application logic here
        NIFService llenador = new NIFService();
        llenador.crearNif();
        llenador.mostrar();
    }
    
}
