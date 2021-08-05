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
public class Monedas{
    String nombre;
    float valor;

    public Monedas(String nombre, float valor) {
        this.nombre = nombre;
        this.valor = valor;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public float getValor(){
        return valor;
    }
    public void setValor(float valor){
        this.valor = valor;
    }
}
