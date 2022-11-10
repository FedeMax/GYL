/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Televisor;
import java.util.Scanner;

/**
 *
 * @author Mega
 */
public class TelevirsorService extends ElectrodomesticoService{
    
    public void crearTelevirsor(){
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
        int pBase = 1000;
        System.out.println("Precio base $" + pBase);
        System.out.println("Ingrese la resolucion en pulgadas");
        float reso = leer.nextFloat();
        System.out.println("Tiene TDT");
        System.out.println("1 para SI, 2 para NO");
        int select = leer.nextInt();
        boolean tdt=false ;
        if (select==1) {
            tdt=true;
        }
        Televisor tele = new Televisor(reso, tdt, pBase, color, valor, peso);
        
        precioFinal(tele);
        pfinal2(tele);
        
        System.out.println(tele.toString());
        
    }
    public Televisor pfinal2(Televisor tele){
        if (tele.getResolucion()>40) {
            tele.setPrecio(tele.getPrecio()+(tele.getPrecio()*30/100));
        }
        if (tele.isSinTDT()) {
            tele.setPrecio(tele.getPrecio()+500);
        }
        return tele;
    }
    
}
