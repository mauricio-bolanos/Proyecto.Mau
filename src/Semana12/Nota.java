/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana12;

import Semana13.*;

/**
 *
 * @author maubo
 */
public class Nota {

    private double[] arregloNotas;
    private int indice;

    public Nota(int cantidadDeEstudiantes) {
        arregloNotas = new double[cantidadDeEstudiantes];
        indice = 0;
    }

    public void agregarNota(double notaEstudiante) {
        try {
        
            try {
                arregloNotas[indice++] = notaEstudiante;
                
                
                //arregloNotas[indice] = notaEstudiante;
                //indice = indice + 1;

            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("demasiados datos para el vector de quices");
                indice--;
            } 
        }
        catch(Exception e){
                System.out.println("error mas general");
        } 
    }

    public int getIndice() {
        return indice;
    }

    public double getNota(int i) {
        return arregloNotas[i];
    }

    public double[] getArregloNotas() {
        return arregloNotas;
    }

    public void setArregloNotas(double[] arregloNotas) {
        this.arregloNotas = arregloNotas;
    }
}
