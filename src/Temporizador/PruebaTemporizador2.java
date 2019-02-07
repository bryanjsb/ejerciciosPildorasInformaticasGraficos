package Temporizador;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

// con clases internas
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador2 {
	public static void main(String[]args) {
		Reloj miReloj= new Reloj(2, true);
		miReloj.enMarcha();
		miReloj.detener();
	}
}

class Reloj{
	
	private int intervalo;
	private boolean sonido;
	private String seg;
	
	public Reloj(int intervalo, boolean sonido) {
		this.intervalo= intervalo * 1000;
		this.sonido=sonido;
		seg= String.valueOf(intervalo);
	}
	
	public void enMarcha() {
		ActionListener oyente= new DameLaHora2();
		Timer miTemporizador= new Timer(intervalo,oyente);
		miTemporizador.start();
		
	}
	
	public void detener() {
		JOptionPane.showMessageDialog(null,"Pulsa aceptar para terminar");
		System.exit(0);
	}
	
// el modificador private para clases solo se puede usar si la clase es interna
private class DameLaHora2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Date ahora= new Date();
		System.out.println("Te pongo la hora cada " + seg + " sg " + ahora);
		if(sonido) {
			Toolkit.getDefaultToolkit().beep();
		}
	}//clase interna
	
	}
}