/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana14;

/**
 *
 * @author maubo
 */
public class Algoritmos {
    public static void main(String[] args) {
        int[] numeros= {2,8,5,3,9,4,1}; 
        for(int k = 0; k <numeros.length-1;k++){
            for(int i = 0; i <numeros.length-k-1;i++){
                if(numeros[i] > numeros[i+1]){
                    int temp = numeros[i+1];
                    numeros[i+1] = numeros[i];
                    numeros[i] = temp;
                }
            }
        }
         for(int k=1;k<numeros.length;k++){
            
            for(int u=k;u>0;u--){
                if(numeros[u-1] > numeros[u]){
                    int temp = numeros[u-1];
                    numeros[u-1] = numeros[u];
                    numeros[u] = temp;
                }
            }
        
        }
        System.out.print("|");
        for(int u = 0; u < numeros.length ; u++){
            System.out.print(numeros[u]+"|");
        }
    }
}
