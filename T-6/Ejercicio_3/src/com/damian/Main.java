package com.damian;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Persona> Personas;

    public static void main(String[] args) {
        Personas = new ArrayList<>();

        Persona Manolo = new Persona("Manolo","20/04/2002", "Tierno Galván 3 2A", 25565, "Herreruela");
        Personas.add(Manolo);
        Persona Pepe = new Persona("Pepe","20/04/1990", "Paseo Estraburgo 4 4C", 01002, "Elche");
        Personas.add(Pepe);
        Persona Laura = new Persona("Laura","24/07/2002", "Yoquese 9 4C", 15506, "Daganzo de Arriba");
        Personas.add(Laura);
        Persona Ajelandro = new Persona("Laura","24/07/2006", "Yoquese 3 4C", 15506, "Daganzo de Arriba");

        mayor();
        elche();
        mayoresedad();
    }

    private static void mayor() {
        int mayor=0;
        for (int i=0;i<Personas.size();i++) {

        }
        JOptionPane.showMessageDialog(null,"El mayor es");
    }

    private static void elche() {
        for (int i=0;i<Personas.size();i++) {

        }
        JOptionPane.showMessageDialog(null,"Residentes en Elche: ");
    }

    private static void mayoresedad() {
        for (int i=0;i<Personas.size();i++) {

        }
        JOptionPane.showMessageDialog(null,"Mayores de edad: ");
    }
}