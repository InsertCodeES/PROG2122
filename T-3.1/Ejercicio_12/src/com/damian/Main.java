package com.damian;
import javax.swing.JOptionPane;

public class Main {
    private static int peso, altura;
    public static void main(String[] args) {
        int contador_nino = 0;
        int contador_nina = 0;
        String[] opciones = {"Chico","Chica"};
        for (int i=1;i<=1;i++) {
            JOptionPane.showInputDialog("Alumno número " + i);
            int sexo = JOptionPane.showOptionDialog(null,"Selecciona el sexo","Selección de sexo", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null, opciones, opciones);
            Cuestionario();
            if (sexo==0) {
                if (peso > 70 && altura > 170) {
                    contador_nino = contador_nino + 1;
                }
            }
            else {
                if (peso > 60 && altura > 160) {
                    contador_nina = contador_nina + 1;
            }
            }
        }
        JOptionPane.showMessageDialog(null,"Número de chicos aptos: " + contador_nino + "\nNúmero de chicas aptas: " + contador_nina);
    }
    private static void Cuestionario() {
        peso = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el peso (kg)"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura (m)"));
    }
}
