package Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCompraDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JRadioButton rbCompra;
    private JRadioButton rbVenta;

    public VentanaCompraDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK() {
        dispose();
    }

    public static void main(String[] args) {
        VentanaCompraDialog dialog = new VentanaCompraDialog();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
