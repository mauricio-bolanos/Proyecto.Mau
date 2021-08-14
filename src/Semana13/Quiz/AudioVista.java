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
import Semana12.*;
import Semana13.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class AudioVista {

    private EquipoSonido audio;

    public AudioVista(EquipoSonido audioInstanciado) {
        this.audio = audioInstanciado;
    }
    
    public int leaTamanoArreglo() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes."));
    }

    public void leaAgregarAudio() {
        String notaDigitada;
        
        notaDigitada = JOptionPane.showInputDialog("Audio?");

        audio.agregarNota(notaDigitada);
    }

    public void muestreAudios() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < audio.getIndice(); i++) {
            jt.append(audio.getNota(i) + "\n");
        }
        JOptionPane.showMessageDialog(null, jt);
    }

    public int getOpcion() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar Audio\n2. Mostrar Notas\n3.Salir"));
            if ((r < 1) || (r > 3)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }
}