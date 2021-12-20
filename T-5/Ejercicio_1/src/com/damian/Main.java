package com.damian;
import javax.swing.*;
import java.util.*;

public class Main {

    private static List<Float> lista;

    public static void main(String[] args) {
        lista = new ArrayList<>();
        loop();
        do {
            menu();
        } while (JOptionPane.showConfirmDialog(null,"¿Quieres continuar?","Confirmar",
                JOptionPane.YES_NO_OPTION)!=1);
    }

    private static void loop() {
        try {
            do {
                lista.add(Float.parseFloat(JOptionPane.showInputDialog("Introduce cualquier número (0 para finalizar)")));
            } while (lista.get(lista.size()-1)!=0);
            lista.remove(lista.size()-1);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Error: Número no válido. Vuelva a intentarlo");
            loop();
        }
    }

    private static void menu() {
        String msg = "Opciones:\n1- Visualizar máximo y mínimo\n2- Buscar un número\n3- Borrar un número" +
                "\n4- Convertir lista en array\n5- Mostrar cantidad de elementos\n6- Insertar elemento al final" +
                "\n7- Insertar elemento indicando el índice\n8- Borrar elemento indicando el índice" +
                "\n9- Suma y media de todos los valores\n10- Finalizar";
        String[] options = {"1","2","3","4","5","6","7","8","9","10"};
        while (true) {
            switch (JOptionPane.showOptionDialog(null,msg,"Menú", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,null,options,null)) {
                case 0:
                    mayormenor();
                    break;
                case 1:
                    buscarnumero();
                    break;
                case 2:
                    borrarnumero();
                    break;
                case 3:
                    break;
                case 4:
                    mostrarelementos();
                    break;
                case 5:
                    break;
                case 6:
                    insertarindice();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                case -1:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Error al elegir una opción. Vuelva a intentarlo");
                    menu();
                    break;
            }
        }
    }

    private static void mayormenor() {
        JOptionPane.showMessageDialog(null,"Número mayor: "+Collections.max(lista)+
                "\nNúmero menor: "+Collections.min(lista));
    }

    private static void buscarnumero() {
        float input = Float.parseFloat(JOptionPane.showInputDialog("Introduce un número"));
        if (lista.contains(input)) {
            JOptionPane.showMessageDialog(null,"El número está en la lista");
        }
        else {
            JOptionPane.showMessageDialog(null,"El número no se ha encontrado en la lista");
        }
    }

    private static void borrarnumero() {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número a borrar"));

    }

    private static void mostrarelementos() {
        if (!lista.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Número de elementos: " + lista.size());
        }
        else {
            JOptionPane.showMessageDialog(null,"La lista no contiene objetos");
        }
    }

    private static void insertarindice() {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        if (input > 0 && input < (lista.size())) {
            lista.add(input,Float.parseFloat(JOptionPane.showInputDialog("Introduce el número a insertar")));
        }
    }
}
