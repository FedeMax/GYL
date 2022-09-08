/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Matematica;

public class MatematicaService {

    public void devolverMayor(double num1, double num2) {
        System.out.println("");
        System.out.println("Se devolvera el numero mayor");

        if (num1 > num2) {
            System.out.println("El numero " + num1 + " es mayor");
            System.out.println("");
        } else {
            System.out.println("El num2 " + num2 + " es mayor");
        }
        System.out.println("");
    }

    public void calcularPotencia(double num1, double num2) {
        System.out.println("");
        System.out.println("Se calculara el N° mayor elevado al menor ");
        if (num1 > num2) {
            System.out.println(num1 + " elevado al " + num2 + " =" + Math.pow(num1, num2));
            System.out.println("");
        } else {
            System.out.println(num2 + " elevado al " + num1 + " =" + Math.pow(num2, num1));
        }
        System.out.println("");
    }

    public void calcularRaiz(double num1,double num2){
        System.out.println("");
        System.out.println("Se devolvera el valor absoluto de los numeros y el menor se dara la Rcuadrada");
        System.out.println("Num1 "+Math.abs(num1));
        System.out.println("Num2 "+Math.abs(num2));
        if (num1 < num2) {
            System.out.println("La raiz de "+num1 + " es "+ Math.sqrt(num1));
            System.out.println("");
        } else {
            System.out.println("La raiz de "+num2 + " es "+ Math.sqrt(num2));
        }
        System.out.println("");
    }
}
