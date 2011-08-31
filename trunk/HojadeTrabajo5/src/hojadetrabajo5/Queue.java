/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo5;

/**
 *
 * @author BarriosSazo
 */
public interface Queue<E> {
    
    E element();
    //pre:La cola no esta vacia
    //post:Devuelve la cabeza de la cola sin eliminarla y si la cola
    //esta vacia devuelve una excepcion
   
    boolean offer(E e);
    //pre:si aun hay espacio
    //post: inserta el elemento al final de la cola
   
    E peek();
    //pre:La cola no esta vacia
    //post:Devuelve la cabeza de la cola sin eliminarla y si la cola
    //esta vacia devuelve null
   
   
    E poll();
    //pre:La cola no esta vacia
    //post:Devuelve y elimina la cabeza de la cola y si la cola esta vacia devuelve null
   
    E remove();
    //pre:La cola no esta vacia
    //post:Devuelve y elimina la cabeza de la cola y si la cola esta vacia
    //devuelve una excepcion
}


    
