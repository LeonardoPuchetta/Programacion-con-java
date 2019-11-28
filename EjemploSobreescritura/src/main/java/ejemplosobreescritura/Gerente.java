
package ejemplosobreescritura;


public class Gerente extends Empleado {
    
    private String departamento;

    public Gerente(String departamento, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
  //sobreescribimos el metodo padre heredado 

   
    @Override//indica al compilador que estamos sobreescribiendo un metodo de la clase padre 
    public String obtenerDetalles(){
        
        return "nombre : " + this.nombre + " " + "sueldo : " + this.sueldo + " " + "departamento : " + this.departamento ;
        
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
        
        
   
    
}
