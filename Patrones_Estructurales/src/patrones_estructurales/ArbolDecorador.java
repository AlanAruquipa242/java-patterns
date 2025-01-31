/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_estructurales;

/**
 *
 * @author vendosimplepc3
 */

public abstract class ArbolDecorador implements ArbolNavidad{

    ArbolNavidad arbolNavidad;
    
    public ArbolDecorador(ArbolNavidad arbolNavidad){
        this.arbolNavidad = arbolNavidad;
    }
    
    @Override
    public String decorar() {
        return this.arbolNavidad.decorar();
    }
    
}
