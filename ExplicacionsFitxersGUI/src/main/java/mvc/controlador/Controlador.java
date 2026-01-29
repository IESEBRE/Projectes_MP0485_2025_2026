package mvc.controlador;

import mvc.model.Model;
import mvc.vista.Finestra;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class Controlador {

    private Model model;
    private Finestra vista;

    public Controlador(Model model, Finestra vista) throws IOException {
        this.model = model;
        this.vista = vista;

        //Aquí posarem la lògica de l'aplicació
        definirListeners();

        carregaDades();
    }

    private void carregaDades() throws IOException {
        //Assigno el model de la taula i el combo a la vista
        vista.getTaula().setModel(model.getModelTaula());
        vista.getCursCombo().setModel(model.getModelCombo());

        //Carreguem les dades del fitxer a la taula
        model.carregaPojos();
    }

    private void definirListeners() {

        //Anem a escriure el codi del botó insertar
        vista.getInsertarButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(vista.getNomTextField().getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Has d'escriure un nom!!");
                    return;
                }
                //Codi del botó insertar
                try {
                    model.insertarPojo(vista.getNomTextField().getText(), (Integer)vista.getCursCombo().getSelectedItem());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error al insertar el nou pojo!!");
                }
            }
        });

        //Codi que volem executar abans de tancar completament l'aplicació
        vista.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    model.tancarFitxers();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error al tancar el fitxer!!");
                }
            }
        });
    }
}
