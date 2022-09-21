/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Scanner;
import Entidad.NIF;

public class NIFService {

    Scanner leer = new Scanner(System.in);
    NIF documento = new NIF();

    public void crearNif() {
        String[] a = documento.getGuia();
        System.out.println("Ingrese el DNI");
        documento.setDni(leer.nextLong());
        double indice = documento.getDni() % 23;
        documento.setDni(documento.getDni() / 23);
        int i = (int) indice;
        documento.setNif(a[i]);
    }

    public void mostrar() {
        String modelo[] = {"0", "0", "0", "0", "0", "0", "0", "0"};
        int a = (int) documento.getDni();
        String a1 = Integer.toString(a);
        int index = modelo.length - a1.length();
        int j = 0;
        for (int i = index; i < modelo.length; i++) {
            modelo[i] = a1.substring(j, j + 1);
            j++;
        }
        System.out.println("");
        for (int k = 0; k < 8; k++) {
            System.out.print(modelo[k]);
            if (k==7) {
                System.out.print("-"+documento.getNif());
                System.out.println("");
            }
        }
    }

}
