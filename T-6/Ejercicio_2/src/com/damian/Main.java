package com.damian;
import javax.swing.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Alumno> Agenda = new ArrayList<>();

    public static void main(String[] args) {


        int input = Integer.parseInt(JOptionPane.showInputDialog("Introduce el código del alumno"));
        if (buscaralumno(input)) {
            imprimiralumno(input);
        }
        else {
            crearalumno(input);
        }
    }

    private static void crearalumno(int input) {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Introduce el identificador del alumno"));
            String name = JOptionPane.showInputDialog("Introduce el nombre del alumno");
            String address = JOptionPane.showInputDialog("Introduce la dirección del alumno");
            int telefono = Integer.parseInt(JOptionPane.showInputDialog("Introduce el teléfono del alumno"));
            Alumno alumno = new Alumno(id,name,address,telefono);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error, vuelve a intentarlo");
            crearalumno(input);
        }
    }

    private static void imprimiralumno(int input) {

    }

    private static boolean buscaralumno(int input) {
        for (int i=0;i>=Agenda.size();i++) {
            Agenda.get
        }
        return false;
    }
}
