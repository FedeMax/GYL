/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej09;

import Entidad.Matematica;
import Service.MatematicaService;
import java.lang.Math;

public class POOEJ09 {

    public static void main(String[] args) {

        Matematica formula = new Matematica();
        MatematicaService ms = new MatematicaService();
        //int numero = (int)(Math.random()*10);
        System.out.println("Se procedera a setear el valor de los dos numeros");
        formula.setNum1((Math.random() * ((10 - -10) + 1)) + -10);
        Math.round(formula.getNum1());
        formula.setNum2((Math.random() * ((10 - -10) + 1)) + -10);
        formula.setNum1(Math.round(formula.getNum1()));
        formula.setNum2(Math.round(formula.getNum2()));
        System.out.println("El primero es "+formula.getNum1());
        System.out.println("El segundo es "+formula.getNum2());
        
        ms.devolverMayor(formula.getNum1(),formula.getNum2());
        ms.calcularPotencia(formula.getNum1(),formula.getNum2());
        formula.setNum1(Math.abs(formula.getNum1()));
        formula.setNum2(Math.abs(formula.getNum2()));
        ms.calcularRaiz(formula.getNum1(), formula.getNum2());
    }

}
