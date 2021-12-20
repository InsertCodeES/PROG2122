package com.damian;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int[] mes = new int[12];
        datos(mes);
        JOptionPane.showMessageDialog(null,msg(mes));
    }

    private static void datos(int[] mes) {
        try {
            do {
                int litros = Integer.parseInt(JOptionPane.showInputDialog("Introduce los litros precipitados"));
                int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el día del mes"));
                mes[Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes (1 al 12)"))-1] += litros;
            } while (JOptionPane.showConfirmDialog(null,"¿Quieres continuar", "Continuar", JOptionPane.YES_NO_OPTION)==0);
        }
        catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null,"Valor de mes no válido. Vuelva a intentarlo");
            datos(mes);
        }
    }

    private static StringBuilder msg(int[] mes) {
        StringBuilder msg = new StringBuilder();
        for (int i=0;i<mes.length;i++) {
            if (mes[i]!=0) {
                msg.append("Mes ").append(i+1).append(": ").append(mes[i]).append(" litros\n");
            }
        }
        return msg;
    }
}