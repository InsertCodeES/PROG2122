package com.damian;

public class Main {

    public static void main(String[] args) {
        double precio = 0;
        int minutos = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Introduce los minutos que ha consumido"));

        if (minutos < 300) {
            precio = minutos * 0.04;
        }
        else if (minutos <= 500) {
            precio = minutos * 0.03;
        }
        // 9 en este caso son los 300 primeros minutos por 0.03, siempre va a salir ese valor así que veo inútil introducir la operación
        else if (minutos <= 800) {
            precio = 9 + (minutos-300) * 0.02;
        }
        else {
            precio = (9 + (minutos-300) * 0.02) - (9 + (minutos-300) * 0.02)*0.0125;
        }
        javax.swing.JOptionPane.showMessageDialog(null, "El precio total asciende a " + precio + "€");
    }
}