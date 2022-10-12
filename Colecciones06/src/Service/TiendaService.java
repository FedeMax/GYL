/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Scanner;
//import Entidad.Tienda;
import java.util.HashMap;
import java.util.Map;

public class TiendaService {

    HashMap<String, String> tienda;
    Scanner leer;

    public TiendaService() {
        this.tienda = new HashMap<String, String>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void ingresarProducto() {
        System.out.println("Ingrese el nombre producto");
        String insumo = leer.next();
        System.out.println("Ingrese el precio");
        String precio = leer.next();
        tienda.put(insumo, precio);

        System.out.println("Desea agregar otro producto?");
        System.out.println("Si)1 \t No)2");
        int exit = leer.nextInt();
        while (exit == 1) {
            ingresarProducto();
            exit = 0;
        }
    }

    public void mostrarProductos() {
        
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Los productos de la tienda son :");
        for (Map.Entry<String, String> entry : tienda.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Item : " + key + "\t" + " precio : " + value);
        }
        
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void modificarPrecio() {
        System.out.println("Ingrese el nombre del producto del cual quiera cambiar el precio");
        String aux = leer.next();
        System.out.println("Indique el nuevo precio");
        String np = leer.next();
        for (Map.Entry<String, String> entry : tienda.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (aux.equalsIgnoreCase(key)) {
                tienda.put(key, np);
            }
        }
    }
    
    public void eliminarProducto(){
        System.out.println("Ingrese el nombre del producto a eliminar");
        String borrar= leer.next();
        for (Map.Entry<String, String> entry : tienda.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (borrar.equalsIgnoreCase(key)) {
                tienda.remove(key);
            }
        }
    }
}
