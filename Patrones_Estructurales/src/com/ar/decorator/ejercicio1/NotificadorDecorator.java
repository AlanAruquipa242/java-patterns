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
public class NotificadorDecorator implements Notificacion{
    Notificacion notificacion;
    
    public NotificadorDecorator(Notificacion notificacion){
        this.notificacion = notificacion;
    }
    
    @Override
    public void enviarMensaje(String mensaje) {
        this.notificacion.enviarMensaje(mensaje);
    }
    
}
