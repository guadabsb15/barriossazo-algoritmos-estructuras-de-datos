/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadet6;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author BarriosSazo
 */
public class HojaDeT6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear Colas ahora con JCF
        Queue<Cliente> cola1= new LinkedList<Cliente>();
        Queue<Cliente> cola2= new LinkedList<Cliente>();
        Queue<Cliente> cola3= new LinkedList<Cliente>();
        Queue<Cliente> cola4= new LinkedList<Cliente>();
        
        
        //crea lista de eventos con JCF
        LinkedList<Evento> ListaEventos= new LinkedList<Evento>();
        
        int nclientes=150;  //se puede ir cambiando para cambiar el numero de clientes
        
        Random rand = new Random();
        int temp1,temp2;
        int suma=0;// llevara guardada la suma de los tiempos en el banco de los clientes
        float promedio; // guardara el promedio de los tiempos en el banco
        
        //Crea la cantidad de clientes que se requiere con sus tiempos de llegada y 
        // tiempo de transaccion y ademas se agergan a la lista de eventos los eventos
        // de llegada de estos clientes
        for (int i=1; i<=nclientes;i++){
            
             temp1=rand.nextInt(480)+1; //tiempo de llegada
             temp2=rand.nextInt(30)+1;  //tiempo de transaccion
             Cliente cl = new Cliente(temp1,temp2);
             Evento ev= new Evento(cl,true,cl.getLlegada());
             agregarOrdenado(ListaEventos,ev);
        }
        
        
       while (ListaEventos.size()>0){// se recorre la lista hasta que este vacia
           
           if (ListaEventos.getFirst().getLlegada()==false){
               //si el evento que toca eliminar es evento de salida
               
               int tiempo; //guarda el tiempo al que saldra de la cola el cliente
               int espera; //guarda el tiempo que estubo este cliente en el banco
               
               tiempo= ListaEventos.getFirst().getTiempo();
               espera= tiempo- ListaEventos.getFirst().getCliente().getLlegada();
               suma= suma+espera;
               
               // Se elimina el evento de la lista y se saca el cliente de la cola
               //ademas se crea el evento de salida del siguiente cliente en ventanilla
               switch (ListaEventos.removeFirst().getCola()){
                   case 1: { 
                       cola1.remove();
                       agregarEventoSalida(cola1,ListaEventos,tiempo,1);
                   } break;
                   case 2: {
                       cola2.remove();
                       agregarEventoSalida(cola2,ListaEventos,tiempo,2);
                   } break;
                   case 3:{ 
                       cola3.remove();
                       agregarEventoSalida(cola3,ListaEventos,tiempo,3);
                   } break;
                   case 4:{ 
                       cola4.remove();
                       agregarEventoSalida(cola4,ListaEventos,tiempo,4);
                   } break;
               }
               
           } else{// si el evento es de llegada
               // se busca la cola con menos clientes y que tenga menos de 10 clientes
               // y en esa cola se agrega al cliente
               //si el cliente es el primero en entrar a la cola, se crea su evento de salida
                if (cola1.size()<= cola2.size()  &&  cola1.size()<= cola3.size() 
                    &&  cola1.size()<= cola4.size()  && cola1.size()<10)
                {
                    cola1.add(ListaEventos.removeFirst().getCliente());
                    if (cola1.size()==1){
                       agregarEventoSalida(cola1,ListaEventos,cola1.peek().getLlegada(),1);
                    }
                }
                else if(cola2.size()<= cola1.size()  &&  cola2.size()<= cola3.size() 
                    &&  cola2.size()<= cola4.size()  && cola2.size()<10)
                {
                    cola2.add(ListaEventos.removeFirst().getCliente());
                     if (cola2.size()==1){
                       agregarEventoSalida(cola2,ListaEventos,cola2.peek().getLlegada(),2);
                    }
                }
                else if(cola3.size()<= cola1.size()  &&  cola3.size()<= cola2.size() 
                    &&  cola3.size()<= cola4.size()  && cola3.size()<10)
                {
                    cola3.add(ListaEventos.removeFirst().getCliente());
                     if (cola3.size()==1){
                       agregarEventoSalida(cola3,ListaEventos,cola3.peek().getLlegada(),3);
                    }
                }
                else if(cola4.size()<= cola1.size()  &&  cola4.size()<= cola2.size() 
                    &&  cola4.size()<= cola3.size()  && cola4.size()<10)
                {
                    cola4.add(ListaEventos.removeFirst().getCliente());
                     if (cola4.size()==1){
                       agregarEventoSalida(cola4,ListaEventos,cola4.peek().getLlegada(),4);
                    }
                } 
           }
          

       }
           promedio= suma/nclientes; // se calcula el promedio de tiempo en el banco
           
           System.out.println("El promedio de permanencia en el banco: "+promedio+"minutos");
    }
    
    
    /**
     * Encuentra la posision donde se debe agregar el evento, tomando
     * en cuenta que la lista debe quedar ordenada en orden ascendente
     * de tiempos
     * @param lista    lista donde se agregara el evento
     * @param eve      evento a agregar
     */
    public static void agregarOrdenado(LinkedList<Evento> lista, Evento eve)
    {   
        
        int j=0;
        if (lista.isEmpty()==false){
            
             Evento temporal =lista.getFirst();
             
             while(j<=lista.size()-1 && eve.getTiempo()>temporal.getTiempo()){
                 
                 j++;
                 
                 if (j<=lista.size()-1){
                    temporal=lista.get(j);
                 }
                 
             }
        }
             
             lista.add(j, eve);
    }
    
    
    /**
     * Este metodo crea y agrega los eventos de salida en la lista de eventos
     * @param cola      cola donde se encuentra cliente (asociado a evento) en ventanilla 
     * @param lista      lista donde se agregara el evento
     * @param tiempoLlegadaVentanilla    tiempo de llegada a la ventanilla
     * @param nCola          numero de cola donde se encuentra el cliente
     */
    public static void agregarEventoSalida(Queue<Cliente> cola, LinkedList lista, int tiempoLlegadaVentanilla, int nCola){
        
         if (cola.size()>0){
            Evento ev= new Evento(cola.peek(),false,tiempoLlegadaVentanilla+cola.peek().getTransaccion());
            ev.setCola(nCola);
            agregarOrdenado(lista,ev);
         }
    
    }
}
