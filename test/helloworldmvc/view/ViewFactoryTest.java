/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author UnaiUrtiaga,AdrianFranco
 */
public class ViewFactoryTest {

    /**
     * This is the test class for the view factory which tests if the
     * factory class returns null
     */
    @Test
    public void testSomeMethod() {
        
        ViewFactory vf = new ViewFactory();
        
        assertNotNull(vf);
        
    }
    
}
