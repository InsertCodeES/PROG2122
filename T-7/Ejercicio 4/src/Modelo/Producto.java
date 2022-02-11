package Modelo;
import java.util.ArrayList;

public class Producto {
    private String nombre;
    private int unidades;
    private double precio;
    private ArrayList<Proveedor> listaproveedores;

    public Producto(String nombre, int unidades, double precio) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Proveedor> getListaproveedores() {
        return listaproveedores;
    }

    public void setListaproveedores(ArrayList<Proveedor> listaproveedores) {
        this.listaproveedores = listaproveedores;
    }
}
