/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto1;



/**
 *
 * @author maubo
 */
public class Conversor {
    public float convertir(Monedas origen, float montoOrigin){
        float resultado = 0.0f;
        resultado = montoOrigin*origen.getValor();
    
        return resultado;
    }
}
