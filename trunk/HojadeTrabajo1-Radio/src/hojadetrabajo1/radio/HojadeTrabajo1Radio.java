/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo1.radio;
import java.util.*;
/**
 *
 * @author BarriosSazo
 */
public class HojadeTrabajo1Radio {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Prende el radio");
        System.out.println("2. Cambia de AM a FM");
        System.out.println("3. Avanzar en el dial de las emisoras");
        System.out.println("4. Guardar una emisora en uno de los 12 botones");
        System.out.println("5. Permite seleccionar la emisora puesta en un botón");
        System.out.println("6. Apagar el radio");
        
        int i = s.nextInt();
        
        System.out.println(i);
    }
}
