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
public class Jugador {

    private Integer id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer id) {
        this.id = id;
        String ids = id.toString();
        ids = "Jugador ".concat(ids);
        this.nombre = ids;
        this.mojado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public boolean disparo(Revolver r) {
        boolean verificador = false;
        if (r.mojar()) {
            mojado = true;
            verificador = true;
        } else {
            r.siguienteChorro();
        }
        return verificador;
    }
}
