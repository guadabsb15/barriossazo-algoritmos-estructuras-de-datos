/**
 * Para hacer la cola implementada con array y la cola implementada con 
 * lista circular, se uso como referencia el libro
 * Java Structures de Duane Bailey
 */
package hojadetrabajo5;

/**
 *
 * @author BarriosSazo
 */
public class QueueList<E> extends AbstractQueue<E>{
   
    protected CircularList<E> data;
   
    public QueueList()
    // post: constructs a new, empty queue
    {
        data = new CircularList<E>();
    }
   
    @Override
    public boolean offer(E value)
    // post: the value is added to the tail of the structure
    {
        data.addLast(value);
        return true;
    }
   
    @Override
    public E poll()
    // pre: the queue is not empty
    // post: the head of the queue is removed and returned
    {
        return data.removeFirst();
    }
   
    @Override
    public E peek()
    // pre: the queue is not empty
    // post: the element at the head of the queue is returned
    {
        return data.getFirst();
    }
    
    public int size(){
        return data.size();
    }
}

