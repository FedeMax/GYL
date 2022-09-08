/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

public class Cuenta {

    private int numeroCuenta;
    private long dniDelCliente;
    private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dniDelCliente, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniDelCliente = dniDelCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniDelCliente() {
        return dniDelCliente;
    }

    public void setDniDelCliente(long dniDelCliente) {
        this.dniDelCliente = dniDelCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

}
