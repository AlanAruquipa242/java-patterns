/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.decorator;

/**
 *
 * @author vendosimplepc3
 */
public class EsferazNavidad extends ArbolDecorador {
    
    public EsferazNavidad(ArbolNavidad arbolNavidad) {
        super(arbolNavidad);
    }
    
        @Override
    public String decorar() {
        return this.arbolNavidad.decorar() + " "+decorarConEsferas();
    }
    
    public String decorarConEsferas(){
        
        return "con esferas de navidad";
    }
    
}
