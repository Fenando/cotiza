/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Tipo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando
 */
public class TipoDAL {

    /*
    CRUD
    */
    
    public void create(Tipo t){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "insert into tipo (tpo_nombre) values (?)");
            ps.setString(1,t.getNombre());
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(TipoDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(Tipo t){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "update tipo set tpo_nombre=? where id_tpo=?");
            ps.setString(1, t.getNombre());
            ps.setInt(2, t.getId_tipo());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TipoDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public void delete(int id_tpo){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "delete from utipo where id_tpo = ?");
            ps.setInt(1, id_tpo);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TipoDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
  
   }
   public void readAll(){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "select * from tipo");
            ResultSet rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(TipoDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }  
}
