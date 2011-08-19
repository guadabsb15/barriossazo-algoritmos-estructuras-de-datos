/**
 * Clase abstracta que implementa la interfaz Stack
 */
package hojadet4;

/**
 *
 * @author BarriosSazo
 */
public abstract class AbstractStack<E> implements Stack<E> {
        
    
    @Override
    /**
     * Duvuelve verdadero si el stack esta vacio, de lo contrario
     * devuelve falso
     * @return size==0 
     */
    public boolean isEmpty(){
        return size()==0;
    }
  
   
}
