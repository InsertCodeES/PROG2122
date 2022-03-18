package Vista;

import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cancelarEvento {
    public JPanel cancelarEvento;
    private JButton bBorrar;
    private JTextField tfEvento;
    private JLabel jlTitulo;
    private JLabel jlEvento;

    public cancelarEvento() {
        bBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (tfEvento.getText().equals("")) {
                        JOptionPane.showMessageDialog(null,"Error: Introduzca el nombre del evento");
                    }
                    else {
                        Main.borrarevento(tfEvento.getText());
                        JOptionPane.showMessageDialog(null,"Evento borrado correctamente");
                        tfEvento.setText("");
                    }
                    if (Main.error) {
                        tfEvento.setText("");
                        throw new Exception();
                    }
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                    tfEvento.setText("");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("cancelarEvento");
        frame.setContentPane(new cancelarEvento().cancelarEvento);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
