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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of quickSort method, of class HojaDeT3.
     */
    public void testQuickSort() {
        System.out.println("quickSort");
        int[] data =null;
        int n =0;
        HojaDeT3.quickSort(data, n);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
