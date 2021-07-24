/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana10;

/**
 *
 * @author maubo
 */
public class TesterMaqConvertidora {
    public static void main(String[] args) {
        Moneda modenaEuro = new Moneda ("Euro", 0.8f)
        Moneda modenaOrigin = new Moneda("Colon", 620);
        Moneda modenaSalida = new Moneda("Dolar", 1);
        
        MaqConvertidora m = new MaqConvertidora();
        double montoDolares = m.convertir(modenaColon, modenaDolar, 1000);
        System.out.println("Monto en Dolares :"+ montoDolares);
    }
}
