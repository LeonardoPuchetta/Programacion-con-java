
package test;

import ejemplosobreescritura.Empleado;
import ejemplosobreescritura.Gerente;


public class EjemploSobreescritura {
    
    
    
    
    public static void main(String[] args) {
        Empleado empleado= new Empleado("jorge", 3500);
        System.out.println("empleado = " + empleado.obtenerDetalles());
        
        
        Gerente gerente = new Gerente("Alvaro","Finanzas",3500);
        System.out.println("Gerente : " + gerente.obtenerDetalles());
        
        
        
        
    }
    
}
