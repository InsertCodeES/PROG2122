package com.damian;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int cuadrado = 0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu número a calcular al cuadrado"));
        for (int i=1;i<=num;i++) {
            cuadrado = cuadrado + num;
        }
        JOptionPane.showMessageDialog(null,"El cuadrado de " + num + " es " + cuadrado);
    }
}