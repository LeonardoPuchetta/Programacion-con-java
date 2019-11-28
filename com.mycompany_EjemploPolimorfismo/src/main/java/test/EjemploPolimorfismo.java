package test;

import ejemplopolimorfismo.Empleado;
import ejemplopolimorfismo.Gerente;

public class EjemploPolimorfismo {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("jorge", 3500);
        // System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimirDetalles(empleado);

        Gerente gerente = new Gerente("Alvaro", "Finanzas", 3500);
        // System.out.println("Gerente : " + gerente.obtenerDetalles());
        imprimirDetalles(gerente);
        //puede recibir una referencia a un objeto de la clase hija 
        // se ejecuta el metodo de la clase hija (Gerente)
        
    }

    public static void imprimirDetalles(Empleado empleado) {

        System.out.println("empleado = " + empleado.obtenerDetalles());

    }

}
