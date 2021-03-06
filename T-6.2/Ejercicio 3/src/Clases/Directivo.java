package Clases;
import java.util.ArrayList;

public class Directivo extends Empleado{

    private String categoria;
    private ArrayList<Empleado> empleados;

    public Directivo(String nombre, int edad, float sueldoBruto, String categoria, ArrayList<Empleado> empleados) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;
        this.empleados = empleados;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void mostrar() {
    }
}
