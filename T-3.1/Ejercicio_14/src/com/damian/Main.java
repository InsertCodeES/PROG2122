package com.damian;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        String[] yn = {"No", "Si"};
        int aprobados = 0, respuesta;
        do {
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del alumno:"));
            if (nota>=6) {
                ++aprobados;
            }
            respuesta = JOptionPane.showOptionDialog(null,"¿Quiere continuar?","Continuar", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null, yn, yn);
        } while (respuesta!=0);
        JOptionPane.showMessageDialog(null,"Los alumnos aprobados son " + aprobados);
    }
}
