package com.damian;
import javax.swing.*;

public class Main {
    private static int cont = 0;

    public static void main(String[] args) {
        int[][] notas = new int[5][30];
        do {
            datos(notas);
            cont++;
        } while(JOptionPane.showConfirmDialog(null,"¿Quiere añadir más alumnos?")==0);
        JOptionPane.showMessageDialog(null,msgbuilder(notas));
    }

    private static void datos (int[][] notas) {
        try {
            notas[cont][0] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el código del alumno"));
            faltas(notas);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null,"Error: Solo se permiten 5 alumnos. Se " +
                    "imprimirá el mensaje con el resto de alumnos");
            msgbuilder(notas);
        }
    }

    private static void faltas (int[][] notas) {
        int index2 = 1;
        do {
            notas[cont][index2] = Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas de falta"));
            index2++;
        } while(JOptionPane.showConfirmDialog(null,"¿Añadir más faltas al alumno " +
                notas[cont][0] + "?")==0);
    }

    private static StringBuilder msgbuilder (int[][] notas) {
        StringBuilder msg = new StringBuilder();
        for (int i=0;i<5;i++) {
            int total = 0;
            for (int x=1;x<notas.length;x++) {
                total += notas[i][x];
            }
            if (total!=0) {
                msg.append("Alumno ").append(notas[i][0]).append(": ").append(total).append(" faltas\n");
            }
        }
        return msg;
    }
}