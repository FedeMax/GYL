/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej12;

import Service.PersonaService;

public class POOEJ12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        ps.crearPersona();
        ps.calcularEdad();
        
        ps.mostrarPersona();
    }
    
}
