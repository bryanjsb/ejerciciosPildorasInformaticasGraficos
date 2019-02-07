package graficos;

import java.awt.GraphicsEnvironment;
import java.util.Scanner;

public class ProbandoGraphicsEnvironment {
    public static void main(String[]args){
       String[]nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment()
               .getAvailableFontFamilyNames();
       
       for(String n:nombresDeFuentes){
        System.out.printf("fuente %s%n",n.toString());
       }
       
       Scanner entrada= new Scanner(System.in);
       System.out.println("introduce la fuente a buscar");
       String fuente= entrada.nextLine();
       boolean estaLaFuente=false;
       String nombreFuente="";
       for(String n:nombresDeFuentes){
           if(n.equalsIgnoreCase(fuente)){
               estaLaFuente= true;
               nombreFuente=n.toString();
           }
       }
       
       if(estaLaFuente){
           System.out.println("si esta la fuente "+ nombreFuente);
       }
       else{
        System.err.println("no esta la fuente "+ fuente);
       }
       
       
    }
}
