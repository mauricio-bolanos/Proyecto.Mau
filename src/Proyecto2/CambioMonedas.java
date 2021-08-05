/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

import java.util.Locale;
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
        float equiMoneda1en2 = 0.0f; //para asignar valor del equivalente de la moneda #1 en la moneda #2
        float equiMoneda1enC = 0.0f; //para asignar valor del equivalente de la moneda #1 en colones
        float equiColonEnMoneda1 = 0.0f; //para asignar valor del equivalente en colones de la moneda #1 
        float equiMoneda2en1 = 0.0f; //para asignar valor del equivalente de la moneda #2 en la moneda #1
        float equiMoneda2enC = 0.0f; //para asignar valor del equivalente de la moneda #2 en colones
        float equiColonEnMoneda2 = 0.0f; //para asignar valor del equivalente en colones de la moneda #2 
        

        Scanner escaner = new Scanner(System.in).useLocale(Locale.US);

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
                    equiMoneda1en2 = escaner.nextFloat();
                    System.out.println("Cuanto equivale en colones");
                    equiMoneda1en2 = escaner.nextFloat();
                    System.out.println("Cuanto equivalen los colones en la moneda #1");
                    equiColonEnMoneda1 = escaner.nextFloat();
                    System.out.println("digite nombre de la moneda #2");
                    nombre2 = escaner.next();
                    System.out.println("Cuanto equivale en la moneda #1");
                    equiMoneda2en1 = escaner.nextFloat();
                    System.out.println("Cuanto equivale en colones");
                    equiMoneda2enC = escaner.nextFloat();
                    System.out.println("Cuanto equivalen los colones en la moneda #2");
                    equiColonEnMoneda2 = escaner.nextFloat();
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
                        MonedasValor moneda2 = new MonedasValor(nombre1, equiMoneda1en2);
                        MonedasValor monedaColon = new MonedasValor("Colon", equiMoneda1enC);

                        if (monedaConvertir.equalsIgnoreCase(nombre2)) {
                            resultado = j.convertir(moneda2, cantmoneda);
                            System.out.println("El resultado en moneda #2 es:" + resultado);
                        }
                        if (monedaConvertir.equalsIgnoreCase("Colon")) {
                            resultado = j.convertir(monedaColon, cantmoneda);
                            System.out.println("El resultado en colones es:" + resultado);
                        }

                    }
                    if (nombre2.equalsIgnoreCase(nombre2)) {
                        MonedasValor monedaColon = new MonedasValor("Colon", equiMoneda2enC);
                        MonedasValor moneda1 = new MonedasValor(nombre1, equiMoneda2en1);

                        if (monedaConvertir.equalsIgnoreCase(nombre1)) {
                            resultado = j.convertir(moneda1, cantmoneda);
                            System.out.println("El resultado en moneda #1 es:" + resultado);
                        }
                        if (monedaConvertir.equalsIgnoreCase("Colon")) {
                            resultado = j.convertir(monedaColon, cantmoneda);
                            System.out.println("El resultado en colones es:" + resultado);
                        }
                    }
                    if (nombre.equalsIgnoreCase("Colon")) {
                        MonedasValor moneda1 = new MonedasValor(nombre1, equiColonEnMoneda1);
                        MonedasValor moneda2 = new MonedasValor(nombre2, equiColonEnMoneda2);

                        if (monedaConvertir.equalsIgnoreCase(nombre2)) {
                            resultado = j.convertir(moneda2, cantmoneda);
                            System.out.println("El resultado en moneda #2 es:" + resultado);
                        }
                        if (monedaConvertir.equalsIgnoreCase(nombre1)) {
                            resultado = j.convertir(moneda1, cantmoneda);
                            System.out.println("El resultado en moneda#1 es:" + resultado);
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
