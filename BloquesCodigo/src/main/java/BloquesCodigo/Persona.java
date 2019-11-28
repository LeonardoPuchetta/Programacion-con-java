
package BloquesCodigo;

//seccion 33 video 118

public class Persona {
    
    private final int idPersona;
    private static int contadorPersonas;
    
    //bloque de inicializacion estatico 
    
    static{
    contadorPersonas=7;
    // no se pueden utulizar variables no estaticas 
        System.out.println("se ejecuto bloque estatico " + contadorPersonas);
    
    
    }
    //bloque no estatico , se ejecuta antes del constructor de la clase 
    {
    
    this.idPersona=++contadorPersonas;
        System.out.println("se ejecuto el bloque NO estatico ");
    }

    public Persona() {
        
        System.out.println("Ejecucion del constructor");
        
        
        
    }

    public int getIdPersona() {
        return idPersona;
    }
    
    
    
    
    
    
    
}
