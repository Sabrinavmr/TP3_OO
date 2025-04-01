
package tp_prog_oo;
public class Empleado {
    
    private  int id; //identificador unico de cada empleado
    private String nombre; // nombre completo del empleaado
    private String puesto; // puesto de cada empleado
    private double salario; // salario actual del empleado
    private static int totalEmpleados= 0; //contador de la cantidad de empleados
    
    
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados++;
        this.nombre = nombre;
        this.puesto = puesto;
        salario = 30000;
        
        
    }
  
    public void ActualizarSalario(double porcentaje){
        
        this.salario += this.salario * (porcentaje / 100);
        
    }
    
    public void ActualizarSalario(int cantidad){
       
       this.salario += cantidad;
                
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id + ","
                + " nombre=" + nombre + ","
                + " puesto=" + puesto + ","
                + " salario=" + salario + '}';
    }
    
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
    
    
    
    
    
    
    
    
}
