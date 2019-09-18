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
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import servicios.Fachada;
/**
 *
 * @author user
 */
public class RentaDAO {
    
    public int borrarRenta(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM rental WHERE renta_id = ? ";
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
    
    public int grabarRenta(Renta p){
        
        String [] fecha =p.getFecha().split("/");
        int año=Integer.parseInt(fecha[0])-1900;
        int mes=Integer.parseInt(fecha[1])-1;        
        int dia=Integer.parseInt(fecha[2]);
        
        String [] fechaRetorno =p.getFechaRetorno().split("/");
        int año2=Integer.parseInt(fechaRetorno[0])-1900;
        int mes2=Integer.parseInt(fechaRetorno[1])-1;        
        int dia2=Integer.parseInt(fechaRetorno[2]);
        
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        
         try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO rental values (?, ?, ?, ?, ?, ?)";
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, p.getID());
            pstm.setTimestamp(2, new Timestamp(año,mes,dia,1,1,1,1));
            pstm.setInt(3, p.getInventarioID());
            pstm.setInt(4, p.getClienteID());
            pstm.setTimestamp(5, new Timestamp(año2,mes2,dia2,1,1,1,1));
            pstm.setInt(6, p.getPersonalID());
            
            
            
            
            
                         
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
    
    public ArrayList<Renta> listadoRenta(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Renta> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
            if(codigo.equalsIgnoreCase("0")){
                sql = "SELECT * FROM rental  ORDER BY rental_id";            
            }else{
                sql = "SELECT * FROM rental  WHERE rental_id="+codigo;     
            }                        
            pstm = con.prepareStatement(sql);
            
            /*if(codigo != "0"){
                pstm.setString(1, codigo);
            }*/
            
            rs = pstm.executeQuery();
                        
            while(rs.next()){
                Renta renta=new Renta();
                renta.setID(rs.getInt("rental_id"));
                renta.setFecha(rs.getString("rental_date"));
                renta.setInventarioID(rs.getInt("inventory_id"));
                renta.setClienteID(rs.getInt("customer_id"));
                renta.setFechaRetorno(rs.getString("return_date"));
                renta.setPersonalID(rs.getInt("staff_id"));
                
                
                
                listado.add(renta);
                
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
    
    public int modificarRenta(Renta p){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE renta " +
                         "SET renta = (?, ?, ?, ?, ?, ?) "
                    +    "WHERE renta_id=?";
            pstm = con.prepareStatement(sql);            
            //pstm.setString(1, p.getRenta()); //Modify later

            pstm.setInt(1, p.getID());
            pstm.setString(2, p.getFecha());
            pstm.setInt(3, p.getInventarioID());
            pstm.setInt(4, p.getClienteID());
            pstm.setString(5, p.getFechaRetorno());
            pstm.setInt(6, p.getPersonalID());            
            
            pstm.setInt(7,p.getID());
            
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
