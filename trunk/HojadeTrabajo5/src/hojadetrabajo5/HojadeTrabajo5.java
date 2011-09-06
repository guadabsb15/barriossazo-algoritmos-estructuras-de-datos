/*
 * Maria Guadalupe Barrios Sazo
 * Hoja de Trabajo 5: Simulacion de Bancos
 * Hace la simulacion del tiempo que tardaran cierta cantidad
 * de personas en un banco con 4 colas
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
        
        //Crear Colas
        QueueArray<Cliente> cola1= new QueueArray<Cliente>(10);
        QueueArray<Cliente> cola2= new QueueArray<Cliente>(10);
        QueueArray<Cliente> cola3= new QueueArray<Cliente>(10);
        QueueArray<Cliente> cola4= new QueueArray<Cliente>(10);
        
        SinglyLinkedList<Evento> ListaEventos= new SinglyLinkedList<Evento>();
        
        int nclientes=10;
        
        Random rand = new Random();
        int temp1,temp2;
        int suma=0;
        float promedio;
        
        //Crea la cantidad de clientes que se requiere con sus tiempos de llegada y 
        // tiempo de transaccion 
        for (int i=1; i<=nclientes;i++){
            
             temp1=rand.nextInt(480)+1;
             temp2=rand.nextInt(30)+1;
             Cliente cl = new Cliente(temp1,temp2);
             Evento ev= new Evento(cl,true,cl.getLlegada());
             
             agregarOrdenado(ListaEventos,ev);
        }
        
        
       while (ListaEventos.size()>0){
           
           if (ListaEventos.getFirst().getLlegada()==false){
               
               int tiempo;
               int espera;
               
               tiempo= ListaEventos.getFirst().getTiempo();
               espera= tiempo- ListaEventos.getFirst().getCliente().getLlegada();
               suma= suma+espera;
               
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
               
           } else{
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
           promedio= suma/nclientes;     
           System.out.println(promedio);
    }
    
    
    /**
     * 
     * @param lista
     * @param eve 
     */
    public static void agregarOrdenado(SinglyLinkedList lista, Evento eve)
    {
        int j=0;
             Node<Evento> temporal =lista.head;
             while(j<=lista.size()-1 && eve.getTiempo()>temporal.value().getTiempo()){
                 j++;
                 temporal=temporal.next();
             }
             
             lista.add(j, eve);
    }
    
    
    public static void agregarEventoSalida(QueueArray<Cliente> cola, SinglyLinkedList lista, int tiempoLlegadaVentanilla, int nCola){
        
         if (cola.size()>0){
            Evento ev= new Evento(cola.peek(),false,tiempoLlegadaVentanilla+cola.peek().getTransaccion());
            ev.setCola(nCola);
            agregarOrdenado(lista,ev);
         }
    }
}
