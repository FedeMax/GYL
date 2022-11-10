/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Interfaces.CalculosFormas;

/**
 *
 * @author Mega
 */
public class Circulo implements CalculosFormas{

    private int radio;
    private int diametro;

    public Circulo() {
    }

    public Circulo(int radio, int diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del circulo es "+(PI*Math.pow(radio, 2)));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro es "+(PI*diametro));
    }

}
