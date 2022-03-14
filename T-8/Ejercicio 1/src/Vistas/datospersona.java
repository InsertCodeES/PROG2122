package Vistas;

import Modelo.Persona;
import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class datospersona {
    public JPanel jpDatospersona;
    private JButton buscarButton;
    private JTextField tfNombre;
    private JLabel jlNombre;
    private JPanel jpButton;
    private JTextArea taPersona;

    public static void main(String[] args) {
        JFrame frame = new JFrame("datospersona");
        frame.setContentPane(new datospersona().jpDatospersona);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public datospersona() {
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    Persona p = Main.buscarpersona(tfNombre.getText());
                    taPersona.setText("");
                    taPersona.setText("Nombre: " + p.getNombre() + "\nEdad: " + p.getEdad() + "\nProfesión: " +
                            p.getProfesion() + "\nTeléfono: " + p.getTelefono());
                } catch (SQLException throwables) {
                    JOptionPane.showMessageDialog(null,"El usuario no se ha encontrado");
                    tfNombre.setText("");
                }
            }
        });
    }
}
