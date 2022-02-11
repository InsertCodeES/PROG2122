package Vista;

import javax.swing.*;

public class VentanaMain {
    private JButton bCompra;
    public JPanel Principal;
    private JButton bVenta;
    private JButton Salir;

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaMain");
        frame.setContentPane(new VentanaMain().Principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

