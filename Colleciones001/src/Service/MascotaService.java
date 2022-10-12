/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Mascota;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class MascotaService {

    private ArrayList<Mascota> mascota;
    private Scanner leer;

    public MascotaService() {
        this.mascota = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void datos() {
        System.out.println("Ingrese el nombre del perro");
        String nombre = leer.next();
        System.out.println("Ingrese la raza del perro");
        String raza = leer.next();
        mascota.add(new Mascota(nombre, raza));
    }

    public void mostar() {
        for (Mascota mascota1 : mascota) {
            System.out.println(mascota1.toString());
        }
    }

    public void eliminarMascota(String esto) {

        Iterator<Mascota> it = mascota.iterator();
        int contador=0;
        while (it.hasNext()) {
            if (it.next().getNombre().equals(esto)) {
                it.remove();
                contador++;
            } 
            if(contador==0){
                System.out.println("El perro no se encuentra en la lista");
            }
            System.out.println("");}
    }
    
    public void ordenar(){
        Collections.sort(mascota,(Mascota1,Mascota2)->Mascota1.getNombre().compareTo(Mascota2.getNombre()));
    }
}
