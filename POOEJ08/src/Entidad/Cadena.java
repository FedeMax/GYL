/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;


public class Cadena {
    
    private String Frase;
    private int largoFrase;

    public String getFrase() {
        return Frase;
    }

    public void setFrase(String Frase) {
        this.Frase = Frase;
    }

    public int getLargoFrase() {
        return largoFrase;
    }

    public void setLargoFrase(int largoFrase) {
        this.largoFrase = largoFrase;
    }

    public Cadena(String Frase, int largoFrase) {
        this.Frase = Frase;
        this.largoFrase = largoFrase;
    }

    public Cadena() {
    }
}
