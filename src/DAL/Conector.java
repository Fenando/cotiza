package DAL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fernando
 */
public class Conector {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fernando
 */

    Connection conn;

    public Conector() {
    this.getConn();
    
    }

    public void getConn(){
        try {
           
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cotizav10",
                    "postgres", "123");
         this.createt();
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
 
    
    public void createt(){
        try {
            conn.createStatement().executeUpdate("insert into cotizaciones (ctz_nombre)values('hola mundo')");
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public static void main(String[] args) {
        new Conector();
    }
}

