package Vista;

import com.damian.Main;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    private JTextField tfID;
    private JPasswordField pfClave;
    private JButton b0;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton bAcceder;
    private JPanel jpDatos;
    private JPanel jpButtons;
    private JPanel jpAceptar;
    JPanel jpLogin;
    private JLabel jlClave;
    private JLabel jlNIF;
    private JLabel jlSub;

    public login() {
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pfClave.setText(pfClave.getText() + 0);
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pfClave.setText(pfClave.getText() + 1);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pfClave.setText(pfClave.getText() + 2);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pfClave.setText(pfClave.getText() + 3);
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pfClave.setText(pfClave.getText() + 4);
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pfClave.setText(pfClave.getText() + 5);
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pfClave.setText(pfClave.getText() + 6);
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pfClave.setText(pfClave.getText() + 7);
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pfClave.setText(pfClave.getText() + 8);
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pfClave.setText(pfClave.getText() + 9);
            }
        });
        bAcceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.validar(tfID.getText(), pfClave.getText());
                tfID.setText("");
                pfClave.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("login");
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new login().jpLogin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
