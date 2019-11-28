package com.gm.javadoc;

/**
 * Esta clase permite realizar operaciones
 * @author Leonardo
 * @version 1.0 
 */
public class Aritmetica {

    /**
     * primer operando
     */
    int opernadoA;
    int operandoB;

    /**
     * constructor vacio de la clase
     */
    public Aritmetica() {
    }
    
    /**
     * constructor con dos argumentos 
     */
    
    
    public Aritmetica(int opernadoA, int operandoB){
        
        this.opernadoA = opernadoA;
        this.operandoB = operandoB;
        
    }

    /**
     * metodo q realiza la suma de operandos enteros 
     */
    public int sumar() {
        return this.operandoB+this.opernadoA;
    }
    

}
