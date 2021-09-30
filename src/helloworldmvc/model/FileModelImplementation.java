/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

/**
 *
 * @author UnaiUrtiaga,AdrianFranco
 */
public class FileModelImplementation implements Model{

    private Connection con;
    private PreparedStatement stat;
    
    /**
     * 
     * @return This method returns the greeting inside a file
     */
    @Override
    public String getGreeting() {
        
        String greeting;
        ResourceBundle reader;
        
        reader = ResourceBundle.getBundle("helloworldmvc.model.Greeting");
        greeting = reader.getString("greet");
        
        return greeting;
    }
    
}

//Testeable