/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadet7;

import junit.framework.TestCase;
import java.util.Date;

/**
 *
 * @author BarriosSazo
 */
public class VectorHeapTest extends TestCase {
    
    public VectorHeapTest(String testName) {
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
     * Test of add method, of class VectorHeap.
     */
    public void testAdd() {
       
        Date date = new Date(1989,8,29);
        System.out.println("add");
        CarneComparator<alumno> porCarne = new CarneComparator<alumno>();
        VectorHeap instance = new VectorHeap(porCarne);
        alumno al1= new alumno(8135,date);
        alumno al2=new alumno(8120,date);
        alumno al3=new alumno(8140,date);
        alumno al4=new alumno(8145,date);
        instance.add(al1);
        instance.add(al2);
        instance.add(al3);
        assertEquals(instance.remove(),al2);
        assertEquals(instance.remove(),al1);
        assertEquals(instance.remove(),al3);
        assertEquals(instance.remove(),al4);
        // TODO review the generated test code and remove the default call to fail.
      
    }



    /**
     * Test of remove method, of class VectorHeap.
     
    public void testRemove() {
        System.out.println("remove");
        VectorHeap instance = new VectorHeap();
        Object expResult = null;
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getFirst method, of class VectorHeap.
    
    public void testGetFirst() {
        System.out.println("getFirst");
        VectorHeap instance = new VectorHeap();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of size method, of class VectorHeap.
   
    public void testSize() {
        System.out.println("size");
        VectorHeap instance = new VectorHeap();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
       */
}
