package Clases;
import java.util.ArrayList;

public class Directivo extends Empleado{

    private String categoria;
    private ArrayList<Empleado> empleados;

    public Directivo(String nombre, int edad, float sueldoBruto, String categoria) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
