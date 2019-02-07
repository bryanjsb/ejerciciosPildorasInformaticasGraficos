package Eventos.Caso2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


// en este caso la clase lamina es el oyente es decir es que va hacer afectada por las acciones que
// los botones
public class LaminaBotones extends JPanel {

    private final JButton botonAzul;
    private final JButton botonAmarillo;
    private final JButton botonRojo;

    public LaminaBotones() {
        botonAzul = new JButton("Azul");
        add(botonAzul);

        // llamar al evento
        botonAzul.addActionListener(new ColorFondo(Color.BLUE));
        //addActionListener llama al actionPerformed
        
        botonAmarillo = new JButton("Amarillo");
        add(botonAmarillo);
        botonAmarillo.addActionListener(new ColorFondo(Color.YELLOW));
        
        botonRojo = new JButton("Rojo");
        add(botonRojo);
        botonRojo.addActionListener(new ColorFondo(Color.RED));
    }
    
    
    private class ColorFondo  implements ActionListener {

    private Color colorDeFondo;

    public ColorFondo(Color c) {

        colorDeFondo = c;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(colorDeFondo);
    }

}

}
