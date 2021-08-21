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
/*Respuesta:Es porque se están instanciando variables complejas o objetos en vez de variables primitivas de manera en que da un resultado aleatorio 
por el comparador que es para variables primitivas
*/
public class Test {
public static void main(String[] args) {
    Short i = 122, j = 122;
    if (i == j) {
        System.out.println("true");
    } else {
        System.out.println("false");
    }
}
public static void main2(String[] args) {
    Short i = 1222, j = 1222;
        if (i == j) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
}
}

