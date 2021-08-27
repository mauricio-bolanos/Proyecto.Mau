/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto6;

/**
 *
 * @author maubo
 */
public class SistemaNotasReporte {
    Examen[] baseDatos;
    public SistemaNotasReporte(Examen[] examenes){
        this.baseDatos = examenes;
    }
    public String generarReporteTodosExamenes(){
        return baseDatos;
    }
}
