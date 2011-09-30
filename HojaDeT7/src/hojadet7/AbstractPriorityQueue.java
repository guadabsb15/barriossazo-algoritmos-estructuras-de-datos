/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadet7;

/**
 *
 * @author BarriosSazo
 */
public abstract class AbstractPriorityQueue<E extends Comparable<E>> implements PriorityQueue<E>{
    
    
    @Override
     public void clear(){
     // post: removes all elements from queue
         
         for (int i=0;i<size();i++){
             remove();
         }
     }
     
    
    @Override
   public boolean isEmpty(){
    // post: returns true iff no elements are in queue
       
       return size()==0;
   }
    
    
}
