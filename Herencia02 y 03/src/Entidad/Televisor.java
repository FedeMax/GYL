/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Mega
 */
public class Televisor extends Electrodomestico {

    private float resolucion;
    private boolean sinTDT;

    public Televisor() {
    }

    public Televisor(float resolucion, boolean sinTDT) {
        this.resolucion = resolucion;
        this.sinTDT = sinTDT;
    }

    public Televisor(float resolucion, boolean sinTDT, int precio, String color, char consEner, int peso) {
        super(precio, color, consEner, peso);
        this.resolucion = resolucion;
        this.sinTDT = sinTDT;
    }

    public float getResolucion() {
        return resolucion;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSinTDT() {
        return sinTDT;
    }

    public void setSinTDT(boolean sinTDT) {
        this.sinTDT = sinTDT;
    }

    @Override
    public String toString() {
        return "el Televisor ";
    }

}
