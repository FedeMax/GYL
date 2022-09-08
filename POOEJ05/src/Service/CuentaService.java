/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cuenta;
import java.util.Scanner;

public class CuentaService {

    Cuenta cliente = new Cuenta();
    Scanner leer = new Scanner(System.in);

    public void crearCuenta() {
        System.out.println("Ingrese los datos de la cuenta");
        System.out.println("Ingrese el DNI");
        cliente.setDniDelCliente(leer.nextLong());
        System.out.println("Ingrese el numero de cuenta");
        cliente.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el saldo");
        cliente.setSaldoActual(leer.nextInt());
        System.out.println("");
        System.out.println("Datos de la cuenta establecidos");
        System.out.println("");
    }

    public double ingresarDinero() {
        System.out.println("");
        System.out.println("Usted posee en su cuenta $" + cliente.getSaldoActual());
        System.out.println("Indique el monto a agregar a la cuenta");
        int masDinero = leer.nextInt();
        cliente.setSaldoActual(cliente.getSaldoActual() + masDinero);
        System.out.println("Su saldo actual ahora es $" + cliente.getSaldoActual());
        System.out.println("");
        return masDinero;
    }

    public double retirarDinero() {
        System.out.println("");
        System.out.println("Usted posee en su cuenta $" + cliente.getSaldoActual());
        System.out.println("Indique el monto a retirar de la cuenta");
        int menosDinero = leer.nextInt();
        cliente.setSaldoActual(cliente.getSaldoActual() - menosDinero);
        if ((cliente.getSaldoActual() - menosDinero) < 0) {
            cliente.setSaldoActual(0);
        }
        System.out.println("Su saldo restante es $" + cliente.getSaldoActual());
        System.out.println("");
        return menosDinero;
    }

    public int extraccionRapida() {
        System.out.println("");
        int menosDinero;
        int veinte;
        veinte = cliente.getSaldoActual() * 20 / 100;
        System.out.println("Usted posee en su cuenta $" + cliente.getSaldoActual());
        System.out.println("Ingrese el monto a retirar");
        do {
            menosDinero = leer.nextInt();
            if(menosDinero >= veinte || menosDinero<0){
                System.out.println("Usted solo puede retirar hasta el 20%");
            }
                
            
        } while (menosDinero > veinte);
        cliente.setSaldoActual(cliente.getSaldoActual()-menosDinero);
        System.out.println("Su saldo restante es $" + cliente.getSaldoActual());
        System.out.println("");
        return menosDinero;
    }

    public void consultarSaldo() {
        System.out.println("");
        System.out.println("Su saldo restante es $" + cliente.getSaldoActual());
        System.out.println("");
    }

    public void mostrarDatos() {
        System.out.println("");
        System.out.println("Sus datos son:");
        System.out.println("DNI " + cliente.getDniDelCliente());
        System.out.println("Numero de Cuenta " + cliente.getNumeroCuenta());
        System.out.println("Su saldo es " + cliente.getSaldoActual());
        System.out.println("");
    }

    public void menu() {
        int selector;
        do {
            System.out.println("Menu");
            System.out.println("1) Consultar Datos ");
            System.out.println("2) Consultar Saldo");
            System.out.println("3) Ingresar Dinero");
            System.out.println("4) Extraer Dinero");
            System.out.println("5) Extraccion Rapida");
            System.out.println("6) Salir");
            selector = leer.nextInt();
            switch (selector) {
                case 1:
                    mostrarDatos();
                    break;
                case 2:
                    consultarSaldo();
                    break;
                case 3:
                    ingresarDinero();
                    break;
                case 4:
                    retirarDinero();
                    break;
                case 5:
                    extraccionRapida();
                    break;
                default:
                    System.out.println("Cerrando Menu");
                    break;
            }
        } while (selector != 6);
    }
}
