package graficos;

import java.awt.Dimension;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IncluyendoImagenes {

    public static void main(String[] args) {
        MarcoImagen marco = new MarcoImagen();
    }
}

class MarcoImagen extends JFrame {

    MarcoImagen() {
        inicializar();
        LaminaConImagen ima = new LaminaConImagen();
        add(ima);
    }

    private void inicializar() {
        setTitle("ventana con imagenes");
        setBounds(800, 600, 400, 300);
        setResizable(true);
        setVisible(true);
        centrarVentana();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void centrarVentana() {
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        System.out.println(tamanoPantalla.toString());
        int altura = tamanoPantalla.height;
        int ancho = tamanoPantalla.width;
        setBounds(ancho / 4, altura / 4, ancho / 2, altura / 2);
    }

}

class LaminaConImagen extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        File archivo = new File("src/graficos/ubuntu.png");
        try {
            imagen = ImageIO.read(archivo);
        } catch (IOException ex) {
            System.err.printf("error producido: %s %n", ex.getMessage());
        }

        int anchuraImagen = imagen.getWidth(this);
        int alturaImagen = imagen.getHeight(this);

        g.drawImage(imagen, 0, 0, null);

        // puede configurar posicion, tamaño de la imagen
        g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen, alturaImagen);
    }
    private Image imagen;
}
