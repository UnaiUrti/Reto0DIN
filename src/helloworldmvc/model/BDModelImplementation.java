/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author Unai, Adrian
 */
public class BDModelImplementation implements Model{
    
    private Connection con;
    private PreparedStatement stat;
    private ResourceBundle configFile;
    private String url, user, pass;
    
    private final String showGreeting = "SELECT * FROM greeting";
    
    public BDModelImplementation() {
        
        configFile = ResourceBundle.getBundle("helloworldmvc.controller.config");
        url = configFile.getString("Conn");
        user = configFile.getString("DBUser");
        pass = configFile.getString("DBPass");
        
    }
    
    public Connection openConnection() throws ConnectException {
        
        Connection con = null;
        
        try {
            con = DriverManager.getConnection(url,user,pass);
        } catch (SQLException ex) {
            throw new ConnectException("Error al conectar con la base de datos");
        }
        
        return con;
        
    }
    
    public void closeConnection(PreparedStatement stat, Connection con) throws ConnectException {
        
        if (stat != null || con != null) {
            try {
                stat.close();
                con.close();
            } catch (SQLException ex) {
                throw new ConnectException("Error al cerrar con la base de datos"); 
            }
        }
        
        
    }
    
    @Override
    public String getGreeting(){
    
        String greeting=null;
        ResultSet rs=null;
        try {
            con= this.openConnection();
        } catch (ConnectException ex) {
            System.out.println("No se ha podido conectar con la base de datos");
        }
           
        try {
           
            stat= con.prepareStatement(showGreeting);
           
            rs = stat.executeQuery();
           
            while(rs.next()){
                greeting = rs.getString("helloworld");
            }
        } catch (Exception ex) {
            System.out.println("No se ha podido recoger el saludo");
        }
        try {
            this.closeConnection(stat, con);
        } catch (ConnectException ex) {
            System.out.println("No se ha podido cerrar la base de datos");
        }
        if(rs != null){
            try {
                rs.close();
            } catch (Exception ex) {
                System.out.println("No se ha podido cerrar la conexión base de datos");
            }
        }
       
        
        return greeting;
    }
    
}
