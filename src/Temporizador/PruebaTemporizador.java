package Temporizador;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {

    public static void main(String[] args) {
        DameLaHora oyente = new DameLaHora();
        Timer miTemporizador = new Timer(1000, oyente);//objeto timer me permite hacer un temporizador
        miTemporizador.start();
        JOptionPane.showMessageDialog(null, "Pulsar aceptar para detener");
        System.exit(0);
    }

}

class DameLaHora implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Date ahora = new Date();
        System.out.println("La hora cada segundo es :" + ahora);
        Toolkit.getDefaultToolkit().beep();
    }

}
