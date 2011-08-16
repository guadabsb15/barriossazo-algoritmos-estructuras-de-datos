/**
 * Se genera un arreglo con n numero de datos enteros random. Luego se usan
 * dos distintos tipos de sorts (Insertion y Quick) para ordenarlos y se mide
 * el tiempo usando profilers de cuanto tarda cada sort en hacerlo.
 * Luego se hace lo mismo solo que para el arreglo con los n datos ya ordenados,
 * para ver las diferencias en los tiempos.
 * Los sorts fueron tomados del libro Java Structures de Duane Bailey
 */
package hojadet3;
import java.util.Random;
/**
 *
 * @author BarriosSazo
 */
public class HojaDeT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nDatos;// numero de datos en el arreglo
        int[] numeros1;// arreglo que se usara con el quick sort
        int[] numeros2;// arreglo que se usara con el insertion sort
        
        nDatos= 100;
        numeros1= new int[nDatos];
        numeros2= new int[nDatos];
        
        Random rand = new Random();
        int temporal;
        
        // se generan los n numeros enteros aleatoriamente y se
        // almacenan de forma identica en los arreglos
        for (int i=0; i<nDatos;i++)
        {   temporal=rand.nextInt();  
            numeros1[i]=temporal;
            numeros2[i]=temporal;
        }
        
        // Se llamara a los sorts la primera vez para ver cuanto tiempo tardan en ordenar datos
        // desordenados. Luego se volveran a llamar ambos sorts para ver cuanto tiempo tardan
        // en ordenar los datos ya ordenados.
       
        quickSort(numeros1,nDatos);
  
        
        
        insertionSort(numeros2,nDatos);
        
      
        
        quickSort(numeros1,nDatos);
        
        
        insertionSort(numeros2,nDatos);
        
    }
    
    
    /**
     * Insertion sort, en el cual se recorre el array y mientras
     * avanza, se inserta en la posicion correcta cada dato
     * 
     * @param data arreglo a ordenar
     * @param n    numero de datos en el arreglo
     */
    public static void insertionSort(int data[], int n)
    {   
        int numSorted = 1; // number of values in place
        int index; // general index
        while (numSorted < n)
        {
            // take the first unsorted value
            int temp = data[numSorted];
            // ...and insert it among the sorted:
            for (index = numSorted; index > 0; index--)
            {
                if (temp < data[index-1])
                {
                    data[index] = data[index-1];
                } else {
                    break;
                }
            }
            // reinsert value
            data[index] = temp;
            numSorted++;
        }
    }
    
    /**
     * Este procedimiento sirve para intercambiar datos en un array
     * @param data   array donde se intercambiaran datos
     * @param i      posicion donde se encuentra el dato
     * @param j      posicion a donde es intercambiado
     */
    public static void swap(int data[], int i, int j)
    {
        int temp;
        if (data!=null){
            temp = data[i];
            data[i] = data[j];
            data[j] = temp;
        }
    }
    
    /**
     * Coloca el dato en la posicion izquierda de forma adecuada (ordenada)
     * @param data
     * @param left
     * @param right
     * @return 
     */
    
    private static int partition(int data[], int left, int right)
    {
        while (true)
        {
            // move right "pointer" toward left
            while (left < right && data[left] < data[right]) right--;
            if (left < right) swap(data,left++,right);
            else return left;
            // move left pointer toward right
            while (left < right && data[left] < data[right]) left++;
            if (left < right) swap(data,left,right--);
            else return right;
        }
    }
    
   /**
     * Este metodo es el llamado por main para realizar el quick sort
     * @param data arreglo a ordenar
     * @param n  numero de datos a ordenar
     */
    public static void quickSort(int data[], int n)
    {
        quickSortRecursive(data,0,n-1);
    }
    
    /**
     * Agarra pivote y ordena poniendo a la derecha los mayores a este
     * y a la izquierda los menores a este y asi hace particiones
     * hasta que todos los datos quedan ordenados
     * @param data
     * @param left
     * @param right 
     */
    private static void quickSortRecursive(int data[],int left,int right)
    {
        int pivot; // the final location of the leftmost value
        if (left >= right) return;
        pivot = partition(data,left,right); /* 1 - place pivot */
        quickSortRecursive(data,left,pivot-1); /* 2 - sort small */
        quickSortRecursive(data,pivot+1,right);/* 3 - sort large */
        /* done! */
    }
    
    
    
}
