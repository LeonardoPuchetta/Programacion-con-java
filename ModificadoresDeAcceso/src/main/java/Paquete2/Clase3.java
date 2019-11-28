package Paquete2;

import Paquete1.Clase1;
//import Paquete1.Clase2;

public class Clase3 extends Clase1 {

    //constructor
    public Clase3() {
        super("hols", "holo");//podemos acceder al constructor protegido mediante super    

        new Clase1();//llamada al constructor publico
        //new Clase1("hola ","hola ");//llamada al constructor protegido
        //new Clase1("hola ","hola ","chau");//llamada al constructor default

        //no podremos utilizar los constructores q no sean publicos desde la clase hija 
        //en otro paquete 
    }

    public void pruebaDesdeClase3() {

        Clase1 c1 = new Clase1();
        System.out.println("atributo publico : " + c1.atributoPublico);
        System.out.println("atributo protegido : " + atributoProtegido);
        //System.out.println("atributo default : " + c1.atributoDefault);
        //System.out.println("atributo privado : " + c1.);

        System.out.println("metodo publico : " + c1.metodoPublico());
        System.out.println("metodo protegido : " + metodoProtegido());
        //System.out.println("metodo default : " + c1.metodoDefault());
        //System.out.println("atributo privado : " + c1.);
        // no podemos acceder ni a atributos ni a metodos privados de la clase 1 

    }

    public static void main(String[] args) {
        Clase3 c3 = new Clase3();
        c3.pruebaDesdeClase3();
    }

}
