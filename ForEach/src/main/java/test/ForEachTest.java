
package test;

import entidad.Persona;

//video 120 leccion 34 

public class ForEachTest {
    
    public static void main(String[] args) {
        
        int edades[]={15,20,41,50};
        for(int edad:edades){
            System.out.println("edad = " + edad);
        }
        
        Persona personas[]= {new Persona("Carilitos"),new Persona("Lolo")};
        
        System.out.println("");
        for(Persona persona:personas){
            System.out.println("persona = " + persona);
        }
        
    }
    
}
