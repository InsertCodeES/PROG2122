package Vistas;

import javax.swing.*;
import java.awt.event.*;

public class MainDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField tFNombre;
    private JTextField tFUnidades;
    private JRadioButton rbCompra;
    private JRadioButton rbVenta;
    private JTextField tfPrecioCompra;
    private JTextField tfImporteCompra;
    private JComboBox cbProveedor;
    private JTextField tfPrecioVenta;
    private JTextField tfCliente;
    private JTextField tfImporteVenta;
    private JCheckBox cbVolumen;
    private JCheckBox cbProntoPago;
    private JLabel LAlmacen;
    private JLabel LNombre;
    private JLabel LUnidades;
    private JPanel JPOperacion;
    private JPanel JPInfo;
    private JPanel JPTitulo;
    private JButton bAceptar;
    private JButton bCancelar;
    private JPanel jpBotones;
    private JLabel lPrecioVenta;
    private JLabel lCliente;
    private JLabel lImporteVenta;
    private JPanel jpDescuentos;
    private JLabel lPrecioCompra;
    private JPanel jpVenta;
    private JPanel jpCompra;
    private JLabel lImporteCompra;
    private JLabel lProveedor;
    private JPanel jpCabecera;

    public MainDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        bAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        bCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        rbCompra.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                tfPrecioVenta.setEnabled(false);
                tfCliente.setEnabled(false);
                cbProntoPago.setEnabled(false);
                cbVolumen.setEnabled(false);
                tfImporteVenta.setEnabled(false);
                jpVenta.setEnabled(false);
                lPrecioVenta.setEnabled(false);
                lCliente.setEnabled(false);
                lImporteVenta.setEnabled(false);
                jpDescuentos.setEnabled(false);

                tfPrecioCompra.setEnabled(true);
                cbProveedor.setEnabled(true);
                tfImporteCompra.setEnabled(true);
                lPrecioCompra.setEnabled(true);
                lImporteCompra.setEnabled(true);
                lProveedor.setEnabled(true);
                jpCompra.setEnabled(true);
            }
        });

        rbVenta.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                tfPrecioVenta.setEnabled(true);
                tfCliente.setEnabled(true);
                cbProntoPago.setEnabled(true);
                cbVolumen.setEnabled(true);
                tfImporteVenta.setEnabled(true);
                jpVenta.setEnabled(true);
                lPrecioVenta.setEnabled(true);
                lCliente.setEnabled(true);
                lImporteVenta.setEnabled(true);
                jpDescuentos.setEnabled(true);

                tfPrecioCompra.setEnabled(false);
                cbProveedor.setEnabled(false);
                tfImporteCompra.setEnabled(false);
                lPrecioCompra.setEnabled(false);
                lImporteCompra.setEnabled(false);
                lProveedor.setEnabled(false);
                jpCompra.setEnabled(false);
            }
        });

        tFNombre.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        dispose();
    }

    public static void main(String[] args) {
        MainDialog dialog = new MainDialog();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
