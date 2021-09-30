/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.controller;

import helloworldmvc.model.Model;
import helloworldmvc.view.View;

/**
 *
 * @author UnaiUrtiaga,AdrianFranco
 */
public class Controller {
    /**
     * 
     * @param model The model object
     * @param view The view object
     * This is a node between the View and Model interfaces
     */
    public void run(Model model, View view){
        
        view.showGreeting(model.getGreeting());
        
    }
    
}
