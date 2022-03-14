package Vistas;

import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class crearpersona {
    public JPanel jpCrearpersona;
    private JTextField tfNombre;
    private JTextField tfEdad;
    private JTextField tfProfesion;
    private JTextField tfTelefono;
    private JButton aceptarButton;
    private JPanel jpDatos;
    private JLabel jlNombre;
    private JLabel jlEdad;
    private JLabel jlProfesion;
    private JLabel jlTelefono;
    private JLabel jlTitulo;

    public crearpersona() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.crearpersona(tfNombre.getText(), tfEdad.getText(), tfProfesion.getText(), tfTelefono.getText());
                if(Main.error) {
                    tfEdad.setText("");
                    tfNombre.setText("");
                    tfProfesion.setText("");
                    tfTelefono.setText("");
                }
                else {
                    JOptionPane.showMessageDialog(null,"Usuario creado correctamente");
                    tfEdad.setText("");
                    tfNombre.setText("");
                    tfProfesion.setText("");
                    tfTelefono.setText("");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("crearpersona");
        frame.setContentPane(new crearpersona().jpCrearpersona);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
