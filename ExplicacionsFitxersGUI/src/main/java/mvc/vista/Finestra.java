package mvc.vista;

import javax.swing.*;

public class Finestra extends JFrame{
    private JPanel panel;
    private JTable taula;
    private JTextField nomTextField;
    private JComboBox cursCombo;
    private JButton insertarButton;
    private JButton borrarButton;


    public Finestra(){
        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the minimum size to the current size
        setMinimumSize(getPreferredSize());

        // Center the frame on the screen
        setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        
    }

    public JTable getTaula() {
        return taula;
    }

    public JTextField getNomTextField() {
        return nomTextField;
    }

    public JComboBox getCursCombo() {
        return cursCombo;
    }

    public JButton getInsertarButton() {
        return insertarButton;
    }

    public JButton getBorrarButton() {
        return borrarButton;
    }


}
