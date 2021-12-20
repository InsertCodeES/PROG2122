package com.damian;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Introduce una frase").toUpperCase();
        JOptionPane.showMessageDialog(null,msg(input));
    }

    private static StringBuilder msg(String input) {
        String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        int[] letras = new int[abc.length()];
        for (int i=0;i<input.length();i++) {
            if (input.charAt(i)!=' ') {
                // char actual = input.charAt(i);
                // int indice = abc.indexOf(actual);
                letras[abc.indexOf(input.charAt(i))]++;
            }
        }
        return msgbuilder(letras, abc);
    }

    private static StringBuilder msgbuilder (int[] letras, String abc) {
        StringBuilder msg = new StringBuilder();
        msg.append("Cantidad de letras:\n");
        for (int i=0;i<letras.length;i++) {
            if (letras[i]!=0) {
                msg.append(abc.charAt(i)).append(": ").append(letras[i]).append("\n");
            }
        }
        return msg;
    }
}
