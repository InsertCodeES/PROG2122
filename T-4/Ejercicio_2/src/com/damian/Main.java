package com.damian;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int[] random = new int[Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de número aleatorios que quieres"))];
        for (int i=0;i<random.length;i++) {
            random[i] = (int) (Math.random()*10);
            System.out.println(random[i]);
        }
    }
}
