/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2;

/**
 *
 * @author maubo
 */
public class SistemaArreglo {
    private Vehiculo[] arregloVehiculo;
    private int indice;
    
    public SistemaArreglo(int cantVehiculos){
        arregloVehiculo = new Vehiculo[cantVehiculos];
        indice = 0;
    }
}
