/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana8;

/**
 *
 * @author maubo
 */
public class Arreglos {

    public static void main(String[] args) {
        int[] creditos = {0, 1, 2, 3, 4, 5, 6,7};
        for (int a = 0; a < creditos.length; a++) {
            System.out.println(creditos[a]);
                
        }
        int [] num;
        num = new int [5];
        int n = num.length;
        n = num.length;
        for(int b=0; b <= n-1 ; b++){
            num[b] = b;
        }
        for(int b=0; b <= n-1 ; b++){
            System.out.println(num[b]);
        
        }
    }
}
