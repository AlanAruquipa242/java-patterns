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
public class Pedido {
    private int id;
    private String descripcion;
    
    
    public Pedido(int id , String descripcion){
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", descripcion=" + descripcion + '}';
    }
    
    
}
