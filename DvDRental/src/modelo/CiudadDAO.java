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
public class CiudadDAO {
    
    public int borrarCiudad(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM city WHERE city_id = ? ";
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
    
    public int grabarCiudad(Ciudad c){
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        
         try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO city values (?,?,?)";
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, c.getID());
            pstm.setString(2, c.getCiudad());            
            pstm.setInt(3,c.getPaisID());
             
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
    
    public ArrayList<Ciudad> listadoCiudades(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Ciudad> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
            if(codigo.equalsIgnoreCase("0")){
                sql = "SELECT * FROM city  ORDER BY city_id";            
            }else{
                sql = "SELECT * FROM city  WHERE city_id="+codigo;     
            }                        
            pstm = con.prepareStatement(sql);
            
            /*if(codigo != "0"){
                pstm.setString(1, codigo);
            }*/
            
            rs = pstm.executeQuery();
                        
            while(rs.next()){
                Ciudad ciudad=new Ciudad();
                ciudad.setID(rs.getInt("city_id"));
                ciudad.setCiudad(rs.getString("city"));
                ciudad.setPaisID(rs.getInt("country_id"));
                                //
                //
                //
                               
                listado.add(ciudad);
                
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
    
     public int modificarCiudad(Ciudad c){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE city " +
                         "SET city = ?, country_id = ? "
                    +    "WHERE city_id=?";
            pstm = con.prepareStatement(sql);            
            pstm.setString(1, c.getCiudad());
            pstm.setInt(2, c.getPaisID());
            pstm.setInt(3,c.getID());            
            
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
