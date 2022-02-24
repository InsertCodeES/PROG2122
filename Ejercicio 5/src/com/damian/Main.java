package com.damian;
import java.util.ArrayList;
import Clases.*;
import Vista.principal;

import javax.swing.*;

public class Main {

    private static ArrayList<Cliente> Clientes = new ArrayList<>();
    private static ArrayList<Cuenta> Cuentas = new ArrayList<>();
    private static ArrayList<Movimiento> Movimientos = new ArrayList<>();
    public static int poscliente;


    public static void main(String[] args) {

        crearusuarios();
        login();
    }

    public static void crearusuarios() {

        Cliente a = new Cliente("1010", "Damián Romero López", 1010);
        Clientes.add(a);
        a = new Cliente("2020", "Laura Espinosa Ibáñez", 2020);
        Clientes.add(a);
        a = new Cliente("3030", "Yeray Bote Tontito", 3030);
        Clientes.add(a);

        Cuenta b = new Cuenta("1111");
        Cuentas.add(b);
        b = new Cuenta("2222");
        Cuentas.add(b);
        b = new Cuenta("3333");
        Cuentas.add(b);
        b = new Cuenta("4444");
        Cuentas.add(b);

        Clientes.get(0).getCuentas().add(Cuentas.get(0));
        Clientes.get(1).getCuentas().add(Cuentas.get(1));
        Clientes.get(1).getCuentas().add(Cuentas.get(2));
        Clientes.get(2).getCuentas().add(Cuentas.get(3));

        Movimiento c = new Movimiento("01/01/1930","Prueba 1", 15000);
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

        Clientes.get(1).getCuentas().get(0).getMovimientos().add(Movimientos.get(0));
        Clientes.get(1).getCuentas().get(0).getMovimientos().add(Movimientos.get(1));
        Clientes.get(1).getCuentas().get(0).getMovimientos().add(Movimientos.get(2));
        Clientes.get(1).getCuentas().get(0).getMovimientos().add(Movimientos.get(3));
        Clientes.get(1).getCuentas().get(0).getMovimientos().add(Movimientos.get(4));
        Clientes.get(1).getCuentas().get(0).getMovimientos().add(Movimientos.get(5));

    }

    private static void login() {
        JFrame frame = new JFrame("principal");
        frame.setContentPane(new principal().panel1);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void validar(String ID, String pass) {
        boolean si = false;
        int pawd = Integer.parseInt(pass);
        for (int i = 0; i < Clientes.size(); i++) {
            if (Clientes.get(i).getDni().equals(ID) && Clientes.get(i).getClave() == pawd) {
                poscliente = i;
                si = true;
            };
        }
        
        if (si) {
            cuenta();
        }
        else {
            JOptionPane.showMessageDialog(null,"Error: NIF o clave incorrectos. Vuelve a intentarlo");
        }
    }

    public static void cuenta() {

    }


}
