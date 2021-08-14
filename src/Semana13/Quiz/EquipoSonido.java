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
public class EquipoSonido {

    private String[] arregloAudios;
    private int indice;

    public EquipoSonido(int cantidadDeAudios) {
        arregloAudios = new String[cantidadDeAudios];
        indice = 0;
        
        Parlante parIzq = new Parlante(true,5,'P');
        Parlante parDer = new Parlante(true,5,'l');
        Parlante sub = new Parlante(true,5,'M');
    }

    public void agregarNota(String audio) {
        try {
        
            try {
                arregloAudios[indice++] = audio;
                
                
                //arregloNotas[indice] = notaEstudiante;
                //indice = indice + 1;

            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("demasiados datos para el vector de Audios");
                indice--;
            } 
        }
        catch(Exception e){
                System.out.println("error mas general");
        } 
    }

    public int getIndice() {
        return indice;
    }

    public String getNota(int i) {
        return arregloAudios[i];
    }

    public String[] getArregloAudios() {
        return arregloAudios;
    }

    public void setArregloNotas(String[] arregloAudios) {
        this.arregloAudios = arregloAudios;
    }
}
