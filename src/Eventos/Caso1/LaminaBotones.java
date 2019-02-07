package Eventos.Caso1;
//
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


// en este caso la clase lamina es el oyente es decir es que va hacer afectada por las acciones que
// los botones
public class LaminaBotones extends JPanel
        implements ActionListener {

    private JButton botonAzul;
    private JButton botonAmarillo;
    private JButton botonRojo;

    public LaminaBotones() {
        botonAzul = new JButton("Azul");
        add(botonAzul);

        // llamar al evento
        botonAzul.addActionListener(this);
        //addActionListener llama al actionPerformed
        
        botonAmarillo = new JButton("Amarillo");
        add(botonAmarillo);
        botonAmarillo.addActionListener(this);
        
        botonRojo = new JButton("Rojo");
        add(botonRojo);
        botonRojo.addActionListener(this);
    }

    /*actionPerformed realiza la accion o lo que tenga que hacer el boton al dar click*/
    @Override
    public void actionPerformed(ActionEvent e) {
        
    // para diferenciar que boton esta siendo que pide una accion utilizo getSource 
        Object botonPulsado= e.getSource();
        if(botonPulsado==botonAzul){
        setBackground(Color.BLUE);
        }else if(botonPulsado==botonAmarillo){
        setBackground(Color.YELLOW);
        }else if(botonPulsado==botonRojo){
        setBackground(Color.RED);
        }
    }

}
