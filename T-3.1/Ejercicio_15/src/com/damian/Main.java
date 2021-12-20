package com.damian;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int contador = 0, salida, media = 0, total = 0, edad;
        String[] yn = {"No", "Si"};
        do {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante"));
            total = edad + total;
            ++contador;
            salida = JOptionPane.showOptionDialog(null,"¿Quieres continuar?", null, JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,yn,yn);
        } while (salida==1);
        JOptionPane.showMessageDialog(null,"La media de edad es " + (total / contador));
    }
}