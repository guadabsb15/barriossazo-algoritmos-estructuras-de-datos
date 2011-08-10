/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadet2;

import java.util.Vector;

/**
 *
 * @author BarriosSazo
 */
public class StackVector<E> extends AbstractStack<E>{
    
    protected Vector<E> data;
    
    public StackVector()
    // post: an empty stack is created
    {
        data = new Vector<E>();
    }
   
           
    
    @Override
    public void push(E item)
    // post: item is added to stack
    // will be popped next if no intervening push
    {
        data.add(item);
    }
   
   
    @Override
    public E pop()
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
    {
        return data.remove(size()-1);
    }
    

    @Override
    public E top()
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    {
        return data.elementAt(size()-1);
    }
   
    
    @Override
    public int size()
    // post: returns the number of elements in the stack
    {
        return data.size();
    }
}
