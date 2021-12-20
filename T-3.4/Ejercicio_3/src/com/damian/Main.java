package com.damian;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class Main {

    private static String name;
    private static int acc, balance;
    public static void main(String[] args) {
        String[] options = {"Continuar", "Finalizar"};
        try {
            do {
                data();
                transaction();
            } while (JOptionPane.showOptionDialog(null,"¿Quieres hacer otra operación?","Operación", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null)==0);
        }
        catch (NullPointerException e) {
            System.out.println("La aplicación se ha cerrado");
        }
        catch (Exception e) {
            System.out.println(e.getClass());
        }
    }

    private static void data() throws Exception{
        name = JOptionPane.showInputDialog("Introduzca su nombre");
        acc = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de cuenta"));
        balance = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el saldo de la cuenta"));
    }

    private static void transaction() throws Exception{
        String[] options = {"Reintegro", "Imposición"};
        StringBuilder msg = new StringBuilder();
        int transaction = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de la operación")), total = balance;
        do {
            int x = JOptionPane.showOptionDialog(null,"Indica el tipo de operación","Operación", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);
            String date = date();
            switch (x) {
                case 0: total = total + transaction;
                msg.append("- ").append(transaction).append(" reintegro ").append(date).append("\n");
                break;
                case 1: total = total - transaction;
                msg.append("- ").append(transaction).append(" imposición ").append(date).append("\n");
                break;
            }
            transaction = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de la operación"));
        } while (transaction!=0);
        print(msg, total);
    }

    private static String date() throws Exception{
        Calendar datecalendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String datestring = JOptionPane.showInputDialog("Introduzca la fecha (dd/MM/yyyy)");
        datecalendar.setTime(sdf.parse(datestring));
        datestring = datecalendar.get(Calendar.DAY_OF_MONTH) + "/" + (datecalendar.get(Calendar.MONTH) + 1) + "/" + datecalendar.get(Calendar.YEAR);
        return datestring;
    }

    private static void print(StringBuilder msg, int total) throws Exception{
        LocalDate localdate = LocalDate.now();
        String date = localdate.getDayOfMonth() + "/" + localdate.getMonthValue() + "/" + localdate.getYear();
        msg.insert(0, "Cliente: " + name + "\nSaldo inicial: " + balance + "\n");
        msg.append("Saldo actualizado de la cuenta ").append(acc).append(" del cliente ").append(name).append(" el día ").append(date).append(" es de ").append(total);
        //JOptionPane.showMessageDialog(null,msg);
        // Lo imprimo por consola para ver el todos los mensajes seguidos, comentar la línea de debajo y descomentar la de encima para cambiarlo
        System.out.println(msg);
    }
}