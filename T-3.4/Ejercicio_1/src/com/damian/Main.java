package com.damian;
import Excepciones.CantidadException;
import Excepciones.PrecioException;

import javax.swing.*;

public class Main {
    private static double ivatotal = 0, preciototal = 0, total = 0;
    private static final StringBuilder preciomsg = new StringBuilder(), ivamsg = new StringBuilder();

    public static void main(String[] args) {
        try {
            String name = JOptionPane.showInputDialog("Introduzca su nombre");
            producto();
            print(name, preciototal, ivatotal, total);
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.print("Problemas: " + e.getClass() + " - " +e.getMessage() + "\n");
        }
    }

    private static void producto() throws Exception{
        String[] options = {"Continuar", "Finalizar"}, ivaAr = {"4%", "10%", "21%"};
        int price, q, iva;
        try {
            do {
                price = Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio del producto"));
                if (price<=0) {
                    throw new PrecioException();
                }
                q = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad del producto"));
                if (q<1) {
                    throw new CantidadException();
                }
                iva = JOptionPane.showOptionDialog(null, "Selecciona el IVA a pagar", "IVA", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, ivaAr, null);
                calculo(price, q, iva);
            } while (JOptionPane.showOptionDialog(null, "¿Quiere seguir comprando?", "Confirmación de compra", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null)==0);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Es necesario un valor numérico, vuelva a intentarlo");
            producto();
        }
    }

    private static void calculo(int price, int q, int i) throws Exception {
        double precio, iva = 0, precioiva;
        // Cálculo de precio sin IVA
        precio = price*q;
        preciomsg.append(price).append(" * ").append(q).append(" = ").append(precio).append("€").append("\n");
        // Cálculo del IVA
        switch (i) {
            case 0:
                iva = (precio*0.04);
                ivamsg.append("4% de ").append(precio).append(" = ").append(iva).append("€").append("\n");
                break;
            case 1:
                iva = (precio*0.10);
                ivamsg.append("10% de ").append(precio).append(" = ").append(iva).append("€").append("\n");
                break;
            case 2:
                iva = (precio*0.24);
                ivamsg.append("21% de ").append(precio).append(" = ").append(iva).append("€").append("\n");
                break;
        }

        // Cálculo del Precio con IVA
        precioiva = precio+iva;

        //Cálculo de los totales
        preciototal = preciototal + precio;
        ivatotal = ivatotal + iva;
        total = total + precioiva;
    }

    private static void print(String name, double preciototal, double ivatotal, double total) throws Exception{
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Nombre: ").append(name).append("\n");
        mensaje.append("Líneas de detalle: ").append("\n").append(preciomsg);
        mensaje.append("Total sin IVA: ").append(preciototal).append("€").append("\n");
        mensaje.append(ivamsg);
        mensaje.append("Total IVA: ").append(ivatotal).append("€").append("\n");
        mensaje.append("Total con IVA: ").append(total).append("€");
        JOptionPane.showMessageDialog(null,mensaje);
    }

}