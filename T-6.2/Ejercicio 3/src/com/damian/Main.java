package com.damian;

import Clases.Cliente;
import Clases.Directivo;
import Clases.Empleado;
import Clases.Empresa;
import javax.swing.*;
import java.util.ArrayList;


/* Falté a esta clase y le pedí a Yeray que me pasase el ejercicio para verlo en casa y entenderlo. He adaptado cosas
para encontrarlo más cómodo a la hora de repasar. Como las funciones que me piden en las clases no las utilizo, he hecho
simples void que no contienen nada */

public class Main {
    static ArrayList<Empleado> listaEmpleados;
    static ArrayList<Cliente> listaClientes;
    static ArrayList<Directivo> listaDirectivos;
    static ArrayList<Empresa> listaEmpresas;

    public static void main(String[] args) {
        try {
            crearEmpleados();
            crearClientes();
            crearDirectivos();
            crearEmpresas();
            masSubordinados();
        }
        catch (Exception e) {
            System.out.println(e.getClass());
            JOptionPane.showMessageDialog(null,"Se ha producido un error. La aplicación se cerrará");
        }
    }

    public static void crearEmpleados() {
        listaEmpleados = new ArrayList<>();
        Empleado a = new Empleado("Manu", 32, 1500);
        listaEmpleados.add(a);
        Empleado b = new Empleado("Laura", 19, 1500);
        listaEmpleados.add(b);
        Empleado c = new Empleado("Yeray", 32, 3000);
        listaEmpleados.add(c);
        Empleado d = new Empleado("Adrián", 27, 3000);
        listaEmpleados.add(d);
    }

    public static void crearClientes() {

        listaClientes = new ArrayList<>();
        Cliente a = new Cliente("Iñigo", 19, 111111111);
        listaClientes.add(a);
        Cliente b = new Cliente("Damián", 19, 222222222);
        listaClientes.add(b);
        Cliente c = new Cliente("Ania", 19, 333333333);
        listaClientes.add(c);
    }

    public static void crearDirectivos() {

        ArrayList<Empleado> lista;
        listaDirectivos = new ArrayList<>();

        lista = new ArrayList();
        lista.add(listaEmpleados.get(0));
        lista.add(listaEmpleados.get(1));
        lista.add(listaEmpleados.get(2));


        Directivo a = new Directivo("Yeray", 18, 2000, "Marketing", lista);
        listaDirectivos.add(a);

        lista = new ArrayList();
        lista.add(listaEmpleados.get(0));
        lista.add(listaEmpleados.get(3));
        Directivo b = new Directivo("Aritz", 14, 2200, "Notario", lista);
        listaDirectivos.add(b);

        lista = new ArrayList();
        lista.add(listaEmpleados.get(0));
        lista.add(listaEmpleados.get(1));
        lista.add(listaEmpleados.get(2));
        lista.add(listaEmpleados.get(3));
        Directivo c = new Directivo("Nacho", 23, 2500, "Relaciones Publicas", lista);
        listaDirectivos.add(c);
    }

    public static void crearEmpresas() {
        listaEmpresas = new ArrayList<>();
        Empresa a = new Empresa("Egoland", listaEmpleados, listaClientes);
        listaEmpresas.add(a);
    }

    public static void masSubordinados() {
        int max = 0;
        int posicion = 0;
        for (int x = 0; x < listaDirectivos.size(); x++) {
            if (listaDirectivos.get(x).getEmpleados().size() > max) {
                max = listaDirectivos.get(x).getEmpleados().size();
                posicion = x;
            }
        }
        JOptionPane.showMessageDialog(null, "El directivo con más subordinados es " +
                listaDirectivos.get(posicion).getNombre() + " (" + max + ")");
    }
}