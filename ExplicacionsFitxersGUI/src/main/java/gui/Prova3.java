package gui;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;

//FONT: https://gist.github.com/kaydell/6565219
public class Prova3 extends JFrame{
    private JPanel panel;
    private JLabel fondo;
    private JLabel text;
    private JButton iMAButton;

    public Prova3(File imageFile){
        this.setContentPane(panel);
        // This worked well, except for the hard-coded, Windows type of full pathname
        // One way
        // -----------------

        setLayout(new BorderLayout());
        add(fondo,BorderLayout.CENTER);
        fondo.setIcon(new ImageIcon(imageFile.getAbsolutePath()));
        fondo.setLayout(new FlowLayout());
        fondo.add(text);
        fondo.add(iMAButton);

	    /* This worked well, except for the hard-coded, Windows type of full pathname
		// Another way
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon(imageFile.getAbsolutePath())));
		setLayout(new FlowLayout());
		l1=new JLabel("Here is a button");
		b1=new JButton("I am a button");
		add(l1);
		add(b1);
		 */

        // finish initializing the window (this is best done last)
        setTitle("Background Image Demo for JFrame");
        pack(); // automatically size the window to fit its components
        setLocationRelativeTo(null); // center this window on the screen
        setDefaultCloseOperation(EXIT_ON_CLOSE); // when this window is closed, exit this application
        // setVisible(true); // call setVisible(true) last of all (best if done by method that created this JFrame






        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();

    }

    static void main() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                File imageFile = MyFileChooser.chooseFile("Image Files (png & jpg)", "png", "jpg");
                if (imageFile != null) {
                    Prova3 frame = new Prova3(imageFile);
                    frame.setVisible(true); // call setVisible(true) last of all
                }
            }
        });
    }
}

/**
 * This class allows the user to choose a file with the given extensions.
 * This class is general and could be a public class in its own file.
 *
 * @author kaydell
 *
 */
class MyFileChooser {
    public static File chooseFile(String description, String... extensions) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(description, extensions);
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            System.out.println("You chose to open this file: " + selectedFile.getAbsolutePath());
            return selectedFile;
        } else {
            return null;
        }
    }
}