package com.damian;

public class Main {

    public static void main(String[] args) {
        double a = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Introduce el primer cateto"));
        double b = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Introduce el segundo cateto"));
        double c = Math.sqrt(Math.pow (a,2) + Math.pow (b,2));
        javax.swing.JOptionPane.showMessageDialog(null,"La hipotenusa del triángulo es " + c);
    }
}
