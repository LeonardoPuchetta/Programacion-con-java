

package prueba;

import com.gm.javadoc.Aritmetica;

/**
 *
 * @author Leonardo
 * clase para probar el concepto de JAVADOC 
 * @version : 1.0
 */
public class PruebaJavaDoc {
    
    
    /**
     * mnetodo q ejecuta la prueba de la clase aritmetica 
     * @param args es un arreglo de tipo string de la linea de comandos 
     */
    
    public static void main(String[] args) {
        
        Aritmetica aritmetica1=new Aritmetica(3,2);
        int resultado=aritmetica1.sumar();
        System.out.println("Resultado : " + resultado);
        
        
        
    }
    
    
}
