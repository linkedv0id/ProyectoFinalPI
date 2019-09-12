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
public class DireccionDAO {
    
     public int borrarDireccion(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM address WHERE address_id = ? ";
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
     
     public int grabarDireccion(Direccion d){
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        
         try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO address values (?,?,?,?,?,?,?)";
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, d.getID());
            pstm.setString(2, d.getDireccion());
            pstm.setString(3,d.getDireccion2());
            pstm.setString(4,d.getDistrito());
            pstm.setInt(5,d.getCiudadID());
            pstm.setString(6,d.getCodigoPostal());
            pstm.setString(7,d.getTelefono());
             
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
     
     public ArrayList<Direccion> listadoDirecciones(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Direccion> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
            if(codigo.equalsIgnoreCase("0")){
                sql = "SELECT * FROM address  ORDER BY address_id";            
            }else{
                sql = "SELECT * FROM address  WHERE address_id="+codigo;     
            }                        
            pstm = con.prepareStatement(sql);
            
            /*if(codigo != "0"){
                pstm.setString(1, codigo);
            }*/
            
            rs = pstm.executeQuery();
                        
            while(rs.next()){
                Direccion direccion=new Direccion();
                direccion.setID(rs.getInt("address_id"));                
                direccion.setDireccion(rs.getString("address"));   
                direccion.setDireccion2(rs.getString("address2"));
                direccion.setDistrito(rs.getString("district"));
                direccion.setCiudadID(rs.getInt("city_id"));
                direccion.setCodigoPostal(rs.getString("postal_code"));
                direccion.setTelefono(rs.getString("phone"));
                //
                //
                //
                               
                listado.add(direccion);
                
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
    
     public int modificarDireccion(Direccion d){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE address " +
                         "SET address = ?, address2 = ?, district = ?,"
                    + "city_id=?,postal_code=?,phone=? "
                    +    "WHERE address_id=?";
            pstm = con.prepareStatement(sql);            
            pstm.setString(1, d.getDireccion());
            pstm.setString(2, d.getDireccion2());
            pstm.setString(3,d.getDistrito());
            pstm.setInt(4,d.getCiudadID());
            pstm.setString(5,d.getCodigoPostal());
            pstm.setString(6,d.getTelefono());
            pstm.setInt(7,d.getID());
            
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
    
    
}
