package com.damian;

public class Main {

    public static void main(String[] args) {
	String nota = javax.swing.JOptionPane.showInputDialog("Introduce tu nota");
    if (Integer.parseInt(nota) >= 5) {
        javax.swing.JOptionPane.showMessageDialog(null,"Enhorabuena, has aprobado");
        }
    else {
        javax.swing.JOptionPane.showMessageDialog(null,"Ha suspendido");
    }
    }
}
