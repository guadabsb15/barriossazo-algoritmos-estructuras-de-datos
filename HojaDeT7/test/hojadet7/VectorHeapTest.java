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
     * Usando compoarator de numero de carne
     */
    public void testAdd1() {
       
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
        instance.add(al4);
        assertEquals(instance.getFirst(),al2);
        instance.remove();
        assertEquals(instance.getFirst(),al1);
        instance.remove();
        assertEquals(instance.getFirst(),al3);
        instance.remove();
        assertEquals(instance.getFirst(),al4);
        instance.remove();
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
    /**
     * Test of add method, of class VectorHeap.
     * Usando comparator de fecha
     */
    public void testAdd2() {
       
        Date date1 = new Date(1989,8,29);
        Date date2 = new Date(1987,8,29);
        Date date3 = new Date(1990,8,29);
        Date date4 = new Date(1993,8,29);
        
        System.out.println("add");
        dateComparator<alumno> porFecha = new dateComparator<alumno>();
        VectorHeap instance = new VectorHeap(porFecha);
        alumno al1= new alumno(8135,date1);
        alumno al2=new alumno(8120,date2);
        alumno al3=new alumno(8140,date3);
        alumno al4=new alumno(8145,date4);
        instance.add(al1);
        instance.add(al2);
        instance.add(al3);
        instance.add(al4);
        assertEquals(instance.getFirst(),al2);
        instance.remove();
        assertEquals(instance.getFirst(),al1);
        instance.remove();
        assertEquals(instance.getFirst(),al3);
        instance.remove();
        assertEquals(instance.getFirst(),al4);
        // TODO review the generated test code and remove the default call to fail.
      
    }


    /**
     * Test of remove method, of class VectorHeap.
     * usando comparator de numero de carne
    */ 
    public void testRemove1() {
        System.out.println("remove");
        Date date = new Date(1989,8,29);
        CarneComparator<alumno> porCarne = new CarneComparator<alumno>();
        VectorHeap instance = new VectorHeap(porCarne);
        alumno al1= new alumno(8135,date);
        alumno al2=new alumno(8120,date);
        alumno al3=new alumno(8140,date);
        alumno al4=new alumno(8145,date);
        instance.add(al1);
        instance.add(al2);
        instance.add(al3);
        instance.add(al4);
        assertEquals(instance.remove(),al2);
     
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
    /**
     *Test of remove method, of class VectorHeap.
     * usando comparator de fecha
     */
    public void testRemove2() {
       
        Date date1 = new Date(1989,8,29);
        Date date2 = new Date(1987,8,29);
        Date date3 = new Date(1990,8,29);
        Date date4 = new Date(1993,8,29);
        
        System.out.println("remove");
        dateComparator<alumno> porFecha = new dateComparator<alumno>();
        VectorHeap instance = new VectorHeap(porFecha);
        alumno al1= new alumno(8135,date1);
        alumno al2=new alumno(8120,date2);
        alumno al3=new alumno(8140,date3);
        alumno al4=new alumno(8145,date4);
        instance.add(al1);
        instance.add(al2);
        instance.add(al3);
        instance.add(al4);
        assertEquals(instance.remove(),al2);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
    /**
     * Test of getFirst method, of class VectorHeap.
    */
    public void testGetFirst1() {
        Date date = new Date(1989,8,29);
        System.out.println("getFirst");
        CarneComparator<alumno> porCarne = new CarneComparator<alumno>();
        VectorHeap instance = new VectorHeap(porCarne);
        alumno al1= new alumno(8135,date);
        alumno al2=new alumno(8120,date);
        instance.add(al1);
        instance.add(al2);
        assertEquals(instance.getFirst(),al2);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
     /**
     * Test of getFirst method, of class VectorHeap.
    */
    public void testGetFirst2() {
        Date date1 = new Date(1989,8,29);
        Date date2 = new Date(1987,8,29);
        
        System.out.println("getFirst");
        dateComparator<alumno> porFecha = new dateComparator<alumno>();
        VectorHeap instance = new VectorHeap(porFecha);
        alumno al1= new alumno(8135,date1);
        alumno al2=new alumno(8120,date2);
        
        instance.add(al1);
        instance.add(al2);
        assertEquals(instance.getFirst(),al2);
        
    }

    /**
     * Test of size method, of class VectorHeap.
    */
    public void testSize() {
        System.out.println("size");
        Date date = new Date(1989,8,29);
       
        CarneComparator<alumno> porCarne = new CarneComparator<alumno>();
        VectorHeap instance = new VectorHeap(porCarne);
        alumno al1= new alumno(8135,date);
        alumno al2=new alumno(8120,date);
        alumno al3=new alumno(8140,date);
        alumno al4=new alumno(8145,date);
        instance.add(al1);
        instance.add(al2);
        instance.add(al3);
        instance.add(al4);
        int expResult = 4;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
       
}
