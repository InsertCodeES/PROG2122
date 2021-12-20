package com.damian;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Introduce tu frase");
        String charString = JOptionPane.showInputDialog("Introduce un carácter (Si escribes más, se tomará el primero)");
        char chr = charString.charAt(0);
        JOptionPane.showMessageDialog(null,Counter(input, chr));
    }

//Código reutilizado del ejercicio 1, solo que quitando el array y el for anidado ya que solo necesito 1 char
    private static String Counter(String input, char chr) {
        input = input.toLowerCase();
        int contador = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == chr) {
                contador++;
            }
        }
        return "Veces que se repite '" + chr + "' : " + contador;
    }
}