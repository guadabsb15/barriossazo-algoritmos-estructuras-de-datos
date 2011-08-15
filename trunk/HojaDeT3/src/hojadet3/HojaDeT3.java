/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadet3;

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
        
        int[] numeros1;
        int[] numeros2;
        numeros1= new int[5];
        numeros2= new int[5];
        numeros1[0]=5;
        numeros1[1]=3;
        numeros1[2]=1;
        numeros1[3]=4;
        numeros1[4]=2;
        
        numeros2[0]=5;
        numeros2[1]=3;
        numeros2[2]=1;
        numeros2[3]=4;
        numeros2[4]=2;
        
        quickSort(numeros1,5);
        insertionSort(numeros2,5);
        
        for (int i=0;i<5;i++)
        {
            System.out.println(numeros1[i]);
            System.out.println(numeros2[i]);
        }
    }
    
    public static void insertionSort(int data[], int n)
    // pre: 0 <= n <= data.length
    // post: values in data[0..n-1] are in ascending order
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
    
    public static void swap(int data[], int i, int j)
    // pre: 0 <= i,j < data.length
    // post: data[i] and data[j] are exchanged
    {
        int temp;
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
    
    private static int partition(int data[], int left, int right)
    // pre: left <= right
    // post: data[left] placed in the correct (returned) location
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
    
    public static void quickSort(int data[], int n)
    // post: the values in data[0..n-1] are in ascending order
    {
        quickSortRecursive(data,0,n-1);
    }
    
    private static void quickSortRecursive(int data[],int left,int right)
    // pre: left <= right
    // post: data[left..right] in ascending order
    {
        int pivot; // the final location of the leftmost value
        if (left >= right) return;
        pivot = partition(data,left,right); /* 1 - place pivot */
        quickSortRecursive(data,left,pivot-1); /* 2 - sort small */
        quickSortRecursive(data,pivot+1,right);/* 3 - sort large */
        /* done! */
    }
    
    
    
}
