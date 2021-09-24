/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author 2dam
 */
public class FileModelImplementationTest {

    @Test
    public void testGetGreeting() {
        FileModelImplementation model = new FileModelImplementation();
        
        String greet = "HOLA MUNDO!";
        
        String greetM = model.getGreeting();
        
        assertEquals(model.getGreeting(), greet);
        
    }
    
    @Test
    @Ignore
    public void testSameOrEqual() {
        Long long1 = new Long(99l);
        Long long2 = new Long(99l);
        
        //long1 = long2;
        
        assertEquals("The two objects are not equal!!!", long1, long2);
        assertSame("The two objets are not the same!!!", long1, long2);
        
    }
    
}
