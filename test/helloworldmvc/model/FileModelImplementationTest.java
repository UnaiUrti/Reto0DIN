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
 * @author 2dam
 */
public class FileModelImplementationTest {

    @Test
    public void testGetGreeting() {
        Model model = new FileModelImplementation();
        
        String greet = "HOLA MUNDO!";
        
        assertEquals(greet, model.getGreeting());
        
        
        
    }
    
}
