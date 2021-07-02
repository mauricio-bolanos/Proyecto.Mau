/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1;

import java.util.Scanner;

/**
 *
 * @author maubo
 */
public class examen {

    public static void main(String[] args) {
        String nomEmp = "";
        String provincia = "";
        int cantTrabajadores = 0;
        int cantTrabaCVD = 0;
        int promIngreso = 0;
        int creditos = 0;
        int sanJose = 1404242;
        int alajuela = 848146;
        int cartago = 490903;
        int heredia = 433677;
        int guanacaste = 326953;
        int puntarenas = 410929;
        int limon = 386862;

        Scanner escaner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu \n1) Digite datos de la empresa \n2)Imprimir informacion completa de la empresa \n3"
                    + "cuanto monto se le puede prestar a la empresa ");
            int option = escaner.nextInt();
            switch (option) {

                case 1: {
                    System.out.println("Digite el nombre de la empresa");
                    nomEmp = escaner.next();
                    System.out.println("Digite la provincia donde se ubica la empresa");
                    provincia = escaner.next();
                    
                    break;
                }
            }

        }
    }

}
