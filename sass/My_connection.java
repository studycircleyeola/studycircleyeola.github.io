/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ROHAN
 */
class My_connection {
    
 Connection con;
    
    public Connection getcon(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(My_connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studycricle", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(My_connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
    
    
}
