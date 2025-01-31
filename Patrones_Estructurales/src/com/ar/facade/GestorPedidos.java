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
public class GestorPedidos {
    SistemaPedidos sistemaPedidos;
    SistemaPagos sistemaPagos;
    SistemaCocina sistemaCocina;
    SistemaNotificaciones sistemaNotificaciones;
    
    public  GestorPedidos(){
        sistemaPedidos = new SistemaPedidos();
        sistemaPagos = new SistemaPagos();
        sistemaCocina = new SistemaCocina();
        sistemaNotificaciones = new SistemaNotificaciones();        
    }
    
    
    public void realizarPedido(Cliente cliente, Pedido pedido, Pago pago){
        sistemaPedidos.crearPedido(pedido);
        sistemaPagos.procesarPago(pago);
        sistemaCocina.procesarComida();
        sistemaNotificaciones.enviarNotificacion();
    }
}
