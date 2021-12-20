package com.damian;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        /* No utilizo el nombre en el programa ya que lo veo mejor y como solo se ejecuta 1 vez, entiende que se refiere a él.
        igualmente lo pido para dar una introducción al programa */
        JOptionPane.showInputDialog("Introduce tu nombre");
        String sql = Lenguaje("SQL");
        String js = Lenguaje("Javascript");
        String java = Lenguaje("Java");
        String net = Lenguaje("Visual.Net");
        String nota = Nota(net, js, java, sql);
        JOptionPane.showMessageDialog(null,"Tu nota" + " es " + nota );
    }
    // Esta función la he copiado directamente del ejercicio modificando las variables, ya que lo intenté y anidaba demasiados ifs y muchos OR
    public static String Nota(String net,String js, String java, String sql) {
        if (js.equals("0") && sql.equals("0")) {
            if (net.equals("0") && java.equals("0")) {
                return "Sobresaliente";
            }
            if (net.equals("0") || java.equals("0")) {
                return "Notable";
            }
            else {
                return "Bien";
            }
        }
        else {
            if(sql.equals("0") || js.equals("0")) {
                if(java.equals("0") || net.equals("0")) {
                    return "Suficiente";
                }
            }
            return "Insuficiente";
        }
    }

    public static String Lenguaje(String nombre){
        // Utilizo un diálogo porque lo encuentro más amigable para el consumidor, es más cómodo para mí y quitamos las recursivas al limitar las opciones a solo las válidas.
        return Integer.toString(JOptionPane.showConfirmDialog(null, "¿Conoces " + nombre + "?" , null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE));
    }
}