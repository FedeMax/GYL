/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraService {

    Scanner leer = new Scanner(System.in);
    Cafetera caf1 = new Cafetera();
    int cafe = 0;

    public void llenarCafetera() {
        System.out.println("Se procede a llenar la cafetera con agua");
        caf1.setCapacidadMaxima(2500);
        caf1.setCapacidadActual(2500);
        System.out.println("Hay 2500 cc de agua");
        System.out.println("");
    }

    public void servirTaza() {
        if (cafe == 0) {
            System.out.println("Debe agregar cafe primero o solo tomara agua caliente");
            agregarCafe();
            if( caf1.getCapacidadActual()==0){
            System.out.println("La jarra esta vacia");
            System.out.println("Se procedera a llenarla");
            llenarCafetera();
        }
        }if (cafe>2){
            System.out.println("Mucho cafe va a esta juerte como cachetada de travesti");
        }
        if( caf1.getCapacidadActual()==0){
            System.out.println("La jarra esta vacia");
            System.out.println("Se procedera a llenarla");
            llenarCafetera();
        }
        int taza;
        int jarron = caf1.getCapacidadActual();
        System.out.println("Ingrese el tamaño de la taza en cc");
        taza = leer.nextInt();
        System.out.println("Sirviendo Cafe\n"
                + "...");
        System.out.println("..");
        System.out.println(".");
        if (taza > jarron) {
            taza = jarron;
            System.out.println("Solo habia " + caf1.getCapacidadActual() + " cc");
            jarron = 0;
            caf1.setCapacidadActual(0);
        } else {
            jarron -= taza;
            caf1.setCapacidadActual(jarron);
        }
        System.out.println("Cafe servido");
        System.out.println("Quedan en la jarra "+caf1.getCapacidadActual());
        System.out.println("");
    }

    public void vaciarCafetera() {
        System.out.println("Se procede a vaciar la cafetera");
        caf1.setCapacidadMaxima(0);
        caf1.setCapacidadActual(0);
        System.out.println("");
    }

    public int agregarCafe() {
        System.out.println("Se esta agregamdo cafe a la jarra");
        System.out.println("");
        return cafe += 1;
    }

    public void menu() {
        int menu;
        System.out.println("Bienvenido al Cafeinetor 3000");
        do {
            System.out.println("Menu");
            System.out.println("1) Agregar Cafe\n"
                    + "2) LLenar Cafetera \n"
                    + "3) Servir Taza \n"
                    + "4) Vaciar Cafetera\n"
                    + "5) Salir");
            menu = leer.nextInt();
            switch(menu){
                case 1:
                    agregarCafe();
                    break;
                case 2:
                    llenarCafetera();
                    break;
                case 3:
                    servirTaza();
                    break;
                case 4:
                    vaciarCafetera();
                    break;
                default:
                    System.out.println("Saliendoo");
                    break;
            }
        } while (menu==1 || menu==2 || menu==3 || menu==4);
    }
}
