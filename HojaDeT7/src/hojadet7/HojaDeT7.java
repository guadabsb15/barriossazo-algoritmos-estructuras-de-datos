/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadet7;

/**
 *
 * @author BarriosSazo
 */
public class HojaDeT7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CarneComparator<alumno> porCarne = new CarneComparator<alumno>();
        
        VectorHeap primero= new VectorHeap (porCarne);
    }
}
