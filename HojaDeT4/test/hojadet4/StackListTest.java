/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadet4;

import junit.framework.TestCase;

/**
 *
 * @author BarriosSazo
 */
public class StackListTest extends TestCase {
    
    public StackListTest(String testName) {
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
     * Test of push method, of class StackList.
     */
    public void testPush() {
        System.out.println("push");
        Object item = null;
        StackList instance = new StackList();
        instance.push(item);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.top(),item);
    }

     public void testPush2() {
        System.out.println("push");
        Object item = 5;
        StackList instance = new StackList();
        instance.push(item);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.top(),item);
    }
     
    /**
     * Test of pop method, of class StackList.
     */
    public void testPop() {
        System.out.println("pop");
        StackList instance = new StackList();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

     /**
     * Test of pop method, of class StackList.
     */
    public void testPop2() {
        System.out.println("pop");
        StackList instance = new StackList();
        Object expResult = 4;
        instance.push(1);
        instance.push(10);
        instance.push(4);
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    /**
     * Test of top method, of class StackList.
     */
    public void testTop() {
        System.out.println("top");
        StackList instance = new StackList();
        Object expResult = null;
        Object result = instance.top();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
        /**
     * Test of top method, of class StackList.
     */
    public void testTop2() {
        System.out.println("pop");
        StackList instance = new StackList();
        Object expResult = 4;
        instance.push(1);
        instance.push(10);
        instance.push(4);
        Object result = instance.top();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of size method, of class StackList.
     */
    public void testSize() {
        System.out.println("size");
        StackList instance = new StackList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    
     /**
     * Test of size method, of class StackList.
     */
    public void testSize2() {
        System.out.println("size");
        StackList instance = new StackList();
        int expResult = 3;
        instance.push(1);
        instance.push(10);
        instance.push(4);
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of toString method, of class StackList.
     */
    public void testToString() {
        System.out.println("toString");
        StackList instance = new StackList();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
