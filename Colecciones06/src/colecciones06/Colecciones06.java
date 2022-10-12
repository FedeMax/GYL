/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones06;

import Service.TiendaService;
import java.util.Scanner;

public class Colecciones06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        TiendaService ts = new TiendaService();
        int selector;
        do {
            System.out.println("Seleccione una opcion");
            System.out.println(" 1)Ingresar Producto \n 2)Modificar Precio \n 3)Eliminar Producto \n 4)Mostrar Productos \n 5)Salir");
            selector = leer.nextInt();
            switch (selector) {
                case 1:
                    ts.ingresarProducto();
                    break;
                case 2:
                    ts.modificarPrecio();
                    break;
                case 3:
                    ts.eliminarProducto();
                    break;
                case 4:
                    ts.mostrarProductos();
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Error");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
            }
        }while(selector!=5);
    
    }

}
