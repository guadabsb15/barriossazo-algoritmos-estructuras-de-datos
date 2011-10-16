/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadet7;
import java.util.*;
/**
 *
 * @author BarriosSazo
 */
public class dateComparator<E> implements Comparator{
    
    
    @Override
    public int compare(Object al1, Object al2){
        int numero;
                
        Date al1Fecha = ((alumno)al1).getFecha();        
        Date al2Fecha = ((alumno)al2).getFecha();
        
        numero= al2Fecha.compareTo(al1Fecha);
            
        return numero;
    }
    
}
