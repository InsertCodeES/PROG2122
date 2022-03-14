package Clases;
import java.util.Date;

public class Movimiento {

    private String fecha;
    private String descripcion;
    private double importe;

    public Movimiento(String fecha, String descripcion, double importe) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.importe = importe;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
