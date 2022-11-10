/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Lavadora;
import java.util.Scanner;

public class LavadoraService extends ElectrodomesticoService {

//    @Override
//    public Electrodomestico precioFinal(Electrodomestico elect) {
//        return super.precioFinal(elect); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void crearElectrodomestico() {
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Ingrese los datos del electrodomestico");
//        System.out.println("Ingrese el color");
//        String color = leer.next();
//        System.out.println("Ingrese el consumo energetico");
//        String cEner = leer.next().toLowerCase();
//        char valor = cEner.charAt(0);
//        System.out.println("Ingrese el peso");
//        int peso = leer.nextInt();
//        System.out.println("Ingrese la carga");
//        int carga = leer.nextInt();
//        int pBase = 1000;
//        System.out.println("Precio base $" + pBase);
//        Electrodomestico aparato = new Lavadora(carga, pBase, color, valor, peso);
//        comprobarColor(aparato);
//        comprobarConsumoEnergetico(aparato);
//
//        precioFinal(aparato);
//        //super.crearElectrodomestico(); //To change body of generated methods, choose Tools | Templates.
//
//        System.out.println(aparato.toString());
//    }
//
//    @Override
//    public void comprobarColor(Electrodomestico elect) {
//        super.comprobarColor(elect); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void comprobarConsumoEnergetico(Electrodomestico elect) {
//        super.comprobarConsumoEnergetico(elect); //To change body of generated methods, choose Tools | Templates.
//    }
    
    public void crearLavadora() {
        crearElectrodomestico();
    }

    @Override
    public void crearElectrodomestico() {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese los datos del electrodomestico");
        System.out.println("Ingrese el color");
        String color = leer.next();
        System.out.println("Ingrese el consumo energetico");
        String cEner = leer.next().toLowerCase();
        char valor = cEner.charAt(0);
        System.out.println("Ingrese el peso");
        int peso = leer.nextInt();
        System.out.println("Ingrese la carga");
        int carga = leer.nextInt();
        int pBase = 1000;
        System.out.println("Precio base $" + pBase);
        Lavadora aparato = new Lavadora(carga, pBase, color, valor, peso);
        comprobarColor(aparato);
        comprobarConsumoEnergetico(aparato);

        precioFinal(aparato);
        pFinal(aparato);
        //super.crearElectrodomestico(); //To change body of generated methods, choose Tools | Templates.

        System.out.println(aparato.toString());
    }

    public Lavadora  pFinal(Lavadora elect) {
        if (elect.getCarga()>30) {
            elect.setPrecio(elect.getPrecio()+500);
        }
        return elect;
    }
    
}
