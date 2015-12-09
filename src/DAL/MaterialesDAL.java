/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Material;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando
 */
public class MaterialesDAL {

    /*
    CRUD
    */
    
    public void create(Material m){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "insert into materiales (mte_id_tipo,mte_nombre,mte_costo) values (?,?,?)");
                    ps.setInt(1, m.getIdTipo());
                    ps.setString(2, m.getNombre());
                    ps.setInt(3,m.getCosto());
                    ps.executeUpdate();
                    
        } catch (SQLException ex) {
            Logger.getLogger(MaterialesDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(Material m){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "update materiales set mte_id_tipo=? , "
                            + "mte_nombre=? , "
                            + "mte_costo = ? "
                            + "where id_mte = ? ");
            ps.setInt(1, m.getIdTipo());
            ps.setString(2, m.getNombre());
            ps.setInt(3, m.getCosto());
            ps.setInt(4, m.getIdMaterial());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MaterialesDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public void delete(int idM){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "delete from materiales where id_mte = ?");
            ps.setInt(1, idM);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MaterialesDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
  
   }
   public void readAll(){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "select * from materiales");
        } catch (SQLException ex) {
            Logger.getLogger(MaterialesDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }  
}
