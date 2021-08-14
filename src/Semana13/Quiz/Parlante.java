/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana13.Quiz;

/**
 *
 * @author maubo
 */
public class Parlante {
    boolean habilitado;
    int volumen;
    char audio;

    public Parlante(boolean habilitado, int volumen, char audio) {
        this.habilitado = habilitado;
        this.volumen = volumen;
        this.audio = audio;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public char getAudio() {
        return audio;
    }

    public void setAudio(char audio) {
        this.audio = audio;
    }
    
    
}
