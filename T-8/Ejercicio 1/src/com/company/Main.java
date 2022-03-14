package com.company;

import Modelo.Persona;
import Vistas.crearpersona;
import Vistas.datospersona;
import Vistas.principal;

import javax.swing.*;
import java.sql.*;

public class Main {

    public static boolean error = false;

    public static void main(String[] args) {

        ventana();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception e) {
            System.out.println("Problemas con la base de datos " + e.getMessage());
        }
    }

    public static Connection conectarbbdd() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/damian";
        String user = "root";
        String passwd = "usbw";
        return DriverManager.getConnection(url,user,passwd);
    }

    public static void ventana() {
        JFrame frame = new JFrame("principal");
        frame.setContentPane(new principal().jPrincipal);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void ventregistrarpersona() {
        JFrame frame = new JFrame("crearpersona");
        frame.setContentPane(new crearpersona().jpCrearpersona);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void ventbuscarpersona() {
        JFrame frame = new JFrame("datospersona");
        frame.setContentPane(new datospersona().jpDatospersona);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    public static void crearpersona(String nombre, String edad, String profesion, String telefono) {
        try {
            int age = Integer.parseInt(edad);
            int tlfono = Integer.parseInt(telefono);
            Persona a = new Persona(nombre,age,profesion,tlfono);

            Statement sentencia = conectarbbdd().createStatement();
            String s = "INSERT INTO personas VALUES ('" + a.getNombre() + "', '" + a.getEdad() + "'," +
                    " '" + a.getProfesion() + "', '" + a.getTelefono() + "')";
            sentencia.executeUpdate(s);
            conectarbbdd().close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al crear el usuario. Vuelve a intentarlo");
            error = true;
        }
    }

    public static Persona buscarpersona(String nombre) throws SQLException {
        Statement sentencia = conectarbbdd().createStatement();
        String s = "SELECT * FROM personas WHERE 'nombre' = " + nombre;
        ResultSet r = sentencia.executeQuery(s);
        r.next();
        conectarbbdd().close();
        return new Persona(nombre, r.getInt("edad"), r.getString("profesion"), r.getInt("telefono"));
    }
}