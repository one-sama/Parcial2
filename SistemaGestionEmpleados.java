import java.util.Scanner;

public class SistemaGestionEmpleados {

    
    public static void main(String[] args) {
        final String empleadoJ="Juan";
        final  String empleadoM="María";
        final  String empleadoP="Pedro";
        final String cargo1="Desarrollador";
        final String cargo2="Diseñadora";
       final String cargo3="Gerente";
       Empleado empleado1 = new Empleado("Juan", "Desarrollador", 50000);
        Empleado empleado2 = new Empleado("María", "Diseñadora", 45000);
       Empleado empleado3 = new Empleado("Pedro", "Gerente", 60000);

       

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el porcentaje de aumento de salario: ");
        double porcentaje = scanner.nextDouble();

        
        
       
        scanner.close();
    }
}
