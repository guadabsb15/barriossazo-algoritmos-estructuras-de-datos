/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo5;

/**
 *
 * @author BarriosSazo
 */
public class Cliente {
    
    private int tLlegada;
    private int tTransaccion;
   
    
    public Cliente(int t1,int t2){
        
        tLlegada=t1;
        tTransaccion=t2;
    }
    
    public int getLlegada(){
        return tLlegada;
    }
    
    public int getTransaccion(){
        return tTransaccion;
    }
    
  
}
