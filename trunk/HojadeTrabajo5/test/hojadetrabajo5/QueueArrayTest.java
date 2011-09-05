/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo5;

import junit.framework.TestCase;

/**
 *
 * @author BarriosSazo
 */
public class QueueArrayTest extends TestCase {
    
    public QueueArrayTest(String testName) {
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
     * Test of offer method, of class QueueArray.
     */
    public void testOffer() {
        System.out.println("offer");
        Object value = 4;
        QueueArray instance = new QueueArray(5);//crea cola que puede tener 5 elementos
        boolean expResult = true;
        boolean result = instance.offer(value);
        assertEquals(expResult, result);
        assertEquals(4, instance.peek());
      
    }

    /**
     * Test of poll method, of class QueueArray.
     */
    public void testPoll() {
        System.out.println("poll");
        QueueArray instance = new QueueArray(5);//crea cola que puede tener 5 elementos
        instance.add(4);
        instance.add(3);
        instance.add(1);
        Object result = instance.poll();
        Object expResult = 4;
        assertEquals(expResult, result);
        assertEquals(3, instance.peek());
    }

    /**
     * Test of peek method, of class QueueArray.
     */
    public void testPeek() {
        System.out.println("peek");
        QueueArray instance = new QueueArray(5);//crea cola que puede tener 5 elementos
        instance.add(4);
        instance.add(3);
        instance.add(1);
        Object expResult = 4;
        Object result = instance.peek();
        assertEquals(expResult, result);
        
    }
    
    
         /**
     * Test of size method, of class QueueList.
     */
    public void testSize() {
        System.out.println("size");
        QueueArray instance = new QueueArray(5);
        instance.add(4);
        instance.add(3);
        instance.add(1);
        Object expResult = 3;
        Object result = instance.size();
        assertEquals(expResult, result);
    }
}
