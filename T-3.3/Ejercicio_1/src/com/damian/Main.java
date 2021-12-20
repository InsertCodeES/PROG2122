package com.damian;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("Introduce tu texto");
        JOptionPane.showMessageDialog(null,Compare(input));;
    }

    private static String Compare(String input) {
        // Transformo a minúscula para que funcione aún estado en mayúsculas
        input = input.toLowerCase();
        int contador = 0;
        char[] vocales = {'a','e','i','o','u'};
        for (int i = 0; i < input.length(); i++) {
            for (int x = 0; x < vocales.length; x++) {
                if (input.charAt(i) == vocales[x]) {
                    contador++;
                }
            }
        }
        return "Vocales: " + contador;
    }
}