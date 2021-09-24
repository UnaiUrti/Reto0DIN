/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import java.util.ResourceBundle;

/**
 *
 * @author Unai,Adrian
 */
public class FileModelImplementation implements Model{

    /**
     * 
     * @return 
     */
    
    @Override
    public String getGreeting() {
        
        String greeting;
        ResourceBundle lector;
        
        lector = ResourceBundle.getBundle("helloworldmvc.model.Greeting");
        greeting = lector.getString("greet");
        
        return greeting;
    }
    
}

//Testeable