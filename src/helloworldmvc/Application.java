/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc;

import helloworldmvc.controller.Controller;
import helloworldmvc.model.ModelFactory;
import helloworldmvc.view.ViewFactory;

/**
 *
 * @author UnaiUrtiaga,AdrianFranco
 */
public class Application {

    /**
     * @param args the command line arguments
     * This is the main method which starts the whole program
     */
    public static void main(String[] args) {

        ModelFactory model = new ModelFactory();
        ViewFactory view = new ViewFactory();
        Controller control = new Controller();
          
        control.run(model.getModel(), view.getView());
    }
    
}
