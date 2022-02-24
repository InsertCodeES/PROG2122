package com.damian;
import java.util.ArrayList;
import Clases.*;

public class Main {

    private static ArrayList<Cliente> Clientes = new ArrayList<>();
    private static ArrayList<Cuenta> Cuentas = new ArrayList<>();
    private static ArrayList<Movimiento> Movimientos = new ArrayList<>();


    public static void main(String[] args) {

        crearusuarios();
        ventana();
    }

    public static void crearusuarios() {

        Cliente a = new Cliente("76051556D", "Damián Romero López", 5543);
        Clientes.add(a);
        a = new Cliente("01295863F", "Laura Espinosa Ibáñez", 2407);
        Clientes.add(a);
        a = new Cliente("47256865P", "Yeray Bote Tontito", 1234);
        Clientes.add(a);

        Cuenta b = new Cuenta("1010");
        Cuentas.add(b);
        b = new Cuenta("2020");
        Cuentas.add(b);
        b = new Cuenta("3030");
        Cuentas.add(b);
        b = new Cuenta("4040");
        Cuentas.add(b);

        Clientes.get(0).getCuentas().add(Cuentas.get(0));
        Clientes.get(1).getCuentas().add(Cuentas.get(1));
        Clientes.get(1).getCuentas().add(Cuentas.get(2));
        Clientes.get(2).getCuentas().add(Cuentas.get(3));

        Movimiento c = new Movimiento("01/01/1930","Prueba", 15000);
        Movimientos.add(c);
        c = new Movimiento("01/01/1930","Prueba 1", 15000);
        Movimientos.add(c);
        c = new Movimiento("01/01/1930","Prueba 2", 15000);
        Movimientos.add(c);
        c = new Movimiento("01/01/1930","Prueba 3", 15000);
        Movimientos.add(c);
        c = new Movimiento("01/01/1930","Prueba 4", 15000);
        Movimientos.add(c);
        c = new Movimiento("01/01/1930","Prueba 5", 15000);
        Movimientos.add(c);
        c = new Movimiento("01/01/1930","Prueba 6", 15000);
        Movimientos.add(c);


    }

    private static void ventana() {
        Vista.Main dialog = new Vista.Main();
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        System.exit(0);
    }
}
