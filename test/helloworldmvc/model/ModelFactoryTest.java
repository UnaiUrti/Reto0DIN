/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author 2dam
 */
public class ModelFactoryTest {

    @Test
    public void testGetModel() {
        
        ModelFactory mf = new ModelFactory();
        
        assertNotNull(mf);
        
    }
    
}
