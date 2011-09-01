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
public class QueueListTest extends TestCase {
    
    public QueueListTest(String testName) {
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
     * Test of offer method, of class QueueList.
     */
    public void testOffer() {
        System.out.println("offer");
        Object value = 5;
        QueueList instance = new QueueList();
        boolean expResult = true;
        boolean result = instance.offer(value);
        assertEquals(expResult, result);
        assertEquals(5, instance.peek());
    }

    /**
     * Test of poll method, of class QueueList.
     */
    public void testPoll() {
        System.out.println("poll");
        QueueList instance = new QueueList();
        instance.add(4);
        instance.add(3);
        instance.add(1);
        Object expResult = 4;
        Object result = instance.poll();
        assertEquals(expResult, result);
        assertEquals(3, instance.peek());
    }

    /**
     * Test of peek method, of class QueueList.
     */
    public void testPeek() {
        System.out.println("peek");
        QueueList instance = new QueueList();
        instance.add(4);
        instance.add(3);
        instance.add(1);
        Object expResult = 4;
        Object result = instance.peek();
        assertEquals(expResult, result);
       
    }
}
