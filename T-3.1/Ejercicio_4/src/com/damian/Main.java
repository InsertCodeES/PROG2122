package com.damian;

public class Main {

    public static void main(String[] args) {
        String temp = javax.swing.JOptionPane.showInputDialog("Introduce la temperatura a transformar (Cº)");
        javax.swing.JOptionPane.showMessageDialog(null,"La temperatura en Fahrenheit es " + (1.8f * Integer.parseInt(temp) + 32));
    }
}
