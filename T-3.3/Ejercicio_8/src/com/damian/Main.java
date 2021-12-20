package com.damian;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Calendar bday = PedirFecha();
        JOptionPane.showMessageDialog(null,"Edad: " + Edad(bday) + " años");
    }

    private static Calendar PedirFecha() {
        boolean bucle = true;
        Calendar date = Calendar.getInstance();
        do {
            try {
                String input1 = JOptionPane.showInputDialog("Introduce una fecha (dd-MM-yyyy)");
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                date.setTime(sdf.parse(input1));
                bucle = false;
            }
            catch (Exception ParseException) {
                JOptionPane.showMessageDialog(null,"Error: Formato incorrecto. Vuelva a intentarlo");
            }
        } while (bucle);
        return date;
    }

    private static int Edad(Calendar date) {
        Calendar today = Calendar.getInstance();
        long days = (today.getTimeInMillis() - date.getTimeInMillis()) / 86400000;
        return (int) (days/365);
    }
}
