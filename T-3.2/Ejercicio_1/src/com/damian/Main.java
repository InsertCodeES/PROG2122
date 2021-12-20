package com.damian;
import javax.swing.JOptionPane;

public class Main {
    /* Podría hacerlo sin variables globales simplemente pasando los parámetros a las funciones, pero como era el primer ejercicio quería tomar contacto con
    ellas aunque no siempre sean la mejor opción. Cuando empecé los ejercicio tampoco sabía cómo funcionaban las funciones muy bien y esto era más fácil */
    private static int bonus = 0, horas = 0;
    private static final String[] arr1 = {"Viudo", "Divorciado", "Casado", "Soltero"}, arr2 = {"Superior", "Medio", "Primario"};
    public static void main(String[] args) {
        horas = Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas trabajadas"));
        int estado = JOptionPane.showOptionDialog(null,"Seleccione su estado civil","Estado civil", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null, arr1, arr1);
        int estudio = JOptionPane.showOptionDialog(null,"Seleccione su nivel de estudios","Nivel de estudios", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null, arr2, arr2);
        Bonus(estado, estudio);
        JOptionPane.showMessageDialog(null, "El sueldo de este empleado es " + Sueldo());
    }
    public static void Bonus(int c, int e) {
        if (c==3&&e==2 || c==3&&e==1 || c==0&&e==2 || e==0)  {
            bonus = 100;
        }
    }
    public static int Sueldo() {
        int sueldo;
        if (horas>40) {
            sueldo = (horas - 40) * 45 + horas * 30 + bonus;
        }
        else {
            sueldo = horas * 30 + bonus;
        }
        return sueldo;
    }
}