/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto1;

import java.util.Scanner;

/**
 *
 * @author maubo
 */
public class ConvertidorMonedas {

    public static void main(String[] args) {
        String nombre = "";
        float cantmoneda = 0.0f;
        String monedaConvertir = "";
        float resultado = 0.0f;

        Scanner escaner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                                   Menu 
                                   1) Tipo de moneda origen(Dolar,Euro,Colon) cantidad y a que moneda desea cambiar
                                   2) Convertir Moneda
                                   3) Reiniciar datos""");
            int option = escaner.nextInt();
            switch (option) {

                case 1: {
                    System.out.println("digite nombre de la moneda");
                    nombre = escaner.next();
                    System.out.println("Digite la cantidad de la moneda");
                    cantmoneda = escaner.nextInt();
                    System.out.println("digite moneda a la que desee cambiar");
                    monedaConvertir = escaner.next();

                    break;
                }
                case 2: {

                    Conversor j = new Conversor();
                    if (nombre.equalsIgnoreCase("Dolar")) {
                        Monedas monedaEuro = new Monedas("Euro", 0.84f);
                        Monedas monedaColon = new Monedas("Colon", 626);

                        if (monedaConvertir.equalsIgnoreCase("Euro")) {
                            resultado = j.convertir(monedaEuro, cantmoneda);
                            System.out.println("El resultado es:" + resultado);
                        }
                        if (monedaConvertir.equalsIgnoreCase("Colon")) {
                            resultado = j.convertir(monedaColon, cantmoneda);
                            System.out.println("El resultado es:" + resultado);
                        }

                    }
                    if (nombre.equalsIgnoreCase("Euro")) {
                        Monedas monedaColon = new Monedas("Colon", 735);
                        Monedas monedaDolar = new Monedas("Dolar", 1.18f);

                        if (monedaConvertir.equalsIgnoreCase("Dolar")) {
                            resultado = j.convertir(monedaDolar, cantmoneda);
                            System.out.println("El resultado es:" + resultado);
                        }
                        if (monedaConvertir.equalsIgnoreCase("Colon")) {
                            resultado = j.convertir(monedaColon, cantmoneda);
                            System.out.println("El resultado es:" + resultado);
                        }
                    }
                    if (nombre.equalsIgnoreCase("Colon")) {
                        Monedas monedaEuro = new Monedas("Euro", 0.0013f);
                        Monedas monedaDolar = new Monedas("Dolar", 0.0016f);

                        if (monedaConvertir.equalsIgnoreCase("Dolar")) {
                            resultado = j.convertir(monedaDolar, cantmoneda);
                            System.out.println("El resultado es:" + resultado);
                        }
                        if (monedaConvertir.equalsIgnoreCase("Euro")) {
                            resultado = j.convertir(monedaEuro, cantmoneda);
                            System.out.println("El resultado es:" + resultado);
                        }

                    }
                }
                case 3: {
                    nombre = "";
                    cantmoneda = 0.0f;
                    monedaConvertir = "";
                }
                break;
            }
        }
    }
}
