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
public class ExamenP {
    String nomEmp = "";
    String provincia = "";
    int cantTrabajadores = 0;
    int cantTrabaCVD = 0;
    int cantIngreso = 0;
    int creditos = 0;
    int sanjose = 1404242;
    int alajuela = 848146;
    int cartago = 490903;
    int heredia = 433677;
    int guanacaste = 326953;
    int puntarenas = 410929;
    int limon = 386862;
    int monto = 0;
    double tasaInt = 0.0;

    public void iniciar() {
        
        Scanner escaner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                               Menu 
                               1) Digite datos de la empresa 
                               2)Imprimir informacion completa de la empresa 
                               3cuanto monto se le puede prestar a la empresa """);
            int option = escaner.nextInt();
            switch (option) {

                case 1: {
                    System.out.println("Digite el nombre de la empresa");
                    nomEmp = escaner.next();
                    System.out.println("Digite la provincia donde se ubica la empresa");
                    provincia = escaner.next();
                    System.out.println("Digite la cantidad de trabajadores de la empresa");
                    cantTrabajadores = escaner.nextInt();
                    System.out.println("Digite la cantidad de trabajadores con COVID-19 en la empresa");
                    cantTrabaCVD = escaner.nextInt();
                    System.out.println("Digite la cantidad de ingreso de la empresa");
                    cantIngreso = escaner.nextInt();
                    System.out.println("Digite la cantidad de creditos de la empresa");
                    creditos = escaner.nextInt();
                    break;
                }
                case 2: {
                    System.out.println("Datos de la empresa: \n" + nomEmp + provincia + cantTrabajadores + cantTrabaCVD + cantIngreso + creditos);
                    if (cantTrabaCVD > 20) {
                        System.out.println("Alerta!!!");
                    }

                }
                break;
                case 3: {
                    
                    monto = monto + cantTrabaCVD / cantTrabajadores * sanjose;
                    System.out.println("La tasa de interes es : ");
                    if (10>cantTrabajadores && cantTrabajadores>0 ) {
                        tasaInt = 0.5;
                    }
                    if (cantTrabajadores == 30) {
                        tasaInt = 0.4;
                    }
                    if (cantTrabajadores == 31) {
                        tasaInt = 0.3;
                    } else {

                    }
                    System.out.println("El monto que se puede prestar es: " + monto);
                }
                break;
            }

        }
    }

    public static void creditosmas(int creditos, int cantIngreso, double tasaInt) {
        if (creditos > 0) {
            int ajuste = cantIngreso / 10000;
            System.out.println("el monto entonces es:");
        
    


        }
    }
}
    
}
