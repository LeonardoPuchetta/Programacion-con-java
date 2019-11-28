
package Paquete1;


public class Clase1 {
    
    
    // definimos los atributos a probar 
    
    public String atributoPublico ="Valor atributo publico"; 
    protected String atributoProtegido="Valor atributo protegido";
    String atributoDefault = "Valor atributo Default o Package ";
    private String atributoPrivado= "Valor atributo privado";

    
    
    //constructores 
    public Clase1() {
        
        System.out.println("Constructor publico vacio ");
        
    }
    
    public Clase1(String texto) {
        System.out.println("Constructor publico con un argumento = " + texto);
        
    }
    
    protected Clase1(String texto1, String texto2) {
        System.out.println("Constructor protected con dos argumentos = " + texto1 + texto2);
        
    }
    Clase1(String texto1, String texto2,String texto3) {
        System.out.println("Constructor Default ");
        
    }
    
    private Clase1(String texto1, String texto2,String texto3, String texto4) {
        System.out.println("Constructor privado " );
        
    }
    
    // metodos 
    
    public String metodoPublico(){
    return " metodo publico ";
    
    }
    
     protected String metodoProtegido(){
    return " metodo protegido ";
    
    }

      String metodoDefault(){
    return " metodo Default ";
    
    }
     private String metodoPrivado(){
    return " metodo privado ";
    
    }
    
    
    
    
    
    
    
    
    
    
    
}
