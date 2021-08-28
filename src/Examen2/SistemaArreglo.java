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
    
    public void agregarVehiculo(Vehiculo registro){
        try {
        
            try {
                arregloVehiculo[indice++] = registro;

            }catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("demasiados datos");
                indice--;
            }
        } catch(Exception e){
                System.out.println("error");
        }   
    }
    public Vehiculo getMotor(int i) {
        return arregloVehiculo[i];
    }

    public Vehiculo[] getArregloVehiculo() {
        return arregloVehiculo;
    }

    public void setArregloVehiculo(Vehiculo[] arregloVehiculo) {
        this.arregloVehiculo = arregloVehiculo;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
}
