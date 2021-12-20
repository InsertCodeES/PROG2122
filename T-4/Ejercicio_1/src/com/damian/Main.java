package com.damian;
import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] input = new double[10];
        for (int i=0;i<input.length;i++) {
            input[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número (" + (i+1) + "/10)"));
        }
        Arrays.sort(input);
        JOptionPane.showMessageDialog(null,"Número mayor: " + input[input.length-1] + "\nNúmero menor: " + input[0]);
    }
}
