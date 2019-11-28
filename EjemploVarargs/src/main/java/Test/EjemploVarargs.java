
package Test;


public class EjemploVarargs {
    
    public static void main(String[] args) {
        
        // imprimimos varios numeros 
        
        imprimirNumeros(15,15,15,24,65,63,890);
        
        //parametros variables
        variosParametros("Juancho",true,14,52,58,96,123);
        
    }
// metodo q imprime los elementos del arreglo 
    private static void imprimirNumeros(int...numeros) {
        
        //recorremos el arreglo con un ciclo for 
        for (int i = 0; i < numeros.length; i++) {
            int elemento=numeros[i];
            System.out.println("impresion del arreglo " + elemento);
            
        }
        
        
    }
    
    // 

    private static void variosParametros(String nombre, boolean chequeo, int...numeros ) {
        
        System.out.println("Nombre : " + nombre);
        System.out.println("Chequeo :" + chequeo);
        for (int elemento:numeros) {
            
            System.out.println("elemento " + elemento);
            
        }
    }
    
}
