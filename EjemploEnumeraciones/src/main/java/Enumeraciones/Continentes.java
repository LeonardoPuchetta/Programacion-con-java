
package Enumeraciones;


public enum Continentes {
    
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    // DEFINIMOS EL ATRIBUTO DE PAISES
    
    private final int paises;

    
    //constructor de cada elemento de la enumeracion 
    
   Continentes(int paises) {
        this.paises = paises;
    }
   
   // metodo para recuperar el valor de paises 

    public int getPaises() {
        return this.paises;
    }
    
    
   
   
    
    
    
}
