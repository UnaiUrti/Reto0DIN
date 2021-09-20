/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

/**
 *
 * @author Unai,Adrian
 */
public class ModelFactory {
    
    public Model getModel(){
    
        FileModelImplementation model = new FileModelImplementation();
        
        return model;
    }
    
}
