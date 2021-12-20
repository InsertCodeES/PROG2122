package com.damian;
import javax.swing.*;
import java.util.Objects;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int random = aleatorio.nextInt(101), num=0;
        String in = JOptionPane.showInputDialog("Introduce un número del 0 al 100");
        while (!in.equalsIgnoreCase("fin")) {
            num = Integer.parseInt(in);
                if (num>random) {
                    in = JOptionPane.showInputDialog(null,"El número es menor. Vuelve a intentarlo");
                }
                else {
                    in = JOptionPane.showInputDialog(null,"El número es mayor. Vuelve a intentarlo");
                }
        }
        JOptionPane.showMessageDialog(null,"Enhorabuena, el número era " + num);
    }
}