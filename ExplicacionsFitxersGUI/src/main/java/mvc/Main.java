package mvc;

import mvc.controlador.Controlador;
import mvc.model.Model;
import mvc.vista.Finestra;

import javax.swing.*;
import java.io.IOException;

public class Main {

    static void main() {
        try {
            new Controlador(new Model(), new Finestra());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error a l'iniciar l'aplicació!!");
        }
    }
}
