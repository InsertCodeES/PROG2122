package com.damian;
import Excepciones.CantidadMayorAStock;
import javax.swing.*;
import java.util.Arrays;

public class Main {
    /*String[][] productos = {{"KitKat", "Kinder Bueno", "Kinder Bueno", "Lacasitos"},{"Chicles de fresa",
                    "Bolsa variada Haribo", "M&Ms", "Crunch"},{"Lacasitos", "Cheetos", "Papa Delta", "Milkybar"},
                    {"Palotes", "Twix", "Chicles de menta", "KitKat"}};*/

    /*private static float[][] precios = {{1.1f,1.8f,1.8f,1.5f},{0.8f,1,1.3f,1.1f},{1.5f,1.2f,1.2f,1.1f},{0.9f,1,0.8f,
            1.1f}};*/

    private static String[][] productos = {{"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},{"Kinder Bueno",
            "Bolsa variada Haribo", "Cheetos", "Twix"},{"Kinder Bueno", "M&Ms", "Papa Delta", "Chicles de menta"},
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}};

    private static float[][] precios = {{1.1f,0.8f,1.5f,0.9f},{1.8f,1,1.2f,1},{1.8f,1.3f,1.2f,0.8f},{1.5f,1.1f,1.1f,
            1.1f}};

    private static int[][] cantidades = new int[4][4];

    public static void main(String[] args) {
        for (int[] cantidad:cantidades) {
            Arrays.fill(cantidad, 5);
        }
        menu();
    }

    private static void menu() {
        String[] options = {"Mostrar Golosinas", "Pedir Golosinas", "Rellenar Golosinas", "Apagar Máquina"};
        int input = JOptionPane.showOptionDialog(null, "Eliga una opción", "Menú",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
        switch (input) {
            case 0:
                mostrargolosinas();
                menu();
                break;
            case 1:
                pedirgolosina();
                menu();
                break;
            case 2:
                rellenargolosinas();
                menu();
                break;
            case 3:
                apagarmaquina();
                break;
        }
    }

    private static void mostrargolosinas() {
        StringBuilder msg = new StringBuilder();
        for (int x=0;x<productos.length;x++) {
            for (int y=0;y<productos.length;y++) {
                msg.append(x).append(y).append("\t").append(productos[x][y]).append(" (").append(precios[x][y])
                        .append(") ").append("\t");
            }
            msg.append("\n");
        }
        JOptionPane.showMessageDialog(null,msg,"Golosinas",JOptionPane.INFORMATION_MESSAGE);
    }

    private static void pedirgolosina() {
        try {
            String input = (JOptionPane.showInputDialog("Introduce el código del producto"));
            if (!stringanumero(input)) {
                throw new IndexOutOfBoundsException();
            }
            if (input.length()!=2) {
                throw new NumberFormatException();
            }
            int digit1 = Character.digit(input.charAt(0),1), digit2 = Character.digit(input.charAt(1),1);
            System.out.println(digit1+digit2);
            int q = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad a comprar"));
            if (q>cantidades[digit1][digit2]) {
                throw new CantidadMayorAStock();
            }
            cantidades[digit1][digit2] -= q;
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Solo se permiten números de 2 cifras. Vuelva" +
                    " a intentarlo");
            pedirgolosina();
        }
        catch (CantidadMayorAStock e) {
            JOptionPane.showMessageDialog(null,"La cantidad supera al stock. Vuelva a " +
                    "intentarlo");
            pedirgolosina();
        }
        catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null,"El código introducido no es válido. Vuelva" +
                    " a intentarlo");
            pedirgolosina();
        }
    }

    private static boolean stringanumero(String input) {
        if (input == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static void rellenargolosinas() {

    }

    private static void apagarmaquina() {

    }
}
