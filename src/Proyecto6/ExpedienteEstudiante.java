/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto6;

import Semana13.*;

/**
 *
 * @author maubo
 */
public class ExpedienteEstudiante {

    private double[] arregloNotas;
    private String[] arreglociclos;
    private int indice;
    private String[] arregloNombres;

    public ExpedienteEstudiante(int cantidadDeNotas) {
        arregloNotas = new double[cantidadDeNotas];
        arreglociclos = new String[cantidadDeNotas];
        indice = 0;
    }

    public void agregarNota(double notaEstudiante, String ciclo, String nombres) {
        try {
        
            try {
                arregloNotas[indice] = notaEstudiante;
                arreglociclos[indice] = ciclo;
                arregloNombres[indice] = nombres;
                indice++;
                
                
                //arregloNotas[indice] = notaEstudiante;
                //indice = indice + 1;

            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("demasiados datos para el vector de notas");
                //indice--;
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
    public String getCiclo(int i) {
        return arreglociclos[i];
    }
    public String getNombre(int i){
        return arregloNombres[i];
    }

    public double[] getArregloNotas() {
        return arregloNotas;
    }

    public void setArregloNotas(double[] arregloNotas) {
        this.arregloNotas = arregloNotas;
    }
    public void setArreglociclos(String[] arreglociclos){
        this.arreglociclos = arreglociclos;
    }
    public String[] getArreglociclos(){
        return arreglociclos;
    }

    public String[] getArregloNombres(){
        return arregloNombres;
    }

    public void setArregloNombres(String[] arregloNombres) {
        this.arregloNombres = arregloNombres;
    }
    
}
