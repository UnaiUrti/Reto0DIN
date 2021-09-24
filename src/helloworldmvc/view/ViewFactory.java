/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.view;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ViewFactory {
    
    String option;
    ResourceBundle reader;
    
    public View getView(){
    
        View view = null;
        
        reader = ResourceBundle.getBundle("helloworldmvc.controller.config");
        option = reader.getString("VIEW");
        
        if(option.equalsIgnoreCase("text")){
            view = new TextViewImplementation();
        }else if(option.equalsIgnoreCase("swing")){
            view = new SwingViewImplementation();
        }
        
        return view;
    }
    
}
