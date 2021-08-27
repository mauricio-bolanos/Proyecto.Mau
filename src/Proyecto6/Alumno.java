/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto6;

import java.util.Objects;

/**
 *
 * @author maubo
 */
public class Alumno {
    static String nombre;
    static String apellido;
    static String segundoapellido;
    static String grado;
    static int edad;
    static int carnet;

    public Alumno(String nombre, String apellido, String segundoapellido, String grado, int edad, int carnet) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.segundoapellido = segundoapellido;
        this.grado = grado;
        this.edad = edad;
        this.carnet = carnet;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }
    

    
     
}
