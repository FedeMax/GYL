/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej10;

import java.util.Arrays;

public class POOEJ10 {

    public static void main(String[] args) {

        double[] arr1 = new double[50];
        double[] arr2 = new double[20];
        for (int i = 0; i < 50; i++) {
            arr1[i] = ((Math.random() * ((50 - 1) + 1)) + 1);
            //System.out.println((i + 1) + ") " + arr1[i]);
        }

        System.out.println("");

        arr1 = mover(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println((i + 1) + ") " + arr1[i]);
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            //double esto=0.5;
            arr2[i]=arr1[i];
            //if(i>9){
            //    arr2[i]=esto;
            //}
            Arrays.fill(arr2, 10, 20, 0.5);
            
        }
        for (int i = 0; i < 20; i++) {
            System.out.println((i + 1) + ") " + arr2[i]);
        }
    }

    public static double[] mover(double[] inicio) {
        for (int i = 0; i < inicio.length; i++) {
            for (int j = i + 1; j < inicio.length; j++) {
                if (inicio[j] < inicio[i]) {
                    double anterior = inicio[i];
                    double menor = inicio[j];
                    inicio[i] = menor;
                    inicio[j] = anterior;
                }
            }
        }

        return inicio;
    }

}
