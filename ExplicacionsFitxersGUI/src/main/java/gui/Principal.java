package gui;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame{
    private JPanel panel;
    private JButton button1;
    private JCheckBox checkBox1;
    private JTable table1;
    private JCheckBox checkBox2;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;

    //Constructor de las finestra
    public Principal(){
        JPanel p=panel;
        this.setContentPane(p);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();


    }

    //Getters dels components als quals els hem d'aplicar alguna acció
    public JButton getButton1() {
        return button1;
    }

    static void main() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Principal();
            }
        });
    }
}
