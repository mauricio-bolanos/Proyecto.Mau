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
public class Casting {
    public static void main(String[] args) {
        int a = 50000;
        short b = 32767;
        
        System.out.println("Valor a ="+a);
        System.out.println("Valor a ="+b);
        
        b = (short)a; 
        a= b ;
        
        System.out.println("Valor a ="+b);
        
        float c = 50.923745f;
        double d = 90.7251846273826d;
        
        System.out.println("Valor a ="+c);
        System.out.println("Valor a ="+d);
        
        c = (float)d;
        d = c ;
        
        System.out.println("Valor a = "+c);
    }
}
