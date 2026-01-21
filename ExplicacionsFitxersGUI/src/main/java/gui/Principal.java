package gui;

import javax.swing.*;

public class Principal extends JFrame{
    private JPanel panel;
    private JButton button1;

    //Constructor de las finestra
    public Principal(){
        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();

    }

    static void main() {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal();
            }
        });

    }



}
