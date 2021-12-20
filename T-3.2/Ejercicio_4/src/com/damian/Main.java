package com.damian;
import javax.swing.*;

public class Main {
    private static float mediaglobal = 0;
    private static int contador = 0;
    // Declaramos mediaglobal como float para que la operación final salga como decimal en caso de que haya
    public static void main(String[] args) {
        String nombre = "";
        nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno");
        Bucle(nombre);
    }

    private static void Bucle(String nombre) {
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Primera nota"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Segunda nota"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Tercera nota"));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Cuarta nota"));
        n5 = Integer.parseInt(JOptionPane.showInputDialog("Quinta nota"));
        n6 = Integer.parseInt(JOptionPane.showInputDialog("Sexta nota"));
        contador++;
        Media(nombre, n1, n2, n3, n4, n5, n6);
    }

    private static void Media(String nombre, int n1, int n2, int n3, int n4, int n5, int n6) {
        int media = 0;
        media = media + (n1 + n2+ n3 + n4 + n5 + n6) / 6;
        mediaglobal = mediaglobal + media;
        JOptionPane.showMessageDialog(null,nombre + ". Nota media: " + media);
        Confirmar(nombre, n1, n2, n3, n4, n5, n6);
    }

    private static void Confirmar(String nombre, int n1, int n2, int n3, int n4, int n5, int n6) {
        nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno o fin");
        nombre = nombre.toUpperCase();
        if (!nombre.equals("FIN")) {
            Bucle(nombre);
        }
        else {
            Final();
        }
    }

    private static void Final() {
        JOptionPane.showMessageDialog(null, "La media total es de " + mediaglobal / contador);
    }
}