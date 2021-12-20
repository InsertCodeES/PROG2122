package com.damian;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import Excepciones.*;

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            menu();
        }
        catch (EvenIguales e) {
            JOptionPane.showMessageDialog(null, "Error: Los números son iguales. La aplicación se cerrará");
        }
        catch (Exception e) {
            System.out.println(e.getClass());
        }
    }

    private static void menu() throws Exception{
        String[] options = {"Edad", "Pares y primos", "Palíndromos", "Salir"};
        int i = JOptionPane.showOptionDialog(null,"Seleccione una opción: ","Menú",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);
        switch (i) {
            case 0: age(); break;
            case 1: even(); break;
            case 2: palindromos(); break;
        }
    }

    private static void age() throws Exception{
        String rawbday = JOptionPane.showInputDialog(null, "Introduce tu fecha de nacimiento (dd/MM/yyyy)");
        Calendar date = Calendar.getInstance();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            date.setTime(sdf.parse(rawbday));
            JOptionPane.showMessageDialog(null, "Edad: " + edadcalculo(date) + "\nDías hasta el próximo cumpleaños: " + birthday(date));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de formato. Vuelva a intentarlo");
            age();
        }
    }

    private static int edadcalculo(Calendar bday) throws Exception{
        Calendar date = Calendar.getInstance();
        long edad = (date.getTimeInMillis() - bday.getTimeInMillis()) / 86400000 / 365;
        return (int) edad;
    }

    private static int birthday(Calendar bday) throws Exception{
        // Podría haber cogido el valor de edadcalculo() para los años de diferencia, pero prefería hacerlas independientes
        Calendar date = Calendar.getInstance();
        long years = (date.getTimeInMillis() - bday.getTimeInMillis()) / 86400000 / 365;
        bday.add(Calendar.YEAR, (int) years + 1);
        long nextbday = (bday.getTimeInMillis() - date.getTimeInMillis()) / 86400000;
        return (int) nextbday;
    }

    private static void even() throws Exception{
        int num1 = pedirnumero(), num2 = pedirnumero();
        if (num1==num2) {
            throw new EvenIguales();
        }
        else if (num1<0||num2<0) {
            throw new EvenNegativo();
        }
        else {
            evenloop(num1, num2);
        }
    }

    private static int pedirnumero() throws Exception{
        return Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número:"));
    }

    private static void evenloop(int num1, int num2) throws Exception{
        int n1, n2;
        StringBuilder numlist = new StringBuilder();
        // Traspaso los valores para que funcione si el segundo número es menor que el primero
        if (num2>num1) {
            n1 = num1;
            n2 = num2;
        }
        else {
            n1 = num2;
            n2 = num1;
        }
        for (;n1<n2;n1++) {
            numlist.append(n1).append(" - ").append(evenprimo(numlist, n1));
        }
        numlist.append(n2).append(".").append(evenprimo(numlist, n2));
        System.out.println(numlist);
    }

    private static String evenprimo (StringBuilder numlist, int num) {
        int cont = 0;
        if (num==1) {
            return "\n";
        }
        else if (num==2||num==0) {
            return "Es par\n";
        }
        for (int i=2;i<num;i++) {
            if ((num%i)==0) {
                if ((num%2)==0) {
                    return "Es par\n";
                }
                return "\n";
            }
        }
        return "Es primo\n";
    }

    private static void palindromos() throws Exception{

    }
}