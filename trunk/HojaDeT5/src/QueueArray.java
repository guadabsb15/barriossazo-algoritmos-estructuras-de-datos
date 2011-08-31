/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BarriosSazo
 */
public class QueueArray<E> extends AbstractQueue<E>{
    
    protected Object data[]; // an array of the data
    protected int head; // next dequeue-able value
    protected int count; // current size of queue
    
    public QueueArray(int size)
    // post: create a queue capable of holding at most size values
    {
        data = new Object[size];
        head = 0;
        count = 0;
    }
    
    @Override
    public boolean offer(E value)
    // pre: the queue is not full
    // post: the value is added to the tail of the structure
    {
        int tail = (head + count) % data.length;
        data[tail] = value;
        count++;
        return true;
    }

    
    @Override
    public E poll()
    // pre: the queue is not empty
    // post: the head of the queue is removed and returned
    {
        E value = (E)data[head];
        head = (head + 1) % data.length;
        count--;
        return value;
    }
    
    @Override
    public E peek()
    // pre: the queue is not empty
    // post: the element at the head of the queue is returned
    {
        return (E)data[head];
    }
    
}
