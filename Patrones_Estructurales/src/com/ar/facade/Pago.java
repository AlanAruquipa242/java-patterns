/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.facade;

/**
 *
 * @author vendosimplepc3
 */
public class Pago {
    private int id;
    private Cliente cliente;
    private double pago;

    public Pago(int id, Cliente cliente, double pago) {
        this.id = id;
        this.cliente = cliente;
        this.pago = pago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "Pago{" + "id=" + id + ", cliente=" + cliente + ", pago=" + pago + '}';
    }
    
    
}
