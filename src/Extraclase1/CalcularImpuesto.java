/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extraclase1;

/**
 *
 * @author maubo
 */
public class CalcularImpuesto {
    public double calcularImpuesto(int numDependientes, double salario){
        double resultado = 0;
        
        if (numDependientes==1){
            resultado = salario*1;
            if (salario<200000){
                resultado = 0;
            }
        }
        else if (numDependientes==2){
            resultado = salario*0.9;
        
        }
        else if (numDependientes==3) {
            resultado = salario*0.7;
        
        }
        else if (numDependientes==4) {
            resultado= salario*0.6;
        
        }
        else{
            resultado = salario *0.4;
        
        }
        return resultado;
    }
    
    
    
}
