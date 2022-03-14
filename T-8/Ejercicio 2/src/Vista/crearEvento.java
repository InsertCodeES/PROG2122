package Vista;

import javax.swing.*;

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

    public static void main(String[] args) {
        JFrame frame = new JFrame("crearEvento");
        frame.setContentPane(new crearEvento().crearEvento);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
