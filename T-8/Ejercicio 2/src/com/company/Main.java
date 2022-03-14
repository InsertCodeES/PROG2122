package com.company;

import Modelo.UML.Evento;
import Vista.crearEvento;
import Vista.principal;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

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
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new principal().jpPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void ventanacrearevento() {
        JFrame frame = new JFrame("crearEvento");
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new crearEvento().crearEvento);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void crearevento(String nombre, String lugar, String date, String horai, String horaf, String afor) throws ParseException {
        try {
            Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(date);

            SimpleDateFormat format = new SimpleDateFormat("HH:mm");
            java.util.Date d1 =(java.util.Date)format.parse(horai);
            java.sql.Time horainicio = new java.sql.Time(d1.getTime());
            java.util.Date d2 =(java.util.Date)format.parse(horaf);
            java.sql.Time horafinal = new java.sql.Time(d1.getTime());

            int aforo = Integer.parseInt(afor);
            Evento a = new Evento(nombre,lugar,fecha,horai,horaf,afor);

            Statement sentencia = conectarbbdd().createStatement();

            sentencia.executeUpdate(s);
            conectarbbdd().close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al crear el usuario. Vuelve a intentarlo");
            error = true;
        }


    }



}
