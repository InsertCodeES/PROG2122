package com.damian;
import Clases.Estudio;
import Clases.Pelicula;

public class Main {

    public static void main(String[] args) {
        // Creación de estudios
        Estudio Estudios[] = new Estudio[3];

        Estudios[0] = new Estudio("Espinosa","Madrid","Manuel Díaz de Arcaya 3 2B",
                "Espinosa.com",2002,"España",625752027);
        Estudios[1] = new Estudio("Romero","Vitoria-Gasteiz","Estrasburgo Ibilbidea 4 4C",
                "Romero.com",2004,"España",646764466);
        Estudios[2] = new Estudio("López","Barcelona","Nose 24 8B",
                "Lopez.com",2000,"España",606007782);

        // Creación de películas
        Pelicula Peliculas[] = new Pelicula[3];

        Peliculas[0] = new Pelicula("Avatar",2008,230,"Ficción");
    }
}
