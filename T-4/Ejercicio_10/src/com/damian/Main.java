package com.damian;
import com.sun.tools.internal.xjc.reader.xmlschema.BindPurple;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String[] options = {"Rellenar", "Sumar fila", "Sumar columna", "Sumar diagonal principal", "Sumar diagonal inversa", "Media", "Salir"};
        int[][] arreglo = new int[4][4];
        int input = JOptionPane.showOptionDialog(null, "Eliga una opción", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
        if (input!=6) {
            menu(input);
            do {
                menu(JOptionPane.showOptionDialog(null, "Eliga una opción", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null));
            } while (JOptionPane.showConfirmDialog(null,"¿Quieres continuar?","Confirmar",JOptionPane.YES_NO_OPTION)==0);
        }

    }

    private static void menu(int input) {
        switch (input) {
            case 0:
                rellenar();
                break;
            case 1:
                sumarfila();
                break;
            case 2:
                sumarcolumna();
                break;
            case 3:
                sumardiagonal();
                break;
            case 4:
                sumardiagonal2();
                break;
            case 5:
                media();
                break;
            default:
                break;
        }
    }

    private static void rellenar() {

    }

    private static void sumarfila() {

    }

    private static void sumarcolumna() {

    }

    private static void sumardiagonal() {

    }

    private static void sumardiagonal2() {

    }

    private static void media() {

    }
}
