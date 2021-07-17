/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana9;

/**
 *
 * @author maubo
 */
public class Tester {
    String NOMBRE_EMPRESA = "GALLITO";
    public static void main(String[] args) {
        Repaso repaso3 = new Repaso();
        double impuestoPagar = repaso3.calcularImpuesto(2, 100000);
        
        Scanner escaner = new Scanner(System.in);
        int ssss = escaner.nextInt();
        
        repaso3.calcularImpuesto(2, 30000);
    }
}
