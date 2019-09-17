/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import static java.time.Instant.now;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import servicios.Fachada;
/**
 *
 * @author user
 */
public class PersonalDAO {
    
     public int borrarPersonal(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM staff WHERE staff_id = ? ";
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
     
     public int grabarPersonal(Personal p){
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        
         try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO staff values (?,?,?,?,?,?,?,?,?,?,?)";
            pstm = con.prepareStatement(sql);
            
             File file = p.getFoto();
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(file);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "\nError :" + ex.getMessage());                
            }
            
            
            pstm.setInt(1, p.getID());
            pstm.setString(2, p.getNombre());
            pstm.setString(3,p.getApellido());
            pstm.setInt(4,p.getDireccionID());
            pstm.setString(5,p.getEmail());
            pstm.setInt(6,p.getTiendaID());
            pstm.setBoolean(7,p.getActivado());
            pstm.setString(8,p.getNombreUsuario());
            pstm.setString(9,p.getContraseña());
            pstm.setTimestamp(10, new Timestamp(1,1,1,1,1,1,1));
            pstm.setBinaryStream(11, fis, (int)file.length());
                       
            
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
     
    public ArrayList<Personal> listadoPersonal(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Personal> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
            if(codigo.equalsIgnoreCase("0")){
                sql = "SELECT * FROM staff  ORDER BY staff_id";            
            }else{
                sql = "SELECT * FROM staff WHERE staff_id="+codigo;     
            }                        
            pstm = con.prepareStatement(sql);
            
            /*if(codigo != "0"){
                pstm.setString(1, codigo);
            }*/
            
            rs = pstm.executeQuery();
                        
            while(rs.next()){
                Personal personal = new Personal();
                personal.setID(rs.getInt("staff_id"));
                personal.setNombre(rs.getString("first_name"));               
                personal.setApellido(rs.getString("last_name"));
                personal.setDireccionID(rs.getInt("address_id"));
                personal.setEmail(rs.getString("email"));
                personal.setTiendaID(rs.getInt("store_id"));
                personal.setActivado(rs.getBoolean("active"));
                personal.setNombreUsuario(rs.getString(("username")));
                personal.setContraseña(rs.getString("password"));
                
                
                //
                //
                //
                               
                listado.add(personal);
                
            }
            System.out.println(listado.size());
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
    
    public int modificarPersonal(Personal p){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE staff " +
                         "SET first_name = ?, last_name = ?, address_id = ?,"
                    + "email=?,store_id=?,active=?,username=?,password=? "
                    +    "WHERE staff_id=?";
            pstm = con.prepareStatement(sql);            
            pstm.setString(1, p.getNombre());
            pstm.setString(2, p.getApellido());
            pstm.setInt(3, p.getDireccionID());
            pstm.setString(4, p.getEmail());
            pstm.setInt(5,p.getTiendaID());
            pstm.setBoolean(6,p.getActivado());
            pstm.setString(7,p.getNombreUsuario());
            pstm.setString(8,p.getContraseña());
            pstm.setInt(9,p.getID());
            
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
