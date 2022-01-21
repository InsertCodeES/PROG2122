package Modelo;

import java.time.LocalDate;

public class Perro extends Mascota
{
    public Perro(String raza, String nombre, LocalDate fechaNacimiento, String peso, String sexo, String longitud, String color) {
        super(raza, nombre, fechaNacimiento, peso, sexo, longitud, color);
    }
}