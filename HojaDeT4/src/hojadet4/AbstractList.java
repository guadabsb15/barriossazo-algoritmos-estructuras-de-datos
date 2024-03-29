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
public abstract class AbstractList<E> implements List<E>{
    
    @Override
      public boolean isEmpty(){
        return size()==0;
      }
      
    @Override
      public void addFirst(E value){
        add(0,value);
      }
    
    @Override
     public void addLast(E value){
         add(size()-1,value);
     }
     
    @Override
     public E getFirst(){
         return get(0);
     }
     
    @Override
     public E getLast(){
         return get(size()-1);
     }
     
    @Override
     public E removeFirst(){
         return remove(0);
     }
     
    @Override
     public E removeLast(){
         return remove(size()-1);
     }
     
    @Override
     public E remove(int i){
        return remove(get(i));
    } 
}
