/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo1.radio;

import junit.framework.TestCase;

/**
 *
 * @author BarriosSazo
 */
public class RadioAdapterTest extends TestCase {
    
    public RadioAdapterTest(String testName) {
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
     * Test of onoff method, of class RadioAdapter.
     */
    public void testOnoff() {
        System.out.println("onoff");
        RadioAdapter instance = new RadioAdapter();
        instance.onoff();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of change method, of class RadioAdapter.
     */
    public void testChange() {
        System.out.println("change");
        RadioAdapter instance = new RadioAdapter();
        instance.change();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of avanzar method, of class RadioAdapter.
     */
    public void testAvanzar() {
        System.out.println("avanzar");
        RadioAdapter instance = new RadioAdapter();
        instance.avanzar();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of retroceder method, of class RadioAdapter.
     */
    public void testRetroceder() {
        System.out.println("retroceder");
        RadioAdapter instance = new RadioAdapter();
        instance.retroceder();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class RadioAdapter.
     */
    public void testSave() {
        System.out.println("save");
        int pos = 1;
        RadioAdapter instance = new RadioAdapter();
        instance.save(pos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class RadioAdapter.
     */
    public void testPush() {
        System.out.println("push");
        int pos = 1;
        RadioAdapter instance = new RadioAdapter();
        instance.push(pos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOn method, of class RadioAdapter.
     */
    public void testGetOn() {
        System.out.println("getOn");
        RadioAdapter instance = new RadioAdapter();
        boolean expResult = true;
        boolean result = instance.getOn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmisora method, of class RadioAdapter.
     */
    public void testGetEmisora() {
        System.out.println("getEmisora");
        RadioAdapter instance = new RadioAdapter();
        double expResult = 87.9;
        double result = instance.getEmisora();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getFM method, of class RadioAdapter.
     */
    public void testGetFM() {
        System.out.println("getFM");
        RadioAdapter instance = new RadioAdapter();
        boolean expResult = true;
        boolean result = instance.getFM();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
