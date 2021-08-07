/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana11;

/**
 *
 * @author maubo
 */
public class Tester {
    public static void main(String[] args) {
        int grado = 5;
       
        Estudiante beta = new Estudiante("Miguel"); 
        Estudiante alpha = new Estudiante("Sebastián");
        alpha.setGrado(grado);
        Estudiante est3 = new Estudiante("Marvin", "Mora","Perez",120);
        
        est3.setApellido2("Rodriguez");

        System.out.println(alpha.getNombre() + " " + alpha.getLegajo());
        
        Persona pers = new Persona();
        
        Boolean siSalimosTemprano = null;
        Float salario = null;
        Byte edad = 100;
        byte otra = edad.byteValue();
        double numDoble = edad.doubleValue();
        String numTxt = edad.toString();
        Integer codEmpleo = 1238;
        String codTxt = codEmpleo.toString();
    } 
}
