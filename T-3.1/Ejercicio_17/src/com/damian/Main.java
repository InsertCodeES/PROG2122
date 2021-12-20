package com.damian;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        StringBuilder serie = new StringBuilder("");
        int in = 0, a=0, b=1, c=1;
        in = Integer.parseInt(JOptionPane.showInputDialog("Introduce cuántos números de la serie de Fibonacci quieres"));
        for (int i=1; i<=in-1; i++) {
            serie.append(c).append(", ");
            c = a+b;
            a = b;
            b = c;
        }
        // Saco aquí el append para que el último dígito sea seguido por un punto y no una coma.
        serie.append(c).append(".");
        JOptionPane.showMessageDialog(null, serie);
    }
}
