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
public class NotaControlador {
    private ExpedienteEstudiante nota;
    private SistemaNotasInterfaz nv;
    private Alumno alumno;
    private Examen examen;
    private SistemaNotasReporte snr;
    
    public NotaControlador(){
        nota = new ExpedienteEstudiante(0);
        nv = new SistemaNotasInterfaz(nota);
        alumno = new Alumno(null, null, null, null,0,0);
        examen = new Examen(alumno,0,0,0,null);
    }
    
    /**
     *
     */
    public void iniciar() {
        int op;
        int op2;
        do {
            op = nv.getOpcion();
            switch (op) {
                case 1:
                    if(nota.getArregloNotas().length==0){
                        int cant = nv.leaTamanoArreglo();
                        double[] elNuevoArreglo = new double[cant];
                        nota.setArregloNotas(elNuevoArreglo);
                        
                        String[] elNuevoArregloCiclos = new String[cant];
                        nota.setArreglociclos(elNuevoArregloCiclos);
                        
                        String[] elNuevoArregloNombres = new String[cant];
                        nota.setArregloNombres(elNuevoArregloNombres);
                    }
                    
                    nv.leaNota();
                    break;
                case 2:
                    nv.muestreNotas();
                    break;
                default:
                case 3:
                    do{
                    op2 = nv.getOpcion2();
                    switch(op2){
                        case 1:
                    }
                    }while(op2 != 5);
            }
        } while (op != 4);
    }
}
