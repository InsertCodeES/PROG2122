package com.damian;

import Modelo.Proveedor;
import Vistas.MainDialog;

public class Main {

    public static void main(String[] args) {

        Proveedor Carrefour = new Proveedor("Carrefour");


        MainDialog dialog = new MainDialog();
        dialog.setSize(300,300);
        dialog.setLocationRelativeTo(null);
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private static void boolean NombreProducto() {

    }
}
