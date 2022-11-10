/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Baraja;
import Entidad.Carta;
import Enumeraciones.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaService {

    private Baraja barajaInicial = new Baraja();
    private Baraja cartasEntregadas = new Baraja();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Collections c;

    public Baraja crearBaraja() {
        ArrayList<Carta> cs = new ArrayList<>();
        ArrayList<Carta> out = new ArrayList<>();
        cartasEntregadas.setCartas(out);

        for (Palo aux : Palo.values()) {
            // String p = aux.getNombre();
            for (int i = 0; i < 12; i++) {
                if (i + 1 == 8 || i + 1 == 9) {

                } else {
                    Carta c = new Carta(i + 1, aux);
                    cs.add(c);
                }
            }
        }
        barajaInicial.setCartas(cs);
        System.out.println("Se inicio la Baraja");
        return barajaInicial;
    }

    public void baraja() {
        c.shuffle(barajaInicial.getCartas());
    }

    public Carta siguienteCarta() {
        Carta c = barajaInicial.getCartas().get(0);
        System.out.println("La siguiente " + barajaInicial.getCartas().get(0).toString());
        return c;
    }

    public void cartasDisponibles() {
        System.out.println("Hay disponibles " + barajaInicial.getCartas().size());
    }

    public void darCarta() {
        System.out.println("Ingrese la cantidad de cartas que quiere recibir");
        int cantidad = leer.nextInt();

        if (cantidad <= barajaInicial.getCartas().size()) {
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Se entrega la carta " + barajaInicial.getCartas().get(i).toString() + " al jugador");
            }
            for (int i = 0; i < cantidad; i++) {
                cartasEntregadas.getCartas().add(barajaInicial.getCartas().get(0));
                barajaInicial.getCartas().remove(0);
            }
        } else {
            System.out.println("Cartas insuficientes no se entrego ninguna carta al jugador");
            cartasDisponibles();
        }
    }

    public void cartasMonton() {
        if (cartasEntregadas.getCartas().size() == 0) {
            System.out.println("Todavia no se han etregado cartas");
        } else {
            System.out.println("Cartas retiradas(del monton)");
            String parrafo = "";
            int control = 0;
            for (Object aux : cartasEntregadas.getCartas()) {
                parrafo = parrafo.concat(aux.toString());
                parrafo = parrafo.concat(" . ");
                control++;
                if (control == 10) {
                    System.out.println(parrafo);
                    parrafo = "";
                    control = 0;
                }
            }
        }
    }

    public void mostrarBaraja() {
        if (barajaInicial.getCartas().size() == 0) {
            System.out.println("No quedan cartas en el mazo");
        } else {
            System.out.println("Cartas del mazo");
            String parrafo = "";
            int control = 0;
            for (Object aux : barajaInicial.getCartas()) {
                parrafo = parrafo.concat(aux.toString());
                parrafo = parrafo.concat(" . ");
                control++;
                if (control == 10) {
                    System.out.println(parrafo);
                    parrafo = "";
                    control = 0;
                }
            }
        }
    }

    public void menu() {
        System.out.println("");
        System.out.println("----- MENU -----");
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Barajar el mazo");
        System.out.println("2. Ver siguiente carta");
        System.out.println("3. Pedir cartas");
        System.out.println("4. Ver cartas ya usadas");
        System.out.println("5. Ver cartas aún en el mazo");
        System.out.println("6. Salir del programa");
        System.out.println("");
        String opc = leer.next();
        switch (opc) {
            case "1":
                baraja();
                System.out.println("Mazo barajado");
                menu();
                break;
            case "2":
                siguienteCarta();
                menu();
                break;
            case "3":
                darCarta();
                menu();
                break;
            case "4":
                cartasMonton();
                menu();
                break;
            case "5":
                mostrarBaraja();
                menu();
                break;
            case "6":
                System.out.println("Ejecución finalizada");
                break;
            default:
                System.out.println("Opcion no válida");
                ;
                menu();
        }
    }
}
