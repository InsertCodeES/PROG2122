package Modelo;

import java.time.LocalDate;

public class Gato extends Mascota
{
    public Gato(String raza, String nombre, LocalDate fechaNacimiento, String peso, String sexo, String longitud, String color) {
        super(raza, nombre, fechaNacimiento, peso, sexo, longitud, color);
    }
}
