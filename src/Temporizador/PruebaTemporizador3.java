package Temporizador;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

//con clases internas locales

public class PruebaTemporizador3 {
	public static void main(String[]args) {
		Reloj1 miReloj= new Reloj1(3, true);
		miReloj.enMarcha();
		miReloj.detener();
	}
	
}

class Reloj1{
	
	private int intervalo;
	private boolean sonido;
	private String seg;
	public Reloj1(int intervalo, boolean sonido) {
		this.intervalo= intervalo * 1000;
		this.sonido=sonido;
		seg= String.valueOf(intervalo);
	}
	
	public void enMarcha() {
		
		// el modificador private para clases solo se puede usar si la clase es interna
		 class DameLaHora3 implements ActionListener{

				@Override
				public void actionPerformed(ActionEvent e) {
					Date ahora= new Date();
					System.out.println("Te pongo la hora cada " + seg + " sg " + ahora);
					if(sonido) {
						Toolkit.getDefaultToolkit().beep();
					}
				}
				
		}//clase interna local
		 
		 ActionListener oyente= new DameLaHora3();
			Timer miTemporizador= new Timer(intervalo,oyente);
			miTemporizador.start();
			
	}//fin metodo enMarcha
	
	public void detener() {
		JOptionPane.showMessageDialog(null,"Pulsa aceptar para terminar");
		System.exit(0);
	}
}