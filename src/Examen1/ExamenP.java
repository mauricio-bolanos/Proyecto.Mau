/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1;

import static Semana10.Calculadora.conGUI;
import static Semana10.Calculadora.porTerminal;
import Semana10.Estudiante;
import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author maubo
 */
public class ExamenP {


    private static void exit(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    /*
    public String nomEmp = "";
    public String provincia = "";
    public int cantTrabajadores = 0;
    public int cantTrabaCVD = 0;
    public int cantIngreso = 0;
    public int creditos = 0;
    public int sanjose = 1404242;
    public int alajuela = 848146;
    public int cartago = 490903;
    public int heredia = 433677;
    public int guanacaste = 326953;
    public int puntarenas = 410929;
    public int limon = 386862;
    public int monto = 0;
    public double tasaInt = 0.0;
    public int poblacion = 0;
  */

    
   /* public void Iniciar(){
        
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
                    if (30>cantTrabajadores && cantTrabajadores>0) {
                        tasaInt = 0.4;
                    }
                    if (31>cantTrabajadores && cantTrabajadores>0) {
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
            int ajuste = cantIngreso / 100000;
            System.out.println("el monto entonces es:");
        
  
        }
    }
   
    */
  
     public static void main(String[] args) {
        
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
    double monto = 0.0;
    double tasaInt = 0.0;
    int poblacion = 0;
    Scanner escaner = new Scanner(System.in);     
   

        while (true) {
            System.out.println("""
                               Menu 
                               1) Digite datos de la empresa 
                               2) Imprimir informacion completa de la empresa 
                               3) cuanto monto se le puede prestar a la empresa 
                               4) Reiniciar datos""");
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
                    System.out.println("Datos de la empresa: \n" + "Nombre de la empresa: " + nomEmp + "\n" +  "Provincia: " + provincia + "\n" +  "Cantidad de Trabajadores: " + cantTrabajadores + "\n" +  
                            "Trabajadores con COVID 19: " + cantTrabaCVD + "\n" +  "Cant Ingreso: " + cantIngreso + "\n" + "Creditos: " +  creditos);
                    if (cantTrabaCVD > 20) {
                        System.out.println("Alerta!!! La empresa posee un numero mayor a 20 de trabajadores con COVID-19");
                    }

                }
                break;
                case 3: {
                    
                    if(provincia.equalsIgnoreCase("SanJose")){
                        poblacion = poblacion + sanjose; 
                    }
                     if(provincia.equalsIgnoreCase("Alajuela")){
                        poblacion = poblacion + alajuela; 
                    }
                     if(provincia.equalsIgnoreCase("Limon")){
                        poblacion = poblacion + limon; 
                    }
                     if(provincia.equalsIgnoreCase("Cartago")){
                        poblacion = poblacion + cartago; 
                    }
                     if(provincia.equalsIgnoreCase("Puntarenas")){
                        poblacion = poblacion + puntarenas; 
                    }
                     if(provincia.equalsIgnoreCase("Guanacaste")){
                        poblacion = poblacion + guanacaste; 
                    }
                     if(provincia.equalsIgnoreCase("Heredia")){
                        poblacion = poblacion + heredia; 
                    }                    
                    
                
                    if (10>cantTrabajadores && cantTrabajadores>0 ) {
                        tasaInt = 0.5;
                    }
                    if (30>cantTrabajadores && cantTrabajadores>= 10) {
                        tasaInt = 0.4;
                    }
                    if (30>=cantTrabajadores) {
                        tasaInt = 0.3;
                    } 
                    
                    
                    if(creditos > 0){
                       int totalcreditos = 0;
                       double promedio = 0.0;
                       double cantAjuste = 0.0;
                       
                       for (int i = 1; i<= creditos; i= i+1) {
                           System.out.println("Digite el monto del credito #" + i);
                           totalcreditos += escaner.nextInt();
                       }  
                       
                       promedio = totalcreditos/creditos;
                       cantAjuste = promedio/100000;
                       tasaInt = tasaInt + cantAjuste;
                       
                    }
                     
                    System.out.println("La tasa de interes es : " + tasaInt);
                    
                    monto = cantTrabajadores/cantTrabaCVD * poblacion;
                   
                    System.out.println("El monto que se puede prestar es: " + monto);
                    if(monto <= 1000000){
                        System.out.println("El monto que se puede prestar es: " + monto);
                    }else{
                        
                        System.out.println("N1o es permitido otorgar mas de 1.000.000");
                      
                    }
                    
                }
                break;
                
                case 4: {
                 
                  nomEmp = "";
                  provincia = "";
                  cantTrabajadores = 0;
                  cantTrabaCVD = 0;
                  cantIngreso = 0;
                  creditos = 0;
                  monto = 0;
                  tasaInt = 0.0;
                  poblacion = 0;
            
                }
                break;
                
            }

        }
            
    }

}