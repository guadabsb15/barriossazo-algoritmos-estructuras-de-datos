/**
 * Stack implementado usando un vector donde cambia de tamanio
 * conforme se le agregan items
 */
package hojadet2;

import java.util.Vector;

/**
 *
 * @author BarriosSazo
 */
public class StackVector<E> extends AbstractStack<E>{
    
    protected Vector<E> data;
    
    /**
     * Crea un stack vacio
     */
    public StackVector()
    {
        data = new Vector<E>();//se crea un nuevo vector
    }
   
           
    
     /**
     * Agrega un item al final del stack
     * @param item el cual se agregara al stack
     */
    @Override
    public void push(E item)
    {
        data.add(item);// se agrega elemento al vector, el cual aumenta de tamanio
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
            return data.remove(size()-1);//devuelbe y elimina del vector el ultimo elemento
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
            return data.elementAt(size()-1);//devuelve el ultimo elemento del vector
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
        for(int i=0; i<data.size();i++) //loop que recorre al vector y concatena sus elementos
        {
            s=s+data.elementAt(i)+",";
        }
        
        return s;
    }
}
