/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        String greeting = null;
        
        FileReader fr;
        BufferedReader br;
    
        try {
            fr = new FileReader("Greeting");
            br = new BufferedReader(fr);
            
            greeting = br.readLine();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return greeting;
    }
    
}
