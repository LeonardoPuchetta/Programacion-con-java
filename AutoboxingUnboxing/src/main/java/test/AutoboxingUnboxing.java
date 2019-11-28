/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author risso
 */
public class AutoboxingUnboxing {
    
    
    public static void main(String[] args) {
        // Autoboxing(envolvemos tipos primitivos en clses envolventes )
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero = "+ entero.intValue());
       
        
        //unboxing (extraemos el objeto primitivo del objeto envolvente)
        int enterito=entero;
        System.out.println("enterito = " + enterito);
    }
    
}
