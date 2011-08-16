/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadet3;

import junit.framework.TestCase;

/**
 *
 * @author BarriosSazo
 */
public class HojaDeT3Test extends TestCase {
    
    public HojaDeT3Test(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }


    /**
     * Test of insertionSort method, of class HojaDeT3.
     */
    public void testInsertionSort() {
        System.out.println("insertionSort");
        int[] data = null;
        int n = 0;
        HojaDeT3.insertionSort(data, n);
    }

    /**
     * Test of swap method, of class HojaDeT3.
     */
    public void testSwap() {
        System.out.println("swap");
        int[] data =null;
        int i = 0;
        int j = 0;
        HojaDeT3.swap(data, i, j);
    }

    /**
     * Test of quickSort method, of class HojaDeT3.
     */
    public void testQuickSort() {
        System.out.println("quickSort");
        int[] data =null;
        int n =0;
        HojaDeT3.quickSort(data, n);
    }
     /**
     * Second Test of quickSort method, of class HojaDeT3.
     */
    public void testQuickSort2() {
        System.out.println("quickSort");
        int[] data ={5,2,6,3,4};
        int n =5;
        HojaDeT3.quickSort(data, n);
        assertEquals(2, data[0]);
        assertEquals(6,data[4]);
        assertEquals(4,data[2]);
    }
    
     /**
     * Second Test of insertionSort method, of class HojaDeT3.
     */
    public void testInsertionSort2() {
        System.out.println("insertionSort");
        int[] data = {5,2,6,3,4};
        int n = 5;
        HojaDeT3.insertionSort(data, n);
        assertEquals(2, data[0]);
        assertEquals(6,data[4]);
        assertEquals(4,data[2]);
    }
}
