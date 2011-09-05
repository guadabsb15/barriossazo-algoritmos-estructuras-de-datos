/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo5;

/**
 *
 * @author BarriosSazo
 */
public class Evento {
    
    private int tiempo;
    private boolean esLlegada;
    private int cola;
    private Cliente c;
    
    public Evento(Cliente cliente, boolean llegada, int t){
        tiempo= t;
        c= cliente;
        esLlegada= llegada;
    }
    
    public void setTiempo(int t){
        
        tiempo=t;
    }
    
    public void setCola(int co){
        cola=co;
    }
    
    public int getTiempo(){
        return tiempo;
    }
    
    public int getCola(){
        return cola;
    }
    
    
}
