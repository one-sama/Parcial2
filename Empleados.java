import java.util.ArrayList;

public class Empleados {
private ArrayList<Empleado> lista;
    
    
    public Empleados(ArrayList<Empleado> listaEmpleados) {
        this.lista = listaEmpleados;
    }


    public ArrayList<Empleado> getLista() {
        return lista;
    }
    public void setLista(ArrayList<Empleado> listaEmpleados) {
        this.lista = listaEmpleados;
    }
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            double empleadoSalario=0;
            empleadoSalario=empleado.getSalario();
            empleadoSalario = nuevoSalario;
        }
    }
    public void mostrarEmplado(){
        System.out.println("Lista de Empleados:");
        for (Empleado empleado : lista) {
            System.out.println(empleado.getNombre());
        }
    }
    public  void añadirEmpleado(Empleado empleados){
        lista.add(empleados);
}
}