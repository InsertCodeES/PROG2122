package Clases;
import java.util.ArrayList;

public class Cliente {

    private String dni;
    private String nombreApellidos;
    private int clave;
    private ArrayList<Cuenta> cuentas;

    public Cliente(String dni, String nombreApellidos, int clave) {
        this.dni = dni;
        this.nombreApellidos = nombreApellidos;
        this.clave = clave;
        cuentas = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
