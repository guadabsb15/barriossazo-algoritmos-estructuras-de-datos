/**
 * Para hacer la interfaz de lista, la clase abstracta, la clase nodo
 * y la lista simplemente encadenada se uso como referencia el libro
 * Java Structures de Duane Bailey
 */
package hojadet4;

/**
 *
 * @author BarriosSazo
 */
public class Node<E> {
    
    protected E data; // valor guardado en este elemento
    protected Node<E> nextElement; // referenca a siguiete
    
    /**
     * Constructor 
     * @param v valor que tendra el nodo que se construira
     * @param next a quien hace referencia el nuevo nudo
     */
    public Node(E v, Node<E> next)
    {
        data = v;
        nextElement = next;
    }
    
    /**
     * Constructor
     * Si no envia a quien hace referencia, se agregara de ultimo en la lista
     * por lo que hara referencia a null
     * @param v valor que tendra el nodo que se construira
     */
    public Node(E v)
    // post: constructs a new tail of a list with value v
    {
        this(v,null);
    }
    
    /**
     * Este metodo devuelve el nodo al que hace referencia 
     * @return nextElement 
     */
    public Node<E> next()
    {
        return nextElement;
    }
    
     /**
     * Este metodo permite asignar a quien hacer referencia 
     * @return nextElement 
     */
    public void setNext(Node<E> next)
    {
        nextElement = next;
    }
    
    /**
     * Devuelve el valor asociado a este nodo
     * @return data
     */
    public E value()
    {
        return data;
    }
    
     /**
     * Asigna un nuevo valor al valor asociado a este nodo
     * 
     */
    public void setValue(E value)
    {
        data = value;
    }
    
   
}
