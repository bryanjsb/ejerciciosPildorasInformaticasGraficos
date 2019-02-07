/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsandoWindowsStateListener;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

/**
 *
 * @author bryan
 */
public class CambiaEstado implements WindowStateListener{

    @Override
    public void windowStateChanged(WindowEvent e) {
            System.out.println("la ventana ha cambiado de estado");
            
            if(e.getNewState()==Frame.NORMAL){
            System.out.println("la ventana esta en estdo normal");
            }
            
            else if(e.getNewState()==Frame.MAXIMIZED_BOTH){
            System.out.println("la ventana esta maximizada");
            }
             
            else  if(e.getNewState()==Frame.ICONIFIED){
            System.out.println("la ventana esta minimizado");
            }
              
       
            
    }
    
}
