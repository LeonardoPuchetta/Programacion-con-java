
package test;


import BloquesCodigo.Persona;

public class BloquesCodigo {
    
    
    public static void main(String[] args) {
        
        Persona p1=new Persona();
        int idPersona=p1.getIdPersona();
        System.out.println("idPersona : " + idPersona);
         Persona p2=new Persona();
         int idPersona2=p2.getIdPersona();
        System.out.println("idPersona : " + idPersona2);
    }
    
}
