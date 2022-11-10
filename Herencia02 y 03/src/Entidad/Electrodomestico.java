/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Service.ElectrodomesticoService;

public class Electrodomestico  {

    protected int precio;
    protected String color;
    protected char consEner;
    protected int peso;
    protected ElectrodomesticoService es = new ElectrodomesticoService();


    public ElectrodomesticoService getEs() {
        return es;
    }

    public void setEs(ElectrodomesticoService es) {
        this.es = es;
    }

    
    
    
    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consEner, int peso) {
        this.precio = precio;
        this.color = color;
        this.consEner = consEner;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsEner() {
        return consEner;
    }

    public void setConsEner(char consEner) {
        this.consEner = consEner;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
//    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.

//    public char comprobarConsumoEnergetico() {
//
//        if (consEner != 'a') {
//            if (consEner != 'b') {
//                if (consEner != 'c') {
//                    if (consEner != 'd') {
//                        if (consEner != 'e') {
//                            if (consEner != 'f') {
//                                return 'f';
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        return consEner;
//    }
////Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
////usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
////blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
////minúsculas. Este método se invocará al crear el objeto y no será visible.
//
//    public String comprobarColor(String base) {
//        String muestra = base;
//        if (!muestra.equalsIgnoreCase("blanco")) {
//            if (!muestra.equalsIgnoreCase("negro")) {
//                if (!muestra.equalsIgnoreCase("rojo")) {
//                    if (!muestra.equalsIgnoreCase("azul")) {
//                        if (!muestra.equalsIgnoreCase("gris")) {
//
//                            muestra = "blanco";
//                        }
//                    }
//                }
//            }
//        }
//
//        return muestra;
//    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consEner=" + consEner + ", peso=" + peso + '}';
    }
    
}
