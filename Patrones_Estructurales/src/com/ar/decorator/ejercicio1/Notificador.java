/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.decorator.ejercicio1;

/**
 *
 * @author vendosimplepc3
 */
public class Notificador implements Notificacion{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje: "+mensaje);
    }
    
}
