/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Raices;
import java.util.Scanner;

public class RaicesServices {

    Scanner leer = new Scanner(System.in);
    Raices num = new Raices();

    public void llenar() {
        System.out.println("Ingrese los 3 valores");
        System.out.print("A ");
        num.setCoeficienteA(leer.nextInt());
        System.out.print("B ");
        num.setCoeficienteB(leer.nextInt());
        System.out.print("C ");
        num.setCoeficienteC(leer.nextInt());
    }

    public double getDisc() {
        double discri = (Math.pow(num.getCoeficienteB(), 2) - 4 * num.getCoeficienteA() * num.getCoeficienteC());
        num.setDiscriminante(discri);
        return discri;
    }

    public boolean tieneRaices() {
        getDisc();
        if (num.getDiscriminante() >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaiz() {
        getDisc();
        if (num.getDiscriminante() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerRaices() {
        double r1 = ((-num.getCoeficienteB() + Math.sqrt((num.getCoeficienteB() * num.getCoeficienteB()) - (4 * num.getCoeficienteA() * num.getCoeficienteC()))) / (2 * num.getCoeficienteA()));
        double r2 = ((-num.getCoeficienteB() - Math.sqrt((num.getCoeficienteB() * num.getCoeficienteB()) - (4 * num.getCoeficienteA() * num.getCoeficienteC()))) / (2 * num.getCoeficienteA()));
        if (tieneRaices() ) {

            System.out.println("Raiz 1 " + r1);
            System.out.println("Raiz 2 " + r2);
        } else {
            tieneRaiz();
        }
    }

    public void obtenerRaiz() {
        double r1 = ((-num.getCoeficienteB() + Math.sqrt((num.getCoeficienteB() * num.getCoeficienteB()) - (4 * num.getCoeficienteA() * num.getCoeficienteC()))) / (2 * num.getCoeficienteA()));
        if (tieneRaiz()) {
            System.out.println("Raiz " + r1);
        }
    }

    public void calcular() {
        getDisc();
        System.out.println("Discriminante=" + num.getDiscriminante());
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No existe solucion");
        }
    }
}
