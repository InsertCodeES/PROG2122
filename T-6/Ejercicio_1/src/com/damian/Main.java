package com.damian;

import Figuras.Circunferencia;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio (cm)"));
        Circunferencia circle = new Circunferencia(input);

        JOptionPane.showMessageDialog(null,"La longitud es " + circle.longitud() +
                "cm\nEl área es " + circle.area()+ "cm\nEl volumen es " + circle.volumen() + "cm");
    }
}
