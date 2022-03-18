package Vista;

import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class principal {
    public JPanel jpPrincipal;
    private JButton bCrear;
    private JToolBar jtOpciones;
    private JButton bCancelar;

    public principal() {
        bCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.ventanacrearevento();
            }
        });
        bCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.ventanaborrarevento();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("principal");
        frame.setContentPane(new principal().jpPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
