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
 * @author UnaiUrtiaga,AdrianFranco
 */
public class ModelFactoryTest {

    /**
     * @return This is the test class for the model factory which tests if the
     * factory class returns null
     */
    @Test
    public void testGetModel() {
        
        ModelFactory mf = new ModelFactory();
        
        assertNotNull(mf);
        
    }
    
}
