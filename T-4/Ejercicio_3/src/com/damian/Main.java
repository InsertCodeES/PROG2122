package com.damian;
import javax.swing.*;
import java.util.Objects;

public class Main {

    private static String abc[] = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public static void main(String[] args) {

        StringBuilder msg = new StringBuilder();
        function(msg);
        JOptionPane.showMessageDialog(null, "Mensaje completo: " + msg);
    }

    private static StringBuilder function(StringBuilder msg) {
        int num = (Integer.parseInt(JOptionPane.showInputDialog("Escribe un número (1 al 27)"))-1);
        do {
            if (num>27) {
                JOptionPane.showMessageDialog(null,"Número no válido. Vuelva a intentarlo");
                function(msg);
            }
            else if (num==-1) {
                return msg;
            }
            msg.append(abc[num]);
            num = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número (1 al 27)"));
        } while (num!=-1);
        return msg;
    }
}
