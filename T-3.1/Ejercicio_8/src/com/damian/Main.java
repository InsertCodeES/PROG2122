package com.damian;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        float nota = Float.parseFloat(JOptionPane.showInputDialog("Introduce tu nota"));

        if (nota < 1) {
            JOptionPane.showMessageDialog(null,"La nota es: Muy deficiente");
        } else if (nota < 5) {
            JOptionPane.showMessageDialog(null,"La nota es: Insuficiente");
        } else if (nota < 6) {
            JOptionPane.showMessageDialog(null,"La nota es: Suficiente");
        } else if (nota < 7) {
            JOptionPane.showMessageDialog(null,"La nota es: Bien");
        } else if (nota < 9) {
            JOptionPane.showMessageDialog(null,"La nota es: Notable");
        } else {
            JOptionPane.showMessageDialog(null,"La nota es: Sobresaliente");
        }
        }
    }