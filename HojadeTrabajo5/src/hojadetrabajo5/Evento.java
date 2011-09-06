/**
 * Clase que respresenta un evento
 * ya sea de salida o de entrada
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
    
    /**
     * Constuctor
     * @param cliente  cliente que genera el evento
     * @param llegada  true si es evento de llegada y false si es evento de salida
     * @param t        tiempo
     */
    public Evento(Cliente cliente, boolean llegada, int t){
        tiempo= t;
        c= cliente;
        esLlegada= llegada;
    }
    
    /**
     * Asigna numero de cola donde se encuentre el cliente asociado a este evento
     * @param co  cola donde se encuentra el cliente
     */
    public void setCola(int co){
        cola=co;
    }
    
    /**
     * Devuelve el tiempo al que se lleva a cabo el evento
     * @return tiempo
     */
    public int getTiempo(){
        return tiempo;
    }
    
    /**
     * Devuelve numero de cola donde se encuentra el cliente 
     * @return cola
     */
    public int getCola(){
        return cola;
    }
   
    /**
     * Devuelve cliente que se encuentra asociado a este evento
     * @return c
     */
    public Cliente getCliente(){
        return c;
    }
    
    /**
     * Devuelve true si es evento de llegada y false si es evento de salida
     * @return esLlegada
     */
    public boolean getLlegada(){
        return esLlegada;
    }
    
}
