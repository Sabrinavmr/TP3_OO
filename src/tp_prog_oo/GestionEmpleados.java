
package tp_prog_oo;


public class GestionEmpleados {

    public static void main(String[] args) {
        //instanciar varios empleados, utilizando ambos constructores
        Empleado emp1 = new Empleado(112233, "Carlos", "Encargado",10000);
        Empleado emp2 = new Empleado("Martina", "Ejecutiva");
        Empleado emp3 = new Empleado(223344, "Zoe", "Secretaria", 40000);
        Empleado emp4 = new Empleado("Jorge", "Jefe Administrativo");
        
        //utilizar los metodos sobrecargados 
        
        emp1.ActualizarSalario(20000); //cantidad fija tipo int
        emp2.ActualizarSalario(15.0); // porcentaje tipo double
        
        //imprimir resultados
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        
        System.out.println("Total empleados: "+Empleado.mostrarTotalEmpleados());
    }
}
