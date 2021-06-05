/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

/**
 *
 * @author maubo
 */
public class Metodos {
    static int peso = 100;
    public static void main (String[] args) {
        
        int resultadoParaProfe;
        
        resultadoParaProfe = pedro(3,4);
        
        System.out.println(resultadoParaProfe);
        
    
    }
    
    /**
     *
     * @param numero1
     * @param numero2
     * @return
     */
    public static int pedro(int numero1, int numero2){
        int resultado;
        resultado = numero1 + numero2;
        return resultado;        
    }

    /**
     *
     * @param numero1
     * @param numero2
     * @return
     */
    public static float pedro(float numero1, float numero2){
        float resultado;
        resultado = numero1 + numero2;
        return resultado;        
    }

    /**
     *
     * @param numero1
     * @param numero2
     * @param numero3
     * @return
     */
    public static int maria(int numero1, int numero2, int numero3){
        int resultado;
        resultado = numero1 * numero2;
        return resultado;        
    }
    
    
}