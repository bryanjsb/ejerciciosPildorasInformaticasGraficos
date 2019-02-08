package graficos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Paint;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CrearMarcos {

    public static void main(String[] args) {
        miMarco marco1 = new miMarco("Mi primer ventana");
    }

}

final class miMarco extends JFrame {

    public miMarco(String titulo) {
        darTituloVentana(titulo);
        inicializar();
        trabajandoConFuentes();
    }

    public void inicializar() {
        // es la opcion cuando le damos click al x de la ventana, para que la aplicacion termine
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cofigurarVentana();
        asignarIconoVentana();
        setVisible(true);// hace visible la ventana
        // laminaTexto();
        //dibujarVentana();
        dibujarVentana2D();

    }

    public void cofigurarVentana() {
        // setSize(800,600);// crea el tamaño de la ventana
        // setLocation(300, 100);// configura la ventana la posicion que va a parecer en el monitor
        // setBounds(250,100,800,600);// este metodo es similiar al usar setSize y setLocation juntos. puede configurar la poscion del marco, como tambien el ancho y largo del mismo
        // setExtendedState(MAXIMIZED_BOTH);// ESTE METODO PERMITE MAXIMIZAR LA VENTANA AL INICIAR

        setResizable(true);// PERMITE AL USUARIO REDIMENSIONAR LA VENTANA, TRUE LO PERMITE , FALSE NO LO PERMITE
        centrarVentana();
    }

    public void darTituloVentana(String titulo) {
        setTitle(titulo);
    }

    public void centrarVentana() {
        // utilizando la clase toolkit
        //getDefaultToolkit; devulve la configuracion de la pantalla
        Toolkit miPantalla = Toolkit.getDefaultToolkit();

        // averiguar el tamano de la pantalla es  Dimension getScreenSize();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        System.out.println(tamanoPantalla.toString());
        int altura = tamanoPantalla.height;// devuelve la altura de la pantalla
        int ancho = tamanoPantalla.width;// devuelve el ancho de la pantalla
        setBounds(ancho / 4, altura / 4, ancho / 2, altura / 2);
    }

    public void asignarIconoVentana() {
        // setIconImage(Image imagen);
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src/graficos/windows.png");
        setIconImage(miIcono);
    }

    // crear una lamina para escribir
    public void laminaTexto() {
        class Lamina extends JPanel {// clase interna

            @Override// metodo viene de la clase component
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawString("Estamos aprendiendo Swing", 250, 60);
            }
        }
        Lamina lamina = new Lamina();
        add(lamina);
    }

    public void dibujarVentana() {
        class LaminaConFiguras extends JPanel {

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //g.drawRect(50, 50, 200, 200);
                //g.draw3DRect(50, 50, 200, 200, rootPaneCheckingEnabled);
                g.drawArc(300, 300, 300, 300, 300, 300);
            }
        }
        LaminaConFiguras miLamina = new LaminaConFiguras();
        add(miLamina);
    }

    public void dibujarVentana2D() {
        class LaminaConFiguras extends JPanel {

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;

                // double centroEnX= rectangulo2D.getCenterX();
                // double centroEnY= rectangulo2D.getCenterY();
                double centroEnX = 200;
                double centroEnY = 150;
                double radio = 150;
                Ellipse2D circulo = new Ellipse2D.Double();
                circulo.setFrame(centroEnX / 8, centroEnY / 8,
                        centroEnX + radio, centroEnY + radio);
                g2.draw(circulo);
                pintarDentro(g2, circulo, Color.ORANGE);

                Rectangle2D rectangulo2D = new Rectangle2D.Double(100, 100, 200, 150);
                g2.draw(rectangulo2D);
                pintarDentro(g2, rectangulo2D, Color.GREEN);

                Ellipse2D elipse = new Ellipse2D.Double();
                elipse.setFrame(rectangulo2D);
                g2.draw(elipse);
                pintarDentro(g2, elipse, Color.RED);

                Line2D linea2D = new Line2D.Double(100, 100, 300, 250);
                g2.draw(linea2D);
                pintarDentro(g2, linea2D, Color.BLUE);
            }

            public void pintarDentro(Graphics2D g2, RectangularShape FIGURA, Paint color) {
                g2.setPaint(color);
                g2.fill(FIGURA);
            }

            public void pintarDentro(Graphics2D g2, Line2D FIGURA, Paint color) {
                g2.setPaint(color);
                g2.fill(FIGURA);
            }

            public void darColorLamina(int r, int g, int b, JPanel jf) {
                Color color = new Color(r, g, b);
                jf.setBackground(color);
            }

            public void colorPredefinidoOS() {
                // este metodo da el color predefinido que tenga el sistema operativo
                setBackground(SystemColor.window);
            }
        }

        LaminaConFiguras miLamina = new LaminaConFiguras();
        add(miLamina);
        miLamina.darColorLamina(109, 172, 59, miLamina);
    }

    public void trabajandoConFuentes() {
        class LaminaConFuentes extends JPanel {

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;

                String[] nombresDeFuentes = GraphicsEnvironment
                        .getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

                Font miFuente = new Font(nombresDeFuentes[10], Font.BOLD, 48);

                g2.setFont(miFuente);
                g2.setColor(Color.red);
                g2.drawString("Bryan", 200, 200);

            }
        }

        LaminaConFuentes miLamina = new LaminaConFuentes();
        add(miLamina);

    }
}
