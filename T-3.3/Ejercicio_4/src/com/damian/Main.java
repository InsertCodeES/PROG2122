package com.damian;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Calendar date1 = PedirFecha();
        Calendar date2 = PedirFecha();
        JOptionPane.showMessageDialog(null, Days(date1, date2));
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

    private static String Days(Calendar date1, Calendar date2) {
        long fecha1, fecha2;
        fecha1 = date1.getTimeInMillis();
        fecha2 = date2.getTimeInMillis();
        // Uso la función de Math.abs() para recoger el valor absoluto. Si fecha1 es menor que fecha2, devuelve un valor positivo.
        return "La diferencia entre las fechas es de " + Math.abs((fecha1 - fecha2)/86400000) + " días";
    }
}