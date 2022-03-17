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
                    Main.crearevento(tfNombre.getText(),tfLugar.getText(),tfFecha.getText(),tfInicio.getText(),
                            tfFinal.getText(),tfAforo.getText());
                    JOptionPane.showMessageDialog(null, "Evento creado correctamente");
                    tfNombre.setText("");
                    tfLugar.setText("");
                    tfFecha.setText("");
                    tfInicio.setText("");
                    tfFinal.setText("");
                    tfAforo.setText("");

                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null,"Error al crear el evento. Vuelva a intentarlo");
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
