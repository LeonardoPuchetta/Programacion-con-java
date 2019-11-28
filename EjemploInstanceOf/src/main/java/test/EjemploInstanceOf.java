package test;

import ejemploinstanceof.Empleado;
import ejemploinstanceof.Gerente;

public class EjemploInstanceOf {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("jorge", 3500);
        // System.out.println("empleado = " + empleado.obtenerDetalles());
        determinarTipo(empleado);

        Gerente gerente = new Gerente("Alvaro", "Finanzas", 3500);
        // System.out.println("Gerente : " + gerente.obtenerDetalles());
        determinarTipo(gerente);
        //puede recibir una referencia a un objeto de la clase hija 
        // se ejecuta el metodo de la clase hija (Gerente)

    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Empleado) {
            //System.out.println(((Gerente)empleado).getDepartamento());  // hacemos q la variable empleado apunte a un tipo Gerente en tiempo de ejecucion 
            Gerente gerente = (Gerente) empleado; // hacemos q la variable empleado apunte a un tipo Gerente en tiempo de ejecucion 
            
            System.out.println("departamento del gerente : "+ gerente.getDepartamento());
        }

                else if (empleado instanceof Empleado) {
            //System.out.println("empleado = " + empleado.obtenerDetalles());
            System.out.println(empleado.getNombre());

        }

    }
}
