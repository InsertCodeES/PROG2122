package com.damian;

public class Main {

    public static void main(String[] args) {
        String n1 = javax.swing.JOptionPane.showInputDialog("Introduzca el primer número a multiplicar");
        String n2 = javax.swing.JOptionPane.showInputDialog("Introduzca el segundo número");
        javax.swing.JOptionPane.showMessageDialog(null,"El resultado es " + Integer.parseInt(n1) * Integer.parseInt(n2));
    }
}
