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
public class Calculadora {
    public static void main (String[] args){
        Scanner Calculadora = new Scanner(System.in);
        
        System.out.println("Digite el primer numero");
        System.out.println();
        int numero1 = Calculadora.nextInt();
        System.out.println("Digite otro numero");
        int numero2 = Calculadora.nextInt();
        System.out.println("digite un numero más");
        int numero3 = Calculadora.next.Int();

    /**
     *
     * @param numero1
     * @param numero2
     * @param numero3
     * @return
     */
    public static int suma(int numero1, int numero2, int numero3){
        int resultado;
        resultado = numero1 + numero2 + numero3;
        return resultado;        
        }
    }
}
