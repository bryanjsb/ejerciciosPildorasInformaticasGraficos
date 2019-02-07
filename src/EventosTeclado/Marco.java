/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventosTeclado;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author bryan
 */
class Marco extends JFrame {
    
    public Marco(String titulo) {
     
        darTituloVentana(titulo);
        inicializar();
        llamandoOyente();
        
    }

    private void llamandoOyente() {
        //llamando al oyente
        EventoTeclado tecla = new EventoTeclado();
        addKeyListener(tecla);
    }

    private void inicializar() {
        cofigurarVentana();
        asignarIconoVentana();
        setVisible(true);
       // setDefaultCloseOperation(EXIT_ON_CLOSE);
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
