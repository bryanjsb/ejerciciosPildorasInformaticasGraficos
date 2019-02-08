package UsandoWindowsListener;

import javax.swing.JFrame;

public class Principal {

    public static void main(String[] args) {
        Marco marco1 = new Marco("Marco 1 Probando eventos con windows listener");
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Marco marco2 = new Marco("Marco 2 Probando eventos con windows listener");
        marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
