package com.damian;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String nombreM = "", nombrem = "", innom;
        int mayor = -1, menor = 11, inint;
        for (int i=0;i<=39;i++) {
            innom = JOptionPane.showInputDialog("Introduce el nombre del alumno");
            inint = Integer.parseInt(JOptionPane.showInputDialog("Introduce su nota"));
            if (inint>=mayor) {
                mayor = inint;
                nombreM = innom;
            }
            else if (inint<=menor) {
                menor = inint;
                nombrem = innom;
            }
        }
        JOptionPane.showMessageDialog(null,"Nota más alta: " + nombreM + ", " + mayor + "\nNota más baja: " + nombrem + ", " + menor);
    }
}
