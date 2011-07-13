/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo1.radio;

/**
 *
 * @author BarriosSazo
 */
public class AbstractRadio implements Radio {
    
   boolean isFm;
   double estacionFm;
   double estacionAm;
   boolean isOn;
   double incrementoFm;
   double incrementoAm;
   double mayorFm;
   double mayorAm;
   double menorFm;
   double menorAm;
   double[] estacionesGuardadas; 
   boolean[] sonFm;

           
   
   
    public AbstractRadio()
    {
        isFm = true;
        estacionFm= 87.9;
        estacionAm= 530;
        incrementoFm= 0.2;
        incrementoAm= 10;
        isOn= true;
        mayorFm= 107.9;
        mayorAm= 1610;
        menorFm= 87.9;
        menorAm= 530;
        estacionesGuardadas= new double[12];
        sonFm = new boolean[12];
    }
    
   public void onoff() // toggle on-off
   {
      isOn= !isOn; 
   }
   
   public void change() //toggle ente AM y FM
   {
       isFm= !isFm;
   }
   
   private void avanzarFm()
   {
       if (estacionFm < mayorFm-incrementoFm) {     
        estacionFm= estacionFm + incrementoFm;
      } else {
        estacionFm= menorFm;
      }
   }
         
   private void avanzarAm()
   {
       if (estacionAm < mayorAm-incrementoAm) {     
        estacionAm= estacionAm + incrementoAm;
      } else {
        estacionAm= menorAm;
      }
   }
   
   public void avanzar()
   {
        if (isFm) {     
        avanzarFm();
      } else {
        avanzarAm();
      }
   }
   
   private void retrocederFm()
   {
       if (estacionFm > menorFm+incrementoFm) {     
        estacionFm= estacionFm - incrementoFm;
      } else {
        estacionFm= mayorFm;
      }
   }
         
   private void retrocederAm()
   {
       if (estacionAm > menorAm+incrementoAm) {     
        estacionAm= estacionAm - incrementoAm;
      }else {
        estacionAm= mayorAm;
      }
   }
   
   public void retroceder()
   {
        if (isFm) {     
           retrocederFm();
      } else {
           retrocederAm();
      }  
   }
   
   public void save(int pos)  // Guardar en la memoria[pos] la estacion actual *
   {
       if (isFm) {
        estacionesGuardadas[pos-1]= estacionFm;
        sonFm[pos-1] = true;
      } else {
        estacionesGuardadas[pos-1]= estacionAm;
        sonFm[pos-1] = false;
      }
       
   }
   
   public void push(int pos)  // Cargar la estacion almacenda en la memoria[pos] *
   {
       if (sonFm[pos-1]){
           estacionFm= estacionesGuardadas[pos-1];
           if (isFm == false){ 
               change();
           }
       }else {
           estacionAm= estacionesGuardadas[pos-1];
           if (isFm){ 
               change();
           }
       }
   }
   
   public boolean getOn()     // devuelve si está encendido o pagado
   {
       return isOn;  
   }
   public double getEmisora() // devuelve la emisora
   {
      if (isFm) {
        return estacionFm;
      } else {
        return estacionAm;
      }
   }
   
   public boolean getFM()
   {
       return isFm;
   }
}
