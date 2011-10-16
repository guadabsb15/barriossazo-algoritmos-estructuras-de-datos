/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadet7;
import java.util.Comparator;
/**
 *
 * @author BarriosSazo
 */
 public class CarneComparator<E> implements Comparator{
    
    
    @Override
    public int compare(Object al1, Object al2){
        int al1Carnet = ((alumno)al1).getCarnet();        
        int al2Carnet = ((alumno)al2).getCarnet();
        
        return al2Carnet-al1Carnet;
    }
    
    
}
