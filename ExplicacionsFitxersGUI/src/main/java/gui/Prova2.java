package gui;

import javax.swing.*;
import java.awt.*;

public class Prova2 extends JFrame{
    private JPanel panel;
    private JTable table1;
    private BackgroundPanel fondo;

    public Prova2(){
        //panel.add(panel1);

    }

    static void main() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Prova2();
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        panel = new JPanel(new BorderLayout());
        fondo = new BackgroundPanel();
        fondo.setVisible(true);
        panel.setPreferredSize(new Dimension(600, 400));
        fondo.setPreferredSize(new Dimension(600, 400));

        panel.add(fondo, BorderLayout.CENTER);

        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.pack();

        // Set the minimum size to the current size
        setMinimumSize(getPreferredSize());

        // Center the frame on the screen
        setLocationRelativeTo(null);
        this.setVisible(true);


    }
}
