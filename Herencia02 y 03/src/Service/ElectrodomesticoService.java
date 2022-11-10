package Service;

import Entidad.Electrodomestico;
import java.util.Scanner;

public  class ElectrodomesticoService {

    public void comprobarConsumoEnergetico(Electrodomestico elect) {

        char consEner = elect.getConsEner();

        if (consEner != 'a') {
            if (consEner != 'b') {
                if (consEner != 'c') {
                    if (consEner != 'd') {
                        if (consEner != 'e') {
                            if (consEner != 'f') {
                                elect.setConsEner('f');
                            }
                        }
                    }
                }
            }
        }
    }
//Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.

    public void comprobarColor(Electrodomestico elect) {
        String base = elect.getColor();
        String muestra = base;
        if (!muestra.equalsIgnoreCase("blanco")) {
            if (!muestra.equalsIgnoreCase("negro")) {
                if (!muestra.equalsIgnoreCase("rojo")) {
                    if (!muestra.equalsIgnoreCase("azul")) {
                        if (!muestra.equalsIgnoreCase("gris")) {
                            elect.setColor("blanco");
                        }
                    }
                }
            }
        }
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese los datos del electrodomestico");
        System.out.println("Ingrese el color");
        String color = leer.next();
        System.out.println("Ingrese el consumo energetico");
        String cEner = leer.next().toLowerCase();
        char valor = cEner.charAt(0);
        System.out.println("Ingrese el peso");
        int peso = leer.nextInt();
        int pBase = 1000;
       // System.out.println("Precio base $" + pBase);
        Electrodomestico aparato = new Electrodomestico(pBase, color, valor, peso);
        comprobarColor(aparato);
        comprobarConsumoEnergetico(aparato);
        
        precioFinal(aparato);
    }

    public Electrodomestico precioFinal(Electrodomestico elect) {

        switch (elect.getConsEner()) {
            case 'a':
                elect.setPrecio(elect.getPrecio() + 1000);
                break;
            case 'b':
                elect.setPrecio(elect.getPrecio() + 800);
                break;
            case 'c':
                elect.setPrecio(elect.getPrecio() + 600);
                break;
            case 'd':
                elect.setPrecio(elect.getPrecio() + 400);
                break;
            case 'e':
                elect.setPrecio(elect.getPrecio() + 200);
                break;
            case 'f':
                elect.setPrecio(elect.getPrecio() + 100);
                break;
        }
        if (elect.getPeso() > 1 && elect.getPeso() < 20) {
            elect.setPrecio(elect.getPrecio() + 100);
        } else if (elect.getPeso() > 20 && elect.getPeso() < 50) {
            elect.setPrecio(elect.getPrecio() + 500);
        }else if (elect.getPeso() >50 && elect.getPeso() < 80) {
            elect.setPrecio(elect.getPrecio() + 800);
        }else if (elect.getPeso() >=80) {
            elect.setPrecio(elect.getPrecio() + 1000);
        }
        return elect;
    }
    
}
