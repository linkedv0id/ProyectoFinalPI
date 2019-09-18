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
public class PagoDAO {
    
    public int borrarPago(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM payment WHERE payment_id = ? ";
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
    
    
    public int grabarPago(Pago p){
        
        String [] fecha =p.getFecha().split("/");
        int año=Integer.parseInt(fecha[0])-1900;
        int mes=Integer.parseInt(fecha[1])-1;        
        int dia=Integer.parseInt(fecha[2]);
        
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        
         try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO payment values (?,?,?,?,?,?)";
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, p.getID());
            pstm.setInt(2, p.getClienteID());
            pstm.setInt(3,p.getPersonalID());
            pstm.setInt(4,p.getRentalID());
            pstm.setDouble(5,p.getValor());
            pstm.setTimestamp(6,new Timestamp (año,mes,dia,1,1,1,1));
            
            
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
    
   
    
    public ArrayList<Pago> listadoPagos(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Pago> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
            if(codigo.equalsIgnoreCase("0")){
                sql = "SELECT * FROM payment  ORDER BY payment_id";            
            }else{
                sql = "SELECT * FROM payment  WHERE payment_id="+codigo;     
            }                        
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();
                        
            while(rs.next()){
                Pago pago = new Pago();
                pago.setID(rs.getInt("payment_id"));
                pago.setClienteID(rs.getInt("customer_id"));
                pago.setPersonalID(rs.getInt("staff_id"));
                pago.setValor(rs.getDouble("amount"));
                pago.setFecha(rs.getString("payment_date"));
                pago.setRentalID(rs.getInt("rental_id"));
               
                           
                listado.add(pago);
                
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
    
    
    public int modificarPago(Pago p){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE payment " +
                         "SET customer_id = ?, staff_id = ?,rental_id = ?,"
                    + "amount=? "
                    +    "WHERE payment_id=?";
            pstm = con.prepareStatement(sql);            
            pstm.setInt(1, p.getClienteID());
            pstm.setInt(2, p.getPersonalID());
            pstm.setInt(3, p.getRentalID());
            pstm.setDouble(4, p.getValor());
            
           
            pstm.setInt(5,p.getID());
            
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
