/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

public class Juego {

    private Revolver revolver;
    private ArrayList<Jugador> jugadores;

    public Juego() {
    }

    public Juego(Revolver revolver, ArrayList<Jugador> jugadores) {
        this.revolver = revolver;
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void llenarJuego(ArrayList<Jugador> jdrs, Revolver rvv) {
        revolver = rvv;
        jugadores = jdrs;
    }
    public boolean ronda(int i){
        boolean juegoSigue=true;
        jugadores.get(i).disparo(revolver);
        if (jugadores.get(i).isMojado()) {
            juegoSigue=false;
        }
        return juegoSigue;
    }
}
