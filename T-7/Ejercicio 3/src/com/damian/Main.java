package com.damian;
import Vista.VentanaCompraDialog;
import Vista.VentanaMain;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        VentanaCompraDialog dialog = new VentanaCompraDialog();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
