package com.damian;

import Excepciones.DatoNoValido;
import Modelo.*;
import java.awt.Component;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Main {
    private static ArrayList<Veterinario> listaVeterinarios;
    private static ArrayList<Mascota> listaMascotas;

    public Main() {
    }

    public static void main(String[] args) {
        try {
            guardarDatos();
        } catch (NullPointerException var2) {
            JOptionPane.showMessageDialog((Component)null, "El programa termina");
        } catch (Exception var3) {
            System.out.println("Problemas: " + var3.getClass());
        }

    }

    public static void guardarDatos() throws Exception {
        guardarVeterinarios();
        guardarMascotas();
    }

    public static void guardarVeterinarios() throws Exception {
        boolean seguir = true;
        listaVeterinarios = new ArrayList();

        while(seguir) {
            listaVeterinarios.add(new Veterinario(solicitarDato("Nombre", "Teclea el nombre del veterinario",
                    "^[A-Z][a-z]+([ ][A-Z][a-z]+)*$"), solicitarDato("Dirección", "Teclea la dirección",
                    "^C/ [A-Z][a-z]+([ ][A-Z][a-z]+)* [0-9]{1,3} [0-9][a-zA-Z]$"), solicitarDato("Teléfono",
                    "Teclea el teléfono", "^[6789][0-9]{8}$"), solicitarDato("DNI", "Teclea el DNI",
                    "^[0-9]{8}[A-Za-z]$"), solicitarDato("Número de la seguridad social", "Teclea el número de la seguridad social",
                    "^01 [0-9]{8} [0-9]{2}$")));
            int respuesta = JOptionPane.showConfirmDialog((Component)null, "¿Hay más veterinarios?");
            if (respuesta != 0) {
                seguir = false;
            }
        }
    }

    public static String solicitarDato(String dato, String mensaje, String exp) throws Exception {
        String variable = "";
        boolean error = true;

        while(error) {
            try {
                variable = JOptionPane.showInputDialog(mensaje);
                if (variable.isEmpty()) {
                    throw new DatoNoValido(dato + " es un campo obligatorio");
                }

                Pattern pat = Pattern.compile(exp);
                Matcher mat = pat.matcher(variable);
                if (!mat.matches()) {
                    throw new DatoNoValido(dato + " no tiene un formato adecuado");
                }

                error = false;
            } catch (DatoNoValido var7) {
                JOptionPane.showMessageDialog((Component)null, var7.getMessage());
            }
        }

        return variable;
    }

    public static void guardarMascotas() throws Exception {
        boolean seguir = true;
        listaMascotas = new ArrayList();

        while(seguir) {
            listaMascotas.add(new Mascota(solicitarDato("Raza", "Introduce la raza",
                    "^[A-Z][a-z]+([ ][A-Z][a-z]+)*$"), solicitarDato("Nombre", "Introduce el nombre",
                    "^[A-Z][a-z]+([ ][A-Z][a-z]+)*$"), solicitarDato("Fecha de nacimiento",
                    "Introduce la fecha de nacimiento (DD/mm/YYYY)", "^[0-9]{2}[/][0-9]{2}+[/][0-9]{4}+$"),
                    solicitarDato("Peso", "Introduzca el peso", "^[0-9]{2}$"), solicitarDato("Sexo",
                    "Introduce el sexo (M/H)", "^[MmHh]$"), solicitarDato("Longitud",
                    "Introduce la longitud (cm)", "^\d$")));
            int respuesta = JOptionPane.showConfirmDialog((Component)null, "¿Hay más mascotas?");
            if (respuesta != 0) {
                seguir = false;
            }
        }
    }
}
