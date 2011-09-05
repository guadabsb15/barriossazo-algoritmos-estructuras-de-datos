/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo5;
import java.util.Random;
/**
 *
 * @author BarriosSazo
 */
public class HojadeTrabajo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        QueueArray cola1= new QueueArray(10);
        QueueArray cola2= new QueueArray(10);
        QueueArray cola3= new QueueArray(10);
        QueueArray cola4= new QueueArray(10);
        
        SinglyLinkedList<Evento> ListaEventos= new SinglyLinkedList<Evento>();
        
        int nclientes=10;
        
        Random rand = new Random();
        int temp1,temp2;
        
        for (int i=1; i<=nclientes;i++){
            
             temp1=rand.nextInt(480)+1;
             temp2=rand.nextInt(30)+1;
             Cliente cl = new Cliente(temp1,temp2);
             Evento ev= new Evento(cl,true,cl.getLlegada());
             int j=0;
             Node<Evento> temporal =ListaEventos.head;
             while(j<=ListaEventos.size()-1 && ev.getTiempo()>temporal.value().getTiempo()){
                 j++;
                 temporal=temporal.next();
             }
             
             ListaEventos.add(j, ev);
        }
        
        for (int i=0;i<nclientes;i++){
              System.out.println(ListaEventos.get(i).getTiempo());
        }
      
        
        
       
    }
}
