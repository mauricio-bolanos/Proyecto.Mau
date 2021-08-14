/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana13.Quiz;

import Semana12.*;
import Semana13.*;

/**
 *
 * @author maubo
 */
public class AudioControlador {
    private EquipoSonido audio;
    private AudioVista audios;
    
    public AudioControlador(){
        audio = new EquipoSonido(0);
        audios = new AudioVista(audios);
    }
    
    /**
     *
     */
    public void iniciar() {
        int op;
        do {
            op = audios.getOpcion();
            switch (op) {
                case 1:
                    if(nota.getArregloNotas().length==0){
                        int cant = nv.leaTamanoArreglo();
                        double[] elNuevoArreglo = new double[cant];
                        nota.setArregloNotas(elNuevoArreglo);
                    }
                    
                    nv.leaAgregarAudios();
                    break;
                case 2:
                    nv.muestreAudios();
                    break;
                default:
            }
        } while (op != 3);
    }
}
