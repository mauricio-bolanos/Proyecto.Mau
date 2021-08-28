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
public class VehiculosControlador {
    private SistemaArreglo sa;
    private VehiculosVista vv;
    
    public VehiculosControlador(){
        sa = new SistemaArreglo(1);
        vv = new VehiculosVista();
    }

    public void iniciar() {
        int op;
        do {
            op = vv.getOpcion();
            switch (op) {
                case 1:
                    if(sa.getArregloVehiculo().length==0){
                        int cant = vv.leaTamanoArreglo();
                        Vehiculo[] elNuevoArreglo = new Vehiculo[cant];
                        sa.setArregloVehiculo(elNuevoArreglo);
                    }
                default:
                    vv.leaRegistro();
                    break;
                case 2:
                    vv.muestreVehiculosBodega();
                    break;

                case 3:
                    vv.muestreVehiculosVendidos();
                    break;

                case 4:
                    vv.muestreVehiculosVendidos();
                    break;    
            }
        } while (op != 5);
    }
}
