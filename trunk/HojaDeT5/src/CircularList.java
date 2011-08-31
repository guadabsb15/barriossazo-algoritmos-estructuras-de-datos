/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BarriosSazo
 */
public class CircularList<E> extends AbstractList<E>{
    
    protected Node<E> tail;
    protected int count;
    
     public int size(){
        
        return count;
    }
     
    public CircularList()
    // pre: constructs a new circular list
    {
        tail = null;
        count = 0;
    }
    
    @Override
    public void addFirst(E value)
    // pre: value non-null
    // post: adds element to head of list
    {
    
        Node<E> temp = new Node<E>(value);
        if (tail == null) { // first value added
            tail = temp;
            tail.setNext(tail);
        } else { // element exists in list
            temp.setNext(tail.next());
            tail.setNext(temp);
        }
        
        count++;
    }
    
    @Override
   public void addLast(E value)
   // pre: value non-null
   // post: adds element to tail of list
   {
        // new entry:
        addFirst(value);
        tail = tail.next();
   }
   
    @Override
   public E removeLast()
   // pre: !isEmpty()
   // post: returns and removes value from tail of list
   {
        Node<E> finger = tail;
        while (finger.next() != tail) {
            finger = finger.next();
        }
    // finger now points to second-to-last value
        Node<E> temp = tail;
        if (finger == tail)
        {
            tail = null;
        } else {
            finger.setNext(tail.next());
            tail = finger;
        }

        count--;
        return temp.value();
    }
   
    @Override
    public void add(int i, E o)
    // pre: 0 <= i <= size()
    // post: adds ith entry of list to value o
    {

        if (i == size()) {
            addLast(o);
        } else if (i == 0) {
            addFirst(o);
        } else {
            Node<E> previous = null;

            Node<E> finger = tail.next();
            // search for ith position, or end of list
            while (i > 0)
            {
                previous = finger;
                finger = finger.next();
                i--;
            }
            // create new value to insert in correct position
            Node<E> current =new Node<E>(o,finger);
            count++;
            // make previous value point to new value
            previous.setNext(current);
        }
        
    }
    
    @Override
    public E set(int i, E o){
        
        Node<E> finger = tail.next();
        Node<E> previous = null;
        int contador=0;
                
        while (finger != null && contador<i)
        {
            previous = finger;
            finger = finger.next();
            contador++;
        }
        // finger points to target value
        if (finger != null) {
            finger.setValue(o);
            return finger.value();
        } else
        // didn't find it, return null
        return null;
        
    }
    
    @Override
    public E get(int i){
        Node<E> finger = tail.next();
        Node<E> previous = null;
        int contador=0;
                
        while (finger != null && contador<i)
        {
            previous = finger;
            finger = finger.next();
            contador++;
        }
        // finger points to target value
        if (finger != null) {
            return finger.value();
        }
        // didn't find it, return null
        return null;
        
    }
    
    @Override
     public int indexOf(E value){
        
        int i=0;
        Node<E> finger = tail.next();
        
        while (finger != null && !finger.value().equals(value))
        {
            finger = finger.next();
            i++;
        }
        if (finger!=null)
        {
            return i;  
        } else if (finger==null && finger.value().equals(value))
        {
            return i; 
        } else return -1;
        
    }
    
    @Override
     public E remove(E value){
        
        Node<E> finger = tail.next();
        Node<E> previous = null;
        while (finger != null && !finger.value().equals(value))
        {
            previous = finger;
            finger = finger.next();
        }
        // finger points to target value
        if (finger != null) {
        // we found element to remove
            if (previous == null) // it is first
            {
                tail.setNext(finger.next());
            } else { // it's not first
                previous.setNext(finger.next());
            }
            count--;
            return finger.value();
        } 
        // didn't find it, return null
        return null;
    
    }
     
    @Override
    public void clear(){
        
        tail.setNext(null);
        count = 0;
    }
     
     
}
