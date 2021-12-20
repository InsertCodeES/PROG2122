package com.damian;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        float[] billetes = {200,100,50,20,10,5,1,0.5f,0.2f,0.1f,0.05f,0.02f,0.01f};
        float[] cambios = new float[billetes.length];
        float input = Float.parseFloat(JOptionPane.showInputDialog("Introduce el valor del producto"));
        input = Float.parseFloat(JOptionPane.showInputDialog("Introduce el importe del pago")) - input;
        for (int i=0;i<billetes.length;i++) {
            if (input - billetes[i] >= 0) {
                do {
                    input -= billetes[i];
                    cambios[i]++;
                } while (input - billetes[i] >= 0);
            }
        }
        JOptionPane.showMessageDialog(null,msg(billetes,cambios));
    }

    private static StringBuilder msg(float[] billetes, float[] cambios) {
        StringBuilder msg = new StringBuilder();
        for (int i=0;i<billetes.length;i++) {
            if (cambios[i]!=0 && billetes[i]>1) {
                msg.append("Billetes de ").append((int)billetes[i]).append(": ").append(cambios[i]).append("\n");
            }
            else if (cambios[i]!=0) {
                msg.append("Monedas de ").append(billetes[i]).append(": ").append(cambios[i]).append("\n");
            }
        }
        return msg;
    }
}