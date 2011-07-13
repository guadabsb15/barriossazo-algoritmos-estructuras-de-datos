/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo1.radio;

/**
 *
 * @author BarriosSazo
 */
public interface Radio {
    
   public void onoff();// toggle on-off
   public void change(); //toggle ente AM y FM
   public void avanzar();
   public void retroceder();
   public void save(int pos);  // Guardar en la memoria[pos] la estacion actual *   
   public void push(int pos);  // Cargar la estacion almacenda en la memoria[pos] *
   public boolean getOn();     // devuelve si está encendido o pagado
   public double getEmisora(); // devuelve la emisora
   public boolean getFM();  //  ver si esta en FM,
    
}
