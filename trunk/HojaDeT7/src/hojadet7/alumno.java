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
public class alumno {
    int carnet;
    Date fecha;
    
    alumno(int c, Date f){
        carnet = c;
        fecha = f;
    }
    
    public int getCarnet(){
        return carnet;
    }
    
    public Date getFecha(){
        
        return fecha;
    }
    
  
}
