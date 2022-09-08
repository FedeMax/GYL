/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej05;

import Service.CuentaService;

public class POOEJ05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CuentaService primerCliente = new CuentaService();

        primerCliente.crearCuenta();

        primerCliente.menu();

    }
}
