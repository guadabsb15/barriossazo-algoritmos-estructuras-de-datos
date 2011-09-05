/**
 * Para hacer la interfaz de lista, la clase abstracta, la clase nodo
 * y la lista simplemente encadenada se uso como referencia el libro
 * Java Structures de Duane Bailey
 */
package hojadetrabajo5;

/**
 *
 * @author BarriosSazo
 */
public class SinglyLinkedList<E> extends AbstractList<E> {
    
    protected int count; // list size
    protected Node<E> head; // ref. to first element

    public SinglyLinkedList()
    // post: generates an empty list
    {
        head = null;
        count = 0;
    }
    
    @Override
    public int size(){
        
        return count;
    }
    
    @Override
    public void clear(){
        
        head = null;
        count = 0;
    }
     
    @Override
    public E remove(E value){
        
        Node<E> finger = head;
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
                head = finger.next();
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
    public int indexOf(E value){
        
        int i=0;
        Node<E> finger = head;
        
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
    public E get(int i){
        Node<E> finger = head;
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
    public E set(int i, E o){
        
        Node<E> finger = head;
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
    public void add(int i, E o){
        if (i == size()) {
            // location for new value
            Node<E> temp = new Node<E>(o,null);
            if (head != null)
            {
                // pointer to possible tail
                Node<E> finger = head;
                while (finger.next() != null)
                {
                    finger = finger.next();
                }
                finger.setNext(temp);
            } else head = temp;

            count++;
        } else if (i==0) {
            head = new Node<E>(o, head);
            count++;
            
        } else {
            Node<E> previous = null;
            Node<E> finger = head;
            // search for ith position, or end of list
            while (i > 0)
            {
                previous = finger;
                finger = finger.next();
                i--;
            }
            // create new value to insert in correct position
            Node<E> current = new Node<E>(o,finger);
            count++;
           // make previous value point to new value
            previous.setNext(current);
        }
    }
      
    
}
