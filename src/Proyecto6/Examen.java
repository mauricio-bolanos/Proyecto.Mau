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
public class Examen {
    Alumno alumno;
    private static int  nota;
    private static int puntosTotales;
    private static int puntosObtenidos;
    private static String materia;

    public Examen(Alumno alumno, int nota, int puntosTotales, int puntosObtenidos, String materia) {
        this.alumno = alumno;
        this.nota = nota;
        this.puntosTotales = puntosTotales;
        this.puntosObtenidos = puntosObtenidos;
        this.materia = materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public static int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(int puntosTotales) {
        this.puntosTotales = puntosTotales;
    }

    public int getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(int puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
}
