/**
 * Clase que representa al cliente, la cual tiene
 * el tiempo de llegada al banco y el tiempo de transaccion 
 */
package hojadetrabajo5;

/**
 *
 * @author BarriosSazo
 */
public class Cliente {
    
    private int tLlegada;
    private int tTransaccion;
   
    /**
     * Constructor del cliente
     * @param t1  tiempo de llegada al banco del cliente
     * @param t2  tiempo de transaccion del cliente
     */
    public Cliente(int t1,int t2){
        
        tLlegada=t1;
        tTransaccion=t2;
    }
    
    /**
     * Devuelve el tiempo de llegada
     * @return  tLlegada
     */
    public int getLlegada(){
        return tLlegada;
    }
    
    /**
     * Devuelve el tiempo de transaccion
     * @return tTransaccion
     */
    public int getTransaccion(){
        return tTransaccion;
    }
    
  
}
