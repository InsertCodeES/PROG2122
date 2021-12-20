package com.damian;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Calendar date = PedirFecha();
        JOptionPane.showMessageDialog(null,"La estación es " + Seasons(date));
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


    private static String Seasons(Calendar date) {
        int month = date.get(Calendar.MONTH);
        int day = date.get(Calendar.DAY_OF_MONTH);

        //No lo hago con Calendar.DAY_OF_YEAR porque si lo uso y el año es bisiesto, el programa no funcionaría bien
        if (month<2) {
            return "Invierno";
        }
        else if (month==2) {
            if (day<=20) {
                return "Invierno";
            }
            else {
                return "Primavera";
            }
        }
        else if (month<5) {
            return "Primavera";
        }
        else if (month==5) {
            if (day<=20) {
                return "Primavera";
            }
            else {
                return "Verano";
            }
        }
        else if (month<8) {
            return "Verano";
        }
        else if (month==8) {
            if (day<=20) {
                return "Verano";
            }
            else {
                return "Otoño";
            }
        }
        else if (month<11) {
            return "Otoño";
        }
        else {
            if (month==11 && day <=20) {
                return "Otoño";
            }
            else {
                return "Invierno";
            }
        }
    }
}
