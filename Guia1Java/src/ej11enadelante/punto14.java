/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ej11enadelante;

import java.util.Scanner;

public class punto14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una cantidad de Euros a convertir");
        int euro = leer.nextInt();
        System.out.println("Ingrese a que moneda convertir");
        String moneda = leer.next();
        
        conversor(euro, moneda);
    }

    public static void conversor(int euro, String moneda) {
        double libra = 0.86;
        double dolar = 1.28611;
        double yen = 129.852;
        switch (moneda) {
            case "libras":
                System.out.println("€" + euro + " equivalen a " + libra * euro +" Libras");
                break;
            case "dolar":
                System.out.println("€" + euro + " equivalen a " + dolar * euro + " Dolares");
                break;
            case "yen":
                System.out.println("€" + euro + " equivalen a " + yen * euro + " yenes");
                break;
            default:
                System.out.println("ERROR");
                break;
                
        }

    }
}
