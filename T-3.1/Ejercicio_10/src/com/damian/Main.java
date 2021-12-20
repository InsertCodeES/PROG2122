package com.damian;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int mayor = 0;
        int menor = 0;

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número a comparar"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer número"));

        if (n1 > n2) {
            mayor = Math.max(n1, n3);
            menor = Math.min(n2, n3);
        }
        else {
            mayor = Math.max(n2, n3);
            menor = Math.min(n1, n3);
        }
        JOptionPane.showMessageDialog(null,"El número mayor es " + mayor + " y el menor es " + menor);
    }
}
/* Manera original
    if (n1 > n2) {
            if (n1 > n3) {
                mayor = n1;
            }
            else {
                mayor = n3;
            }
            if (n2 < n3) {
                menor = n2;
            }
            else {
                menor = n3;
            }
        }
        else {
            if (n2 > n3) {
                mayor = n2;
            } else {
                mayor = n3;
            }
            if (n1 < n3) {
                menor = n1;
            } else {
                menor = n3;
            }
        }
* */