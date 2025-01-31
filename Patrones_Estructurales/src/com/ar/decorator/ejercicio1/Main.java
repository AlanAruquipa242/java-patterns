/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.decorator.ejercicio1;

/**
 *
 * Crea una interfaz o clase base llamada Notificador con un método enviar_mensaje(mensaje).
    Implementa una clase concreta NotificadorEmail que herede de Notificador y envíe mensajes por correo electrónico.
    Crea decoradores para extender la funcionalidad:
    NotificadorSMS: Envía el mismo mensaje por SMS.
    NotificadorWhatsApp: Envía el mismo mensaje por WhatsApp.
    Permite combinar decoradores para que una misma notificación pueda enviarse por múltiples canales.
 * 
 * 
 */
public class Main {
    public static void main(String[] args) {
        Notificacion notificacion = new NotificadorEmail(
                new NotificadorSMS(
                        new NotificadorWhatsapp(
                                new Notificador()
                        )        
                )      
        );
        
        notificacion.enviarMensaje("Hola este es un mensaje");
    }
}
