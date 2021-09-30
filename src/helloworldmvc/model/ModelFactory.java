/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import java.util.ResourceBundle;

/**
 *
 * @author UnaiUrtiaga,AdrianFranco
 */
public class ModelFactory {
    
    String option;
    ResourceBundle reader;
    
    /**
     * 
     * @return This method returns the model object which says from where
     * to take the greeting
     */
    public Model getModel(){
        
        Model model = null;
        
        reader = ResourceBundle.getBundle("helloworldmvc.controller.data");
        option = reader.getString("MODEL");
        
        if(option.equalsIgnoreCase("file")){
            model = new FileModelImplementation();
        }else if(option.equalsIgnoreCase("database")){
            model = new BDModelImplementation();
        }
        
        return model;
    }
    
}


//Testeable
       