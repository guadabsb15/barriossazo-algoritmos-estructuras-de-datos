/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadet2;

/**
 *
 * @author BarriosSazo
 */
public abstract class AbstractStack<E> implements Stack<E> {
        
    
    @Override
    public boolean isEmpty(){
        return size()==0;
    }
    // post: returns true if and only if the stack is empty
   
}
