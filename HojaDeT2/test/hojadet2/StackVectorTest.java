/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadet2;

import junit.framework.TestCase;

/**
 *
 * @author BarriosSazo
 */
public class StackVectorTest extends TestCase {
    
    public StackVectorTest(String testName) {
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
     * Test of push method, of class StackVector.
     */
    public void testPush() {
        System.out.println("push");
        Object item = null;
        StackVector instance = new StackVector();
        instance.push(item);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackVector.
     */
    public void testPop() {
        System.out.println("pop");
        StackVector instance = new StackVector();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of top method, of class StackVector.
     */
    public void testTop() {
        System.out.println("top");
        StackVector instance = new StackVector();
        Object expResult = null;
        Object result = instance.top();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class StackVector.
     */
    public void testSize() {
        System.out.println("size");
        StackVector instance = new StackVector();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class StackVector.
     */
    public void testToString() {
        System.out.println("toString");
        StackVector instance = new StackVector();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
