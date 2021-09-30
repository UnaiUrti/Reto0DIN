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
public interface View {
    /**
     * This is the interface of the view
     * @param greeting The parameter which contains the message
     */
    public void showGreeting(String greeting);
    
}
