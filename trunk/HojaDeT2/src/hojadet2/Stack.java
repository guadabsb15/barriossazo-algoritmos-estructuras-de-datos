/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadet2;

/**
 *
 * @author BarriosSazo
 */
public interface Stack<E> {
    
 
    public void push(E item);
    // post: item is added to stack
    // will be popped next if no intervening push
   
    public E pop();
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
   
   
    public E top();
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    
    public boolean isEmpty();
    // post: returns true if and only if the stack is empty
    
    public int size();
    // post: returns the number of elements in the stack
    
}
