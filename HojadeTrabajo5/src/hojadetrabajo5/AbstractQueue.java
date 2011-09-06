/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo5;

/**
 *
 * @author BarriosSazo
 */
public abstract class AbstractQueue<E> implements Queue<E>{
   
    public boolean add(E o)
    {
        if (offer(o))
            return true;
        else
            return false;
    }
   
    @Override
    public E remove()
    {
        return poll();
    }
   
    @Override
    public E element()
    {
        return peek();
    }
   
    /**
     * Elimina todos los elementos de la cola
     */
    public void clear()
    {
        while(peek()!=null){
            poll();
        }
    }
   
}

