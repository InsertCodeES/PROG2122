package Vistas;

import javax.swing.*;

public class consultarpersonas {
    private JPanel jpConsultarpersonas;
    private JLabel jlTitulo;
    private JTextArea taPersonas;

    public static void main(String[] args) {
        JFrame frame = new JFrame("consultarpersonas");
        frame.setContentPane(new consultarpersonas().jpConsultarpersonas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
