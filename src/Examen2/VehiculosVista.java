/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author maubo
 */
public class VehiculosVista {
    private SistemaArreglo cantVehiculos;

    public void VehiculoVista(SistemaArreglo vehiculo) {
        this.cantVehiculos = vehiculo;
    }
    
    public int leaTamanoArreglo() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de vehiculos."));
    }

    public void leaRegistro() {
        String modelo;
        modelo = JOptionPane.showInputDialog("Modelo?");
        
        String estilo;
        estilo = JOptionPane.showInputDialog("Estilo?");
        
        String color;
        color = JOptionPane.showInputDialog("Color?");
        
        String anho;
        anho = JOptionPane.showInputDialog("Año del vehiculo?");
        
        int numPuertas;
        numPuertas = Integer.parseInt(JOptionPane.showInputDialog("Numero de puertas?"));
        
        
        cantVehiculos.agregarVehiculo();
    }

    public void muestreVehiculos() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < cantVehiculos.getIndice(); i++) {
            jt.append(cantVehiculos.get
                +" "+cantVehiculos.get
                +" "+cantVehiculos.get
                +" "+cantVehiculos.get
                +" "+ cantVehiculos.get
                    +"\n");
        }
        JOptionPane.showMessageDialog(null, jt);
    }

    public int getOpcion() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar registro\n2. Mostrar registros\n3.Salir"));
            if ((r < 1) || (r > 3)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }
}
