package com.damian;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Persona> Personas;

    public static void main(String[] args) {
        Personas = new ArrayList<>();
        try {
            bucle();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al introducir los datos. " +
                    "Vuelve a intentarlo");
            bucle();
        }
    }

    private static void bucle() {
        do {
            crearusuario();
        } while(JOptionPane.showConfirmDialog(null,"¿Quieres añadir más usuarios?",
                "Confirmar",JOptionPane.YES_NO_OPTION)==0);
        mayor();
        elche();
        mayoresedad();
    }

    private static void crearusuario() {
        Persona a = new Persona(
                JOptionPane.showInputDialog("Introduce el nombre"),
                JOptionPane.showInputDialog("Introduce la fecha de nacimiento (dd/MM/yyyy)"),
                JOptionPane.showInputDialog("Introduce la dirección"),
                Integer.parseInt(JOptionPane.showInputDialog("Introduce el código postal")),
                JOptionPane.showInputDialog("Introduce la ciudad")
        );
        Personas.add(a);
    }

    private static void mayor() {
        int mayor=0;
        String nommayor = "";
        for (Persona p : Personas){
            if (p.calcularedad()>mayor) {
                mayor = p.calcularedad();
                nommayor = p.getNombre();
            }
        }
        JOptionPane.showMessageDialog(null,"El mayor es " + nommayor);
    }

    private static void elche() {
        StringBuilder msg = new StringBuilder();
        for (Persona p : Personas){
            if ((p.getCiudad().toUpperCase()).equals("ELCHE")) {
                msg.append(p.getNombre()).append(", ");
            }
        }
        msg.deleteCharAt(msg.length()-2);
        JOptionPane.showMessageDialog(null,"Residentes en Elche: " + msg);
    }

    private static void mayoresedad() {
        int cont = 0;
        for (Persona p : Personas){
            if (p.calcularedad()>=18) {
                cont++;
            }
        }
        JOptionPane.showMessageDialog(null,"Mayores de edad: " + cont);
    }
}