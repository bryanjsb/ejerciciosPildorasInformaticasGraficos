package Eventos.Caso2;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ProbarEventos {

    public static void main(String[] args) {
        miMarco marco1 = new miMarco("Probando eventos");
        
    }
}

class miMarco extends JFrame {
private LaminaBotones botones;
    public miMarco(String titulo) {
        
        botones= new LaminaBotones();
        add(botones);
        
        darTituloVentana(titulo);
        inicializar();
       
    }

    private void inicializar() {
        cofigurarVentana();
        asignarIconoVentana();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void cofigurarVentana() {
        setResizable(true);
        centrarVentana();
    }

    private void darTituloVentana(String titulo) {
        setTitle(titulo);
    }

    public void centrarVentana() {
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        System.out.println(tamanoPantalla.toString());
        int altura = tamanoPantalla.height;// devuelve la altura de la pantalla
        int ancho = tamanoPantalla.width;// devuelve el ancho de la pantalla
        setBounds(ancho / 4, altura / 4, ancho / 2, altura / 2);
    }

    public void asignarIconoVentana() {
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src/graficos/windows.png");
        setIconImage(miIcono);
    }

}
