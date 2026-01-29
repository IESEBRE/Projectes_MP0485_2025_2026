package mvc.model;

import com.iesebre.code.DirectAccessFile;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;

public class Model {

    private DirectAccessFile<Pojo> fitxer;
    private DefaultTableModel modelTaula;           //aquí definim l'estructura de la taula
    private ComboBoxModel<Integer> modelCombo;

    public Model() throws IOException {
            fitxer=new DirectAccessFile<>("pojos.dat");

            modelTaula=new DefaultTableModel(new Object[]{"Nom","Curs"},0){

                @Override
                public boolean isCellEditable(int row, int column) {
                    //if(row==0) return true;   //aquí permetriem editar només la fila 0 de la taula
                    return false;
                }

                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    switch(columnIndex){
                        case 0: return String.class;        //String és la classe de la columna nom
                        case 1: return Integer.class;       //Integer és la classe de la columna curs
                    }
                    return Object.class;
                }
            };

            modelCombo=new DefaultComboBoxModel<>(new Integer[]{1,2});

    }


    //getters
    public DefaultTableModel getModelTaula() {
        return modelTaula;
    }

    public ComboBoxModel getModelCombo() {
        return modelCombo;
    }

    public void insertarPojo(String text, Integer selectedItem) throws IOException {
        Pojo p=new Pojo(text,selectedItem);
        fitxer.writeObject(p);

        //Mostrem el nou pojo a la taula (al seu model)
        modelTaula.addRow(new Object[]{text,selectedItem});
    }

    public void carregaPojos() throws IOException {
        Pojo p;
        fitxer.goToBeginning();
        while((p=fitxer.readObject())!=null){
            modelTaula.addRow(new Object[]{p.getNom(),p.getCurs()});
        }


    }

    public void tancarFitxers() throws IOException {
        fitxer.close();
    }

    //Altres métodes que treballen en les dades...


}
