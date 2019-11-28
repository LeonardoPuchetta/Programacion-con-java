
package test;

import Enumeraciones.*;


public class EjemploEnumeraciones {
    
    public static void main(String[] args) {
        // valores de la enumeracion 
        System.out.println("Valor 1 :" + Dias.LUNES);
        
        //utilizamos la enumeracion de paises 
        System.out.println("continente numero 4 : " + Continentes.AMERICA);
        System.out.println("accedemos al numero de paises del continente 4 : " + Continentes.AMERICA.getPaises());
        
        indicarDia(Dias.DOMINGO );
        
    }
    
    private static void indicarDia(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
            case DOMINGO : 
                System.out.println("septimo dia de la semana ");
        }
    }
    
}
