/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Cotizacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando
 */
public class CotizacionDAL {

    /*
    CRUD
    */
    
    public void create(Cotizacion c){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "insert into cotizaciones (ctz_nombre) values (?)");
            ps.setString(1, c.getNombre());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CotizacionDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(Cotizacion c){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "update cotizaciones set ctz_nombre=? where id_ctz=?");
            ps.setString(1,c.getNombre());
            ps.setInt(2, c.getId_ctz());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CotizacionDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public void delete(int id_ctz){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "delete from cotizaciones where usr_rut = ?");
            ps.setInt(1, id_ctz);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CotizacionDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
  
   }
   public void readAll(){
        try {
            PreparedStatement ps = new Conector().conn.prepareStatement(
                    "select * from usuarios");
            ResultSet rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CotizacionDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
   }  
}
