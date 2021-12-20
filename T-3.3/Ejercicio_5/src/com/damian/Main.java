package com.damian;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Calendar date = PedirFecha();
        Days(date);
    }

    private static Calendar PedirFecha() {
        boolean bucle = true;
        Calendar date = Calendar.getInstance();
        do {
            try {
                int day = Integer.parseInt(JOptionPane.showInputDialog("Introduce el día (dd)"));
                int month = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes (MM)"));
                int year = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año (yyyy)"));
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                date.setTime(sdf.parse(day+"-"+month+"-"+year));
                bucle = false;
            }
            catch (Exception ParseException) {
                JOptionPane.showMessageDialog(null,"Error: Formato incorrecto. Vuelva a intentarlo");
            }
        } while (bucle);
        return date;
    }

    private static void Days(Calendar date) {
        date.add(Calendar.DAY_OF_YEAR, 100);
        String dia = Day(date), mes = Month(date), year = Integer.toString(date.get(Calendar.YEAR));
        JOptionPane.showMessageDialog(null,dia + ", " + date.get(Calendar.DAY_OF_MONTH) + " de " + mes + " de " + year);
    }

    private static String Day(Calendar date) {
        String dia = "";
        System.out.println(date.get(Calendar.DAY_OF_WEEK));
        switch (date.get(Calendar.DAY_OF_WEEK)) {
            case 1: dia = "Domingo"; break;
            case 2: dia = "Lunes"; break;
            case 3: dia = "Martes"; break;
            case 4: dia = "Miércoles"; break;
            case 5: dia = "Jueves"; break;
            case 6: dia = "Viernes"; break;
            case 7: dia = "Sábado"; break;
        }
        return dia;
    }

    private static String Month(Calendar date) {
        String mes = "";
        System.out.println(date.get(Calendar.MONTH));
        switch (date.get(Calendar.MONTH)) {
            case 0: mes = "Enero"; break;
            case 1: mes = "Febrero"; break;
            case 2: mes = "Marzo"; break;
            case 3: mes = "Abril"; break;
            case 4: mes = "Mayo"; break;
            case 5: mes = "Junio"; break;
            case 6: mes = "Julio"; break;
            case 7: mes = "Agosto"; break;
            case 8: mes = "Septiembre"; break;
            case 9: mes = "Octubre"; break;
            case 10: mes = "Noviembre"; break;
            case 11: mes = "Diciembre"; break;
        }
        return mes;
    }
}