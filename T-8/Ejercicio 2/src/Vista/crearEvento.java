package Vista;

import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class crearEvento {
    public JPanel crearEvento;
    private JPanel jpTexto;
    private JTextField tfNombre;
    private JTextField tfLugar;
    private JTextField tfFecha;
    private JTextField tfInicio;
    private JTextField tfFinal;
    private JTextField tfAforo;
    private JButton aceptarButton;
    private JLabel jlNombre;
    private JLabel jlLugar;
    private JLabel jlFecha;
    private JLabel jlInicio;
    private JLabel jlFinal;
    private JLabel jlAforo;
    private JPanel jpBotones;

    public crearEvento() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (tfNombre.getText().equals("") || tfLugar.getText().equals("") || tfFecha.getText().equals("") ||
                            tfInicio.getText().equals("") || tfFinal.getText().equals("") ||
                            tfAforo.getText().equals("")) {
                        JOptionPane.showMessageDialog(null,"Faltan datos. Vuelva a intentarlo");
                        tfNombre.setText("");
                        tfLugar.setText("");
                        tfFecha.setText("");
                        tfInicio.setText("");
                        tfFinal.setText("");
                        tfAforo.setText("");
                        throw new Exception();
                    }
                    else {
                        Main.crearevento(tfNombre.getText(),tfLugar.getText(),tfFecha.getText(),tfInicio.getText(),
                                tfFinal.getText(),tfAforo.getText());
                    }

                    if (Main.error) {
                        throw new Exception();
                    }
                    JOptionPane.showMessageDialog(null, "Evento creado correctamente");
                    tfNombre.setText("");
                    tfLugar.setText("");
                    tfFecha.setText("");
                    tfInicio.setText("");
                    tfFinal.setText("");
                    tfAforo.setText("");

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    tfNombre.setText("");
                    tfLugar.setText("");
                    tfFecha.setText("");
                    tfInicio.setText("");
                    tfFinal.setText("");
                    tfAforo.setText("");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("crearEvento");
        frame.setContentPane(new crearEvento().crearEvento);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
