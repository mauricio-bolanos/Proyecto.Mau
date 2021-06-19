/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizySemana5;

/**
 *
 * @author maubo
 */
public class Ciclos {

    public static void main(String[] args) {
        int n=5;
        int hh = 0;
        while (hh <1000) {

            System.out.println(1);
            
            hh = hh + 1;
        }
        for(int j=0; j < n; j++){
            if (hh == 0 || hh==(n-1) ){
                System.out.print("*");
            }
            else{
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
