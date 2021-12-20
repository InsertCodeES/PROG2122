package com.damian;

public class Main {

    public static void main(String[] args) {
        String b = javax.swing.JOptionPane.showInputDialog("Introduce la base del rectángulo");
        String h = javax.swing.JOptionPane.showInputDialog("Introduce la altura");
        javax.swing.JOptionPane.showMessageDialog(null,"El perímetro es igual a " + (Integer.parseInt(b)*2 + Integer.parseInt(h)*2));
    }
}
