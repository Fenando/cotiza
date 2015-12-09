/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando
 */
public class TipoDAL1 {

    /*
    CRUD
    */
    
    public void create(){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "insert usuarios (usr_nombre,usr_apellido,usr_rut) values (?,?,?)");
        } catch (SQLException ex) {
            Logger.getLogger(TipoDAL1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "update usuarios set usr_nombre=?,usr_apellido where usr_rut=?");
        } catch (SQLException ex) {
            Logger.getLogger(TipoDAL1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public void delete(){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "delete from usuarios where usr_rut = ?");
        } catch (SQLException ex) {
            Logger.getLogger(TipoDAL1.class.getName()).log(Level.SEVERE, null, ex);
        }
  
   }
   public void readAll(){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "select * from usuarios");
        } catch (SQLException ex) {
            Logger.getLogger(TipoDAL1.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }  
}
