
package entidad;


public class Persona {
    
    private final int idPersona;
    private String nombre;
    private static int contadorPersonas;

    public Persona(String nombre) {
        
        this.idPersona=++contadorPersonas;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nombre : " + this.nombre;
    }
    
    
    
    
    
    
    
}
