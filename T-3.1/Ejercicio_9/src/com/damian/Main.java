package com.damian;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Introduce un día como número (1 a 7)");
        switch (input) {
            case "1": input = "Lunes"; break;
            case "2": input = "Martes"; break;
            case "3": input = "Miércoles"; break;
            case "4": input = "Jueves"; break;
            case "5": input = "Viernes"; break;
            case "6": input = "Sábado"; break;
            case "7": input = "Domingo"; break;
            default: JOptionPane.showInputDialog("El día introducido no es válido");
        }
        JOptionPane.showMessageDialog(null,"Hoy es " + input);
    }
}
