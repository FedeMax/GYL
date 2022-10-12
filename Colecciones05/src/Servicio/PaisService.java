/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pais;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Collections;
import Utilidad.Comparador;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class PaisService {

    LinkedHashSet<Pais> paisesSet;
    ArrayList<Pais> paises;
    Scanner leer;

    public PaisService() {

        this.paisesSet = new LinkedHashSet<>();
        this.paises = new ArrayList<>(paisesSet);
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void ingresarPais() {
        System.out.println("Ingrese el pais");
        String aux = leer.next();
        paises.add(new Pais(aux));
        
        System.out.println("Si desea agregar otro pais, escriba 1)si, 2)no ");
        int aux2 = leer.nextInt();
        while (aux2 == 1) {
            ingresarPais();
            aux2 = 0;
        }
    }

    public void mostrarPaises() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Paises ingresados:");
        for (Pais paise : paises) {
            System.out.println(paise);
        }
    }
     public void mostrarPaises2() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Paises ingresados:");
        for (Pais paise : paisesSet) {
            System.out.println(paise);
        }
    }

    public void ordenarPaises() {
      
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Se ordenaron los paises alfabeticamente");
        paises.sort(Comparador.mundo);
        for (Pais pais : paises) {
            paisesSet.add(pais);
        }
        mostrarPaises();
    }

    public void removerPais() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Iterator<Pais> it = paisesSet.iterator();
        boolean esta = true;
        System.out.println("Ingrese el pais a remover");
        String aux = leer.next();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(aux)) {
                it.remove();
                esta = false;
                System.out.println("Pais eliminado");
                break;
            }
        }
        if (esta) {
            System.out.println("No se encontro el pais");
        }
        mostrarPaises2();
    }
}
