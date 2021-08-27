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
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class SistemaNotasInterfaz {

    private ExpedienteEstudiante nota;

    public SistemaNotasInterfaz(ExpedienteEstudiante notaInstanciada) {
        this.nota = notaInstanciada;
    }
    
    public int leaTamanoArreglo() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes."));
    }

    public void leaNota() {
        String nombreDigitado;
        
        nombreDigitado = JOptionPane.showInputDialog("Nombre del estudiante?");
        
        double notaDigitada;
        
        notaDigitada = Double.parseDouble(JOptionPane.showInputDialog("Nota?"));
        
        String ciclosDigitado;
        
        
        ciclosDigitado = JOptionPane.showInputDialog("Ciclo?");

        nota.agregarNota(notaDigitada,ciclosDigitado,nombreDigitado);
    }

    public void muestreNotas() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < nota.getIndice(); i++) {
            jt.append(nota.getNota(i)+ " " + nota.getCiclo(i) + " " + nota.getNombre(i) + "\n");
        }
        JOptionPane.showMessageDialog(null, jt);
    }

    public int getOpcion() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar nota\n2. Mostrar Notas\n3.Hacer un reporte \n4.Salir"));
            if ((r < 1) || (r > 4)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }
    public int getOpcion2() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar reporte de todos los examenes\n2. Agregar reporte de todos los alumnos\n3.Agregar reporte con todos Alumnos con notas menores a 70 \n4.Agregar reporte con todos los examenes ordenados por nombre"));
            if ((r < 1) || (r > 5)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }
}