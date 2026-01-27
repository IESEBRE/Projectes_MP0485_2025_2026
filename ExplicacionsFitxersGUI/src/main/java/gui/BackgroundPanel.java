package gui;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class BackgroundPanel extends JPanel {
    private Image background;

    // Constructor por defecto para que el GUI Designer pueda instanciarlo
    public BackgroundPanel() {
        // Intento cargar una imagen por defecto desde recursos (opcional)
        URL res = getClass().getResource("/foto.jpg"); // ajusta la ruta
        if (res != null) {
            background = new ImageIcon(res).getImage();
        }
        // Puedes usar setLayout(new BorderLayout()) si quieres
        //this.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager());
    }

    // Constructor alternativo
    public BackgroundPanel(Image image) {
        this.background = image;
    }

    public void setBackgroundImage(Image img) {
        this.background = img;
        repaint();
    }

    public Image getBackgroundImage() {
        return background;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (background != null) {
            // Opciones de escalado: aquí se escala para cubrir todo el panel
            // dentro de paintComponent, en lugar de drawImage(... getWidth() getHeight() ...)
            int iw = background.getWidth(this);
            int ih = background.getHeight(this);
            if (iw > 0 && ih > 0) {
                double panelRatio = (double) getWidth() / getHeight();
                double imgRatio = (double) iw / ih;
                int drawW, drawH;
                if (imgRatio > panelRatio) { // imagen más ancha
                    drawW = getWidth();
                    drawH = (int) (getWidth() / imgRatio);
                } else {
                    drawH = getHeight();
                    drawW = (int) (getHeight() * imgRatio);
                }
                int x = (getWidth() - drawW) / 2;
                int y = (getHeight() - drawH) / 2;
                g.drawImage(background, x, y, drawW, drawH, this);
            }
            // Si quieres mantener ratio y centrar, usa un cálculo diferente (ver nota)
        }
    }
}