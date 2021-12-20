package com.damian;

import javax.swing.*;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Introduce un mes en letras").toUpperCase();
        JOptionPane.showMessageDialog(null,function(input));
    }

    private static String function(String input) {
        String[] meses = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
        for (String mes : meses) {
            if (Objects.equals(input, mes)) {
                return "El mes es correcto";
            }
        }
        return "Ese mes no existe";
    }
}