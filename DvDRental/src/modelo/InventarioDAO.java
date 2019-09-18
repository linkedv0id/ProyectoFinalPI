/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import servicios.Fachada;

/**
 *
 * @author user
 */
public class InventarioDAO {
    
    public int borrarInventario(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM inventory WHERE inventory_id = ? ";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1,Integer.parseInt(codigo));
            rtdo = pstm.executeUpdate(); 
            return rtdo;
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
        } 
        finally{
            try{
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return rtdo;
    }
    
    public int grabarInventario(Inventario i){
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        
         try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO inventory values (?,?,?)";
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, i.getID());
            pstm.setInt(2, i.getPeliculaID());            
            pstm.setInt(3,i.getTiendaID());
             
            rtdo = pstm.executeUpdate();  
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        finally{
            try{
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return rtdo;
    }
    
    public ArrayList<Inventario> listadoInventarios(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Inventario> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
            if(codigo.equalsIgnoreCase("0")){
                sql = "SELECT * FROM inventory  ORDER BY inventory_id";            
            }else{
                sql = "SELECT * FROM inventory  WHERE inventory_id="+codigo;     
            }                        
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();
                        
            while(rs.next()){
                Inventario inventario = new Inventario();
                
                inventario.setID(rs.getInt("inventory_id"));
                inventario.setPeliculaID(rs.getInt("film_id"));
                inventario.setTiendaID(rs.getInt("store_id"));
                inventario.setDisponible(rs.getString("disponible"));
                              
                           
                listado.add(inventario);
                
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        finally{
            try{
                if(rs!=null) rs.close();
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return listado;
    }
    
    public int modificarInventario(Inventario i){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE inventory " +
                         "SET film_id = ?, store_id = ?,disponible=? "
                    +    "WHERE inventory_id=?";
            pstm = con.prepareStatement(sql);            
            pstm.setInt(1, i.getPeliculaID());
            pstm.setInt(2, i.getTiendaID());
            pstm.setString(3, i.getDisponible());
            pstm.setInt(4,i.getID());            
            
            rtdo = pstm.executeUpdate();  
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        finally{
            try{
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return rtdo;
    }
    
    public ArrayList<Inventario> listadoInventariosTiendas(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Inventario> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
            if(codigo.equalsIgnoreCase("0")){
                sql = "SELECT * FROM inventory  ORDER BY inventory_id";            
            }else{
                sql = "SELECT * FROM inventory  WHERE store_id="+codigo;     
            }                        
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();
                        
            while(rs.next()){
                Inventario inventario = new Inventario();
                
                inventario.setID(rs.getInt("inventory_id"));
                inventario.setPeliculaID(rs.getInt("film_id"));
                inventario.setTiendaID(rs.getInt("store_id"));
                inventario.setDisponible(rs.getString("disponible"));              
                           
                listado.add(inventario);
                
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        finally{
            try{
                if(rs!=null) rs.close();
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return listado;
    }
    
    
}
