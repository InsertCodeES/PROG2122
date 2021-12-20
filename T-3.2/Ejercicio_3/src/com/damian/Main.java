package com.damian;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
            String opc = Menu();
            switch(opc) {
                case "0":
                    Sumar();
                    break;
                case "1":
                    Restar();
                    break;
                case "2":
                    Tabla();
                    break;
                case "3":
                    Division();
            }
    }

    public static String Menu() {
        String[] opciones = {"Sumar", "Restar", "Tabla de multiplicar", "División", "Salir"};
        return Integer.toString(JOptionPane.showOptionDialog(null, "Elige tu operación:\n", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]));
    }

    public static int Numero() {
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
    }

    public static void Sumar() {
        int n1 = Numero();
        int n2 = Numero();
        JOptionPane.showMessageDialog(null, " El resultado de la suma es: " + (n1 + n2), "Suma", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void Restar() {
        int n1 = Numero();
        int n2 = Numero();
        JOptionPane.showMessageDialog(null, " El resultado de la resta es: " + (n1 - n2), "Resta", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void Tabla() {
        String tabla = "";
        int n1 = Numero();

        for(int x = 0; x < 11; ++x) {
            tabla = tabla + n1 + " x " + x + " = " + n1 * x + "\n";
        }

        JOptionPane.showMessageDialog(null, tabla, "Tabla de multiplicar", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void Division() {
        int n1 = Numero();
        int n2 = Numero();
        JOptionPane.showMessageDialog(null, " El cociente es " + n1 / n2 + " y el resto " + n1 % n2, "División", JOptionPane.INFORMATION_MESSAGE);
    }
}
