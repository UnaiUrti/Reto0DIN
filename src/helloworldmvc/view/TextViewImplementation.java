/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.view;

/**
 *
 * @author UnaiUrtiaga,AdrianFranco
 */
public class TextViewImplementation implements View{

    /**
     * This method shows the greeting in the console
     * @param greeting The parameter which contains the message
     */
    @Override
    public void showGreeting(String greeting) {
        
        System.out.println(greeting);
        
    }
    
}
