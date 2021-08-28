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
        
        int estado;
        estado = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 si el vehiculo está en bodega, 2 si está vendido o 3 si es devuelto"));
        
        int numPuertas;
        numPuertas = Integer.parseInt(JOptionPane.showInputDialog("Numero de puertas?"));
        
        int peso;
        peso = Integer.parseInt(JOptionPane.showInputDialog("Peso del motor?"));
        
        String modeloMotor;
        modeloMotor = JOptionPane.showInputDialog("Modelo del motor?");
        
        String serieMotor;
        serieMotor = JOptionPane.showInputDialog("Serie del motor?");
        
        Motor m = new Motor(peso,modeloMotor, serieMotor);
        Vehiculo v = new Vehiculo(modelo, estilo, color,numPuertas, anho, m,estado);
        
        cantVehiculos.agregarVehiculo(v);
    }

    //private void establecerComoVendido(int estado=1,Vehiculo.setEstado(3)){
    //    estado = 3;
    //}
    //private void establecerComoVendido(int estado=1,Vehiculo.setEstado(3)){
    //    estado = 3;
    //}
    
    public void muestreVehiculosBodega() {
        JTextArea ha = new JTextArea();
        for (int i = 0; i < cantVehiculos.getIndice(); i++) {
            ha.append(cantVehiculos.getMotor(i)+"\n");
        }
        JOptionPane.showMessageDialog(null, ha);
    }
    public void muestreVehiculosVendidos() {
        JTextArea ha = new JTextArea();
        for (int i = 0; i < cantVehiculos.getIndice(); i++) {
            ha.append(cantVehiculos.getMotor(i)+"\n");
        }
        JOptionPane.showMessageDialog(null, ha);
    }
    public void muestreVehiculosDevueltos() {
        JTextArea ha = new JTextArea();
        for (int i = 0; i < cantVehiculos.getIndice(); i++) {
            ha.append(cantVehiculos.getMotor(i)+"\n");
        }
        JOptionPane.showMessageDialog(null, ha);
    }

    public int getOpcion() {
        int j = 0;
        try {
            j = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar registro\n2. Mostrar vehiculos en bodega\n3.Mostrar vehiculos vendidos\n4. Mostrar vehiculos devueltos\n5.Salir"));
            if ((j < 1) || (j > 5)) {
                throw new Exception("pruebe un número valido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return j;
    }
}
