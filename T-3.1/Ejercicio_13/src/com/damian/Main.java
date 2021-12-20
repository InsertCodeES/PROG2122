package com.damian;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int suma = 0;
        for (int i=1;i<=10;i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número " + i));
            suma = num + suma;
        }
        JOptionPane.showMessageDialog(null,"El resultado final es " + suma);
    }
}
