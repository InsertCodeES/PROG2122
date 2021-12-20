package com.damian;

public class Main {

    public static void main(String[] args) {
        String r = javax.swing.JOptionPane.showInputDialog("Introduce el radio de la circunferencia");
        javax.swing.JOptionPane.showMessageDialog(null,"El área de la circunferencia es " + (Math.pow(Integer.parseInt(r), 2) * Math.PI ));
    }
}
