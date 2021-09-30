/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author UnaiUrtiaga,AdrianFranco
 */
public class FileModelImplementationTest {

    /**
     * This is the test class which tests if the file implementation
     * works right
     */
    @Test
    public void testGetGreeting() {
        Model model = new FileModelImplementation();
        
        String greet = "HELLO WORLD!";
        
        assertEquals(greet, model.getGreeting());
        
        
        
    }
    
}
