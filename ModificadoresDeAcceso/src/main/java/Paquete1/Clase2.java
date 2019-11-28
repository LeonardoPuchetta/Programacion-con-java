
package Paquete1;


public class Clase2 {
    
    // constructor vacio 
    public Clase2(){
      // prueba de constructores de la Clase1
    new Clase1();//llamada al constructor publico
    new Clase1("hola ","hola ");//llamada al constructor protegido
    new Clase1("hola ","hola ","chau");//llamada al constructor default
    //new Clase1("hola ","hola ","o","chau");
    // no se puede llamar desde esta clase porque es privado 
   
    
    
    
    
    }
    
    
    public void pruebaDesdeClase2(){
        
        Clase1 c1=new Clase1();
        System.out.println("atributo publico : " + c1.atributoPublico);
        System.out.println("atributo protegido : " + c1.atributoProtegido);
        System.out.println("atributo default : " + c1.atributoDefault);
        //System.out.println("atributo privado : " + c1.);
        
        
         System.out.println("metodo publico : " + c1.metodoPublico());
        System.out.println("metodo protegido : " + c1.metodoProtegido());
        System.out.println("metodo default : " + c1.metodoDefault());
        //System.out.println("atributo privado : " + c1.);
        // no podemos acceder ni a atributos ni a metodos privados de la clase 1 
        
    }
    
    
    public static void main(String[] args) {
        Clase2 c2=new Clase2();
        c2.pruebaDesdeClase2();
    }
    
}
