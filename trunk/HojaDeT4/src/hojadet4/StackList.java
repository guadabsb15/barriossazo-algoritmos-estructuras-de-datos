/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadet4;

/**
 *
 * @author BarriosSazo
 */
public class StackList<E> extends AbstractStack<E>{
    
    SinglyLinkedList<E> data;
    
    public StackList()
    {
        data= new SinglyLinkedList();
    }
    
    public void push(E item)
    {
        
        data.addFirst(item);// se agrega elemento al vector, el cual aumenta de tamanio
    }
   
    /**
     * Si el stack no esta vacio devuelve el ultimo
     * item en el stack y lo saca del mismo
     * @return ultimoItem
     */
    @Override
    public E pop()
    {   
        if (!isEmpty()){
            return data.removeFirst();//devuelbe y elimina del vector el ultimo elemento
        } else{
            return null;//si el vector esta vacio no devuelve null
        }
    }
    
    /**
     * Si el stack no esta vacio devuelve el ultimo
     * item en el stack
     * @return ultimoItem
     */
    @Override
    public E top()
    {
        if (!isEmpty()){
            return data.get(0);//devuelve el ultimo elemento del vector
        }else{
            return null;// si el vector esta vacio devuelve null
        }
    }
   
    /**
     * Devuelve el numero de items en el stack
     * @return size
     */
    @Override
    public int size()
    {
        return data.size();//devuelve cuantos elementos tiene el vector
    }
    
    /**
     * Devuelve un string con los items del stack separados
     * por coma (,) en orden del primero hasta el ultimo (agregado mas recientemente)
     * @return s string donde se concatenan los items del stack
     */
    public String toString()
    {
        String s="";
        for(int i=size()-1; i>=0;i--) //loop que recorre al vector y concatena sus elementos
        {
            s=s+data.get(i)+",";
        }
        
        return s;
    }
}
