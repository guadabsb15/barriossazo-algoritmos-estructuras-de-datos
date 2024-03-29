/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadet7;

import java.util.Vector;
import java.util.Comparator;
/**
 *
 * @author BarriosSazo
 */
public class VectorHeap<E> extends AbstractPriorityQueue<E>{
    
    protected Vector<E> data; // the data, kept in heap order
    
    protected Comparator<? super E> ordering; // the comparison function

    public VectorHeap(Comparator<? super E> ordering)
    // post: constructs a new priority queue
    {
        data = new Vector<E>();
        this.ordering = ordering;
    }
    
    
    protected static int parent(int i)
    // pre: 0 <= i < size
    // post: returns parent of node at location i
    {
        return (i-1)/2;
    }
    
    protected static int left(int i)
    // pre: 0 <= i < size
    // post: returns index of left child of node at location i
    {
        return 2*i+1;
    }
    
    protected static int right(int i)
    // pre: 0 <= i < size
    // post: returns index of right child of node at location i
    {
        return 2*(i+1);
    }
    
    protected void percolateUp(int leaf)
    // pre: 0 <= leaf < size
    // post: moves node at index leaf up to appropriate position
    {
        int parent = parent(leaf);
        E value = data.get(leaf);
        while (leaf > 0 && (ordering.compare(data.get(parent),value) < 0))
        {
            data.set(leaf,data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf,value);
    }
    
    @Override
    public void add(E value)
    // pre: value is non-null comparable
    // post: value is added to priority queue
    {
        data.add(value);
        percolateUp(data.size()-1);
    }
    
    protected void pushDownRoot(int root)
    // pre: 0 <= root < size
    // post: moves node at index root down
    // to appropriate position in subtree
    {
    int heapSize = data.size();
    E value = data.get(root);
    while (root < heapSize) {
        int childpos = left(root);
        if (childpos < heapSize)
        {
            if ((right(root) < heapSize) &&(ordering.compare
            (data.get(childpos), data.get(childpos+1)) < 0))
            {
                childpos++;
            }
            // Assert: childpos indexes smaller of two children
            if (ordering.compare(value,data.get(childpos)) < 0)
            {
                data.set(root,data.get(childpos));
                root = childpos; // keep moving down
            } else { // found right location
                data.set(root,value);
                return;
            }
        } else { // at a leaf! insert and halt
            data.set(root,value);
            return;
        }
    }
}
    
    @Override
    public E remove()
    // pre: !isEmpty()
    // post: returns and removes minimum value from queue
    {
        E minVal = getFirst();
        data.set(0,data.get(data.size()-1));
        data.setSize(data.size()-1);
        if (data.size() > 1) pushDownRoot(0);
        return minVal;
    }
    
    @Override
    public E getFirst()
    // pre: !isEmpty()
    // post: returns the minimum value in the priority queue
    {
        return data.get(0);
    }   
      
    @Override
    public int size(){
        
        return data.size(); 
    }
}
