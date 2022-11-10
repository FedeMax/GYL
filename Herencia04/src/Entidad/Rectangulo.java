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
public class Rectangulo implements CalculosFormas{

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del rectangulo es "+base*altura);
    }

    @Override
    public void calcularPerimetro() {System.out.println("El perimetro del rectangulo es "+(base*altura)*2);
    }

}
