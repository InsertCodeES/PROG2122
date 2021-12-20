package com.damian;
import javax.swing.*;

public class Main {
    private static int[][] ventas = new int[10][2];

    public static void main(String[] args) {
        ventas[0][0] = 10; ventas[1][0] = 23; ventas[2][0] = 30; ventas[3][0] = 47; ventas[4][0] = 55;
        ventas[5][0] = 65; ventas[6][0] = 135; ventas[7][0] = 256; ventas[8][0] = 526; ventas[9][0] = 663;
        datos();
    }

    private static void datos() {
        int input = check();
        if (input!=-1) {
            venta(input);
        }
        else {
            JOptionPane.showMessageDialog(null,"Error: Código no encontrado. " +
                    "Vuelva a intentarlo");
            datos();
        }
    }

    private static int check() {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Introduce el código del producto"));
        for (int i=0;i<ventas.length;i++) {
            if (ventas[i][0] == input) {
                return i;
            }
        }
        return -1;
    }

    private static void venta(int input) {
        ventas[input][1] += Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de " +
                "productos vendidos"));
        if (JOptionPane.showConfirmDialog(null,"¿Quiere añadir más productos?")==0) {
            datos();
        }
        else {
            sort();
            msgbuilder();
        }
    }

    private static void sort() {
        for (int i=0;i<ventas.length-1;i++) {
            for (int j=i+1;j<ventas.length;j++) {
                if (ventas[i][1]>ventas[j][1]) {
                    int temp1 = ventas[i][0];
                    ventas[i][0] = ventas[j][0];
                    ventas[j][0] = temp1;
                    int temp2 = ventas[i][1];
                    ventas[i][1] = ventas[j][1];
                    ventas[j][1] = temp2;
                }
            }
        }
    }

    private static void msgbuilder() {
        StringBuilder msg = new StringBuilder();
        msg.insert(0,"Ventas totales:\n");
        for (int[] venta : ventas) {
            if (venta[1] != 0) {
                msg.append(venta[1]).append(" ventas del producto \"").append(venta[0]).append("\"\n");
            }
        }
        JOptionPane.showMessageDialog(null,msg);
    }
}