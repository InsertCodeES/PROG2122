package com.damian;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int contador = 0, num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        for (int i=2;i<=num-1;i++) {
            if (num%i==0 ) {
                i = num;
                System.out.println("Entramos en el if");
            }
            else {
                System.out.println("Entramos en el else");
                contador = contador + 1;
            }
        }
        if (contador>=num-2 && num!=2) {
            JOptionPane.showMessageDialog(null,"El número es primo");
        }
        else {
            JOptionPane.showMessageDialog(null, "El número no es primo");
        }
    }
}