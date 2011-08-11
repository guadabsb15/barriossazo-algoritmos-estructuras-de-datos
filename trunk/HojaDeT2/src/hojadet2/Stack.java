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
    // post: es agregado un item al stack
   
    public E pop();
    // pre: el stack no esta vacio
    // post: el ultimo item agregado es sacado del stack y retornado  
   
   
    public E top();
    // pre: el stack no esta vacio
    // post: el ultimo item agregado es retornado sin ser sacado del stack
    
    public boolean isEmpty();
    // post: devuelve verdadero si el stack no tiene ningun item 
    
    public int size();
    // post: devuelve el numero de items en el stack
    
}
