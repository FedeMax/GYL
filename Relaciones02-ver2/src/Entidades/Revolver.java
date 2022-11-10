/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Mega
 */
public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public void llenarRevolver() {
        posicionActual = ((int) (Math.random() * 6) + 1);
        posicionAgua = ((int) (Math.random() * 6) + 1);
    }

    public boolean mojar() {
        return posicionActual == posicionAgua;
    }
    public void siguienteChorro(){
        if(posicionActual==6){
            posicionActual=1;
        }else{
            posicionActual++;
        }
    }

    @Override
    public String toString() {
        return  "Posicion Actual del tambor " + posicionActual + ", Posicion donde se encuentra el Agua " + posicionAgua;
    }
  
}
