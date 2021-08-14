/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana13.solucionMVC;

import Semana12.*;
import Semana13.*;

/**
 *
 * @author maubo
 */
public class ExpedienteEstudiante {

    private CursoEstudiante[] arregloNotas;
    private int indice;

    public ExpedienteEstudiante(int cantidadDeNotas) {
        arregloNotas = new CursoEstudiante[cantidadDeNotas];
        indice = 0;
    }

    public void agregarRegistro (CursoEstudiante registro) {
        try {
        
            try {
                arregloNotas[indice++] =registro;
                
                
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

    public CursoEstudiante getNota(int i) {
        return arregloNotas[i];
    }

    public CursoEstudiante[] getArregloNotas() {
        return arregloNotas;
    }

    public void setArregloNotas(CursoEstudiante[] arregloNotas) {
        this.arregloNotas = arregloNotas;
    }

}
