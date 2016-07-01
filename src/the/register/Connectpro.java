/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package the.register;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
class Connectpro {
    Connection con= null;
        public static Connection dbconnect()
                 {
            try
            {
                Class.forName("org.sqlite.JDBC");
                Connection con = DriverManager.getConnection("jdbc:sqlite:E:\\gatekeeper\\the gatekeeper\\registor.sqlite");
                JOptionPane.showMessageDialog(null, "Connection to Database Established");
                
                return con;
            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        return null;
            
    }
}
