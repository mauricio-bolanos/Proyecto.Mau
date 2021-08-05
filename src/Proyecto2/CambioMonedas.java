/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

import java.util.Scanner;

/**
 *
 * @author maubo
 */
public class CambioMonedas {
    public static void main(String[] args) {
        String nombre = "";
        String colon = "";
        String nombre1 = "";
        float cantmoneda = 0.0f;
        String monedaConvertir = "";
        float resultado = 0.0f;
        String nombre2 = "";
        float equivalenteDel11 = 0.0f; //para asignar valor del equivalente de la moneda #1 en la moneda #2
        float equivalenteDel12 = 0.0f; //para asignar valor del equivalente de la moneda #1 en colones
        float equivalenteDel13 = 0.0f; //para asignar valor del equivalente en colones de la moneda #1 
        float equivalenteDel21 = 0.0f; //para asignar valor del equivalente de la moneda #2 en la moneda #1
        float equivalenteDel22 = 0.0f; //para asignar valor del equivalente de la moneda #2 en colones
        float equivalenteDel23 = 0.0f; //para asignar valor del equivalente en colones de la moneda #2 
        

        Scanner escaner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                                   Menu 
                                   1) Digitar datos de las monedas
                                   2) Convertir Moneda
                                   3) Reiniciar datos""");
            int option = escaner.nextInt();
            switch (option) {

                case 1: {
                    System.out.println("digite nombre de la moneda #1");
                    nombre1 = escaner.next();
                    System.out.println("Cuanto equivale en la moneda #2");
                    equivalenteDel11 = escaner.nextFloat();
                    System.out.println("Cuanto equivale en colones");
                    equivalenteDel12 = escaner.nextFloat();
                    System.out.println("Cuanto equivalen los colones en la moneda #1");
                    equivalenteDel13 = escaner.nextFloat();
                    System.out.println("digite nombre de la moneda #2");
                    nombre2 = escaner.next();
                    System.out.println("Cuanto equivale en la moneda #1");
                    equivalenteDel21 = escaner.nextFloat();
                    System.out.println("Cuanto equivale en colones");
                    equivalenteDel22 = escaner.nextFloat();
                    System.out.println("Cuanto equivalen los colones en la moneda #2");
                    equivalenteDel23 = escaner.nextFloat();
                    System.out.println("digite nombre de la moneda que va a cambiar");
                    nombre = escaner.next();
                    System.out.println("Digite la cantidad de la moneda");
                    cantmoneda = escaner.nextInt();
                    System.out.println("digite moneda a la que desee cambiar");
                    monedaConvertir = escaner.next();

                    break;
                }
                case 2: {

                    ConversorMonedas j = new ConversorMonedas();
                    if (nombre1.equalsIgnoreCase(nombre1)) {
                        MonedasValor moneda2 = new MonedasValor(nombre1, equivalenteDel11);
                        MonedasValor monedaColon = new MonedasValor("Colon", equivalenteDel12);

                        if (monedaConvertir.equalsIgnoreCase(nombre2)) {
                            resultado = j.convertir(moneda2, cantmoneda);
                            System.out.println("El resultado es:" + resultado);
                        }
                        if (monedaConvertir.equalsIgnoreCase("Colon")) {
                            resultado = j.convertir(monedaColon, cantmoneda);
                            System.out.println("El resultado es:" + resultado);
                        }

                    }
                    if (nombre2.equalsIgnoreCase(nombre2)) {
                        MonedasValor monedaColon = new MonedasValor("Colon", equivalenteDel22);
                        MonedasValor moneda1 = new MonedasValor(nombre1, equivalenteDel21);

                        if (monedaConvertir.equalsIgnoreCase(nombre1)) {
                            resultado = j.convertir(moneda1, cantmoneda);
                            System.out.println("El resultado es:" + resultado);
                        }
                        if (monedaConvertir.equalsIgnoreCase("Colon")) {
                            resultado = j.convertir(monedaColon, cantmoneda);
                            System.out.println("El resultado es:" + resultado);
                        }
                    }
                    if (nombre.equalsIgnoreCase("Colon")) {
                        MonedasValor moneda1 = new MonedasValor(nombre1, equivalenteDel13);
                        MonedasValor moneda2 = new MonedasValor(nombre2, equivalenteDel23);

                        if (monedaConvertir.equalsIgnoreCase(nombre2)) {
                            resultado = j.convertir(moneda2, cantmoneda);
                            System.out.println("El resultado es:" + resultado);
                        }
                        if (monedaConvertir.equalsIgnoreCase(nombre1)) {
                            resultado = j.convertir(moneda1, cantmoneda);
                            System.out.println("El resultado es:" + resultado);
                        }

                    }
                }
                case 3: {
                    nombre1 = "";
                    cantmoneda = 0.0f;
                    monedaConvertir = "";
                }
                break;
            }
        }
    }
}
