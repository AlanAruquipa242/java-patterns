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
public class SistemaPedidos {
    final int MAX_PEDIDOS = 1000;
    Pedido[] pedidos  = new Pedido[MAX_PEDIDOS];
    
    public void crearPedido(Pedido pedido){
        
        for(int i = 0 ; i < pedidos.length; i++){
            if(pedidos[i] == null){
               pedidos[i] = pedido;
                System.out.println("Pedido agregado!!");
               break;
            }
        }
    }
    
}
