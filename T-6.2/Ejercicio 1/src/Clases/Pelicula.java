package Clases;
import java.util.ArrayList;

public class Pelicula {

    private String titulo;
    private int year;
    private int duracion;
    private String tipo;
    private ArrayList<Estudio> estudios;

    public Pelicula(String titulo, int year, int duracion, String tipo, ArrayList<Estudio> estudios) {
        this.titulo = titulo;
        this.year = year;
        this.duracion = duracion;
        this.tipo = tipo;
        this.estudios = estudios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Estudio> getEstudios() {
        return estudios;
    }

    public void setEstudios(ArrayList<Estudio> estudios) {
        this.estudios = estudios;
    }
}