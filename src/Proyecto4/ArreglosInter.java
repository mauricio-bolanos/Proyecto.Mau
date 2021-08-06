/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto4;

import java.util.Scanner;

/**
 *
 * @author maubo
 */
public class ArreglosInter {

    public static void main(String[] args) {
        int n=0;
        int m=0;

        Scanner escaner = new Scanner(System.in);
        System.out.println("De que tamaño será el arreglo #1");
        n = escaner.nextInt();
        int[] arreglo1 = new int[n];
        System.out.println("De que tamaño será el arreglo #2");
        m = escaner.nextInt();
        int[] arreglo2 = new int[m];

        int[] arregloInter = new int[n + m];

        System.out.println("Ingrese datos del arreglo #1");
        for (int i = 0; i < n; i++) {
            System.out.println("Digite un número" + "" + (i + 1));
            arreglo1[i] = escaner.nextInt();
        }
        System.out.println("Ingrese datos del arreglo #2");
        for (int j = 0; j < m; j++) {
            System.out.println("Digite un número" + "" + (j + 1));
            arreglo2[j] = escaner.nextInt();
        }
        int a = 0;
        int b = 0;

        for(int k = 0;k<arregloInter.length; k++){
            if(k<arreglo1.length){
                arregloInter[a++] = arreglo1[k];
            }
            if(k<arreglo2.length){
                arregloInter[a++] = arreglo2[k];
            }
        }
        System.out.println("Arreglo intercalado es:");
        for (b = 0; b < arregloInter.length; b++) {
            System.out.println(arregloInter[b]);
            
        }
    }
}
