/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo1.radio;

/**
 *
 * @author BarriosSazo
 */
public class RadioAdapter implements Radio {
    
   private boolean isFm;
   private double estacionFm;
   private double estacionAm;
   private boolean isOn;
   private double incrementoFm;
   private double incrementoAm;
   private double mayorFm;
   private double mayorAm;
   private double menorFm;
   private double menorAm;
   private double[] estacionesGuardadas; 
   private boolean[] sonFm;

           
   

    public RadioAdapter()
    {
        int i;
        
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
        
        for (i= 0; i< 12; i++){
            estacionesGuardadas[i]=87.9;
            sonFm[i]=true;
        }
    }
    
    /**
     *
     * @see toggle on-off
     */ 
    @Override
   public void onoff() 
   {
      isOn= !isOn; 
   }
   
    @Override
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
   
    @Override
   public void retroceder()
   {
        if (isFm) {     
           retrocederFm();
      } else {
           retrocederAm();
      }  
   }
   
    @Override
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
   
    @Override
   public boolean getOn()     // devuelve si está encendido o pagado
   {
       return isOn;  
   }
    @Override
   public double getEmisora() // devuelve la emisora
   {
      if (isFm) {
        return estacionFm;
      } else {
        return estacionAm;
      }
   }
   
    @Override
   public boolean getFM()
   {
       return isFm;
   }
}
