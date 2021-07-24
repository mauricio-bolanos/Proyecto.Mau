/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana10;

/**
 *
 * @author maubo
 */
public class Estudiante {
    private String nombre;
    private int legajo;
    public static int grado;
    
    //Sobrecarga de constructores
    public Estudiante(String valorNombre){
        nombre = valorNombre;
    }
    
    public Estudiante(String valorNombre, int valorLegajo){
        legajo = valorLegajo;
         nombre = valorNombre;
    }
    
    public Estudiante Estudiante(){
        return null;
    }
    
    public int getLegajo(){
        return legajo;
    }
    public void setLegajo(int valorLegajo){
        legajo = valorLegajo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valorNombre){
        if(valorNombre == null){
            System.out.println("Nombre invalido");
        }
        else{
            this.nombre = nombre;
        }
    }
    public void setGrado(int grado){
        Estudiante.grado= grado;
    }
    
    public int getGrado(int valorGrado){
        return grado;
    }
    
}
