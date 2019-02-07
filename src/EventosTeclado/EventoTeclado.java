package EventosTeclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventoTeclado implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //tecla pulsada
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
