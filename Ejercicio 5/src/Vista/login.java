package Vista;

import javax.swing.*;

public class login {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton a0Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton accederButton;
    private JPanel jpDatos;
    private JPanel jpButtons;
    private JPanel jpAceptar;
    JPanel jpLogin;

    public static void main(String[] args) {
        JFrame frame = new JFrame("login");
        frame.setContentPane(new login().jpLogin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
