/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;



public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora(int carga, int precio, String color, char consEner, int peso) {
        super(precio, color, consEner, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "la Lavadora";
    }

}
