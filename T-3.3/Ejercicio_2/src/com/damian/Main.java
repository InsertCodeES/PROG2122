package com.damian;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Introduce una frase");
        JOptionPane.showMessageDialog(null,Reverse(input));
    }

    private static String Reverse(String input) {
        StringBuilder reverse = new StringBuilder();
        char chr;
        for (int i=0;i<input.length();i++) {
            chr = input.charAt(i);
            reverse.insert(0, chr);
        }
        return "Frase original: " + input + "\nFrase revertida: " + reverse;
    }
}