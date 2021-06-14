/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

/**
 *
 * @author maubo
 */
public class factoresRiesgo {
    public static void main(String[] args){
        public String cita (int factoresRiesgo){
        
       System.out.println("Digite la cantidad de factores de riesgo");
        if (factoresRiesgo == 1 ){
            
        System.out.println("Tendra cita dentro de 1 semana");
        }
        if (factoresRiesgo == 2){
        System.out.println("Tendra cita en 3 días");
        }
        if (factoresRiesgo == 3){
        System.out.println("Tendra cita mañana");
        }
        return cita;
        }
    }
}
