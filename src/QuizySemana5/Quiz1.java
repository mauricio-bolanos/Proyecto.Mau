/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizySemana5;

import java.util.Scanner;

/**
 *
 * @author maubo
 */
public class Quiz1 {
    public static void main(String[] args) {
        int pizza = 0;
        int ingrediente1= 20;
        int ingrediente2 = 30;
        int ingrediente3 = 40;
        int grande = 40;
        int peque = 10; 
        int pog = 0;
        int ingredientes = 0;
        
        Scanner escaner = new Scanner(System.in);
        System.out.println ("Digite 1 si desea el primer ingrediente o un 0 en caso de que no lo desee");
        if (ingredientes == 1){
        pizza = 20;
        } 
        
        System.out.println ("Digite 2 si desea el segundo ingrediente o un 0 en caso de que no lo desee");
        if (ingredientes == 2){
        pizza=30;
        }
        System.out.println ("Digite 3 si desea el tercer ingrediente o un 0 en caso de que no lo desee");
        if (ingredientes == 3){
        pizza = 40;
        }
        System.out.println ("Digite 1 si desea la pizza grande o un 0 si la desea pequeña");
        if (pog == 1){
        pizza= ingredientes + grande;
        }
        else if (pog == 0){
        pizza= ingredientes + peque;
        }    
    }
    
}
