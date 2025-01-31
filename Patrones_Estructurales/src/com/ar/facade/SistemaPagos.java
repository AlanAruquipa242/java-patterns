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
public class SistemaPagos {
    final int MAX_PAGOS= 1000;
    Pago[] pagos = new Pago[MAX_PAGOS];
    
    
    public void procesarPago(Pago pago){
        for(int i = 0 ; i < pagos.length; i++){
            if(pagos[i] == null){
               pagos[i] = pago;
                System.out.println("Pago procesado!!");
               break;
            }
        }
    }
}
