package Vistas;

import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class principal {
    public JPanel jPrincipal;
    private JButton registrarPersonaButton;
    private JButton datosDePersonaButton;
    private JButton consultarPersonasButton;
    private JButton salirButton;
    private JPanel jpBotones;
    private JLabel jlTitulo;

    public principal() {
        registrarPersonaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.ventregistrarpersona();
            }
        });
        datosDePersonaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.ventbuscarpersona();
            }
        });
        consultarPersonasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("principal");
        frame.setContentPane(new principal().jPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
