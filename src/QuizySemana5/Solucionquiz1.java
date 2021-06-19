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
public class Solucionquiz1 {
    public static void main(String[] args) {
        String nombreingrediente1 = "peperoni";
        String nombreingrediente2 = "jamon";
        String nombreingrediente3 = "piña";
        
        double precioIngrediente1 = 200.0d;
        double precioIngrediente2 = 300.0d;
        double precioIngrediente3 = 170.0d;
        
        boolean indIngrediente1 = false;
        boolean indIngrediente2 = false;
        boolean indIngrediente3 = false ;
        int tamano = 0;
        
       Scanner s = new Scanner (System.in);
       System.out.println("Digite 1 para Si, O para No");
       System.out.println("desea"+nombreingrediente1+ "?");
       indIngrediente1 = s.nextBoolean();
       
       System.out.println("desea"+nombreingrediente2+ "?");
       indIngrediente2 = s.nextBoolean();
       
       System.out.println("desea"+nombreingrediente3+ "?");
       indIngrediente3 = s.nextBoolean();
       
       System.out.println ("Digite 1 para grande, 0 para pequeña");
       
       double pagoTotal = 0.0d;
       double pagoFinal = 0.0d;
       if(tamano == 0){
           if(indIngrediente1==true){
               pagoTotal = pagoTotal + precioIngrediente1;
           }
           if(indIngrediente2==true){
               pagoTotal = pagoTotal +precioIngrediente2;
           }
           if(indIngrediente3==true){
               pagoTotal = pagoTotal + precioIngrediente3;
           }
           pagoFinal = pagoTotal + (pagoTotal*0.10);
       }
       else if(tamano == 1){
           if(indIngrediente1==true){
               pagoTotal = pagoTotal + precioIngrediente1;
           }
           if(indIngrediente2==true){
               pagoTotal = pagoTotal +precioIngrediente2;
           }
           if(indIngrediente3==true){
               pagoTotal = pagoTotal + precioIngrediente3;
           }
           pagoFinal = pagoTotal + (pagoTotal*0.40);
       }
       else{
           System.out.println("Selecciono un tamaño invalido");
       }
       System.out.println("Precio a pagar : "+pagoFinal);
       
    }
    public static void imprimir(){
    
    
    }
}
