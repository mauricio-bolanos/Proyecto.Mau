/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

/**
 *
 * @author maubo
 */
public class ConversorMonedas {
    public float convertir(MonedasValor origen, float montoOrigin){
        float resultado = 0.0f;
        resultado = montoOrigin*origen.getValor();
    
        return resultado;
    }
}
