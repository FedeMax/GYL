/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia02;

import Entidad.Electrodomestico;
import java.util.ArrayList;
import Service.LavadoraService;
import Service.TelevirsorService;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.Iterator;

public class Herencia02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        LavadoraService ls = new LavadoraService();
//        ls.crearLavadora();
//
//        TelevirsorService ts = new TelevirsorService();
//        ts.crearTelevirsor();

        System.out.println("-----------------------------------------------------------");
        ArrayList<Electrodomestico> conjunto = new ArrayList<>();

        conjunto.add(new Lavadora(30, 1000, "blanco", 'a', 35));
        conjunto.add(new Televisor(45, true, 1000, "gris", 'b', 5));
        conjunto.add(new Televisor(30, true, 2000, "verde", 'f', 6));
        conjunto.add(new Televisor(35, true, 1500, "blanco", 'd', 3));

        int total = 0;
        for (Electrodomestico electrodomestico : conjunto) {
            electrodomestico.getEs().precioFinal(electrodomestico);
            System.out.println("El precio de "+electrodomestico.toString()+" es "+electrodomestico.getPrecio());
            System.out.println("");
            total += electrodomestico.getPrecio();
        }

        System.out.println("El total es $" + total);
    }

}
