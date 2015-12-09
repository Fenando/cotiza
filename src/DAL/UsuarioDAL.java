/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando
 */
public class UsuarioDAL {

    /*
    CRUD
    */
    
    public void create(Usuario u){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "insert into usuarios (usr_nombre,usr_apellido,usr_rut) values (?,?,?)");
            ps.setString(1,u.getNombre());
            ps.setString(2,u.getApellido());
            ps.setInt(3,u.getRut());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(Usuario u){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "update usuarios set usr_nombre=?,usr_apellido where usr_rut=?");
            ps.setString(1,u.getNombre());
            ps.setString(2,u.getApellido());
            ps.setInt(3,u.getRut());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public void delete(int rut){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "delete from usuarios where usr_rut = ?");
            ps.setInt(1, rut);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
  
   }
   public void readAll(){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "select * from usuarios");
            ResultSet rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }  
}
