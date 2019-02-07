/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsandoWindowsListener2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author bryan
 */

public class M_Ventana extends WindowAdapter{
    
    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

}

/*public class M_Ventana implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {

     System.out.println("Ventana abirta");
    }

    @Override
    public void windowClosing(WindowEvent e) {

        System.out.println("Ventana cerrada");
    }

    @Override
    public void windowClosed(WindowEvent e) {
          System.out.println("Ventana ha sido cerrada");
    }

    // metdo se usa cuando la ventana se minimiza
    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {

     System.out.println("Ventana restaurada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {

     System.out.println("Ventana desactivada");
    }

}*/
