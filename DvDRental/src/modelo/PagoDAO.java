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
    
    public int borrarCliente(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM customer WHERE customer_id = ? ";
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
    
    
    public int grabarCliente(Cliente c){
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        
         try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO customer values (?,?,?,?,?,?,?)";
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, c.getID());
            pstm.setInt(2, c.getTiendaID());
            pstm.setString(3,c.getNombre());
            pstm.setString(4,c.getApellido());
            pstm.setString(5,c.getEmail());
            pstm.setInt(6,c.getDireccionID());
            pstm.setBoolean(7,c.getActivado());
            
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
    
   
    
    public ArrayList<Cliente> listadoClientes(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Cliente> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
            if(codigo.equalsIgnoreCase("0")){
                sql = "SELECT * FROM customer  ORDER BY customer_id";            
            }else{
                sql = "SELECT * FROM customer  WHERE customer_id="+codigo;     
            }                        
            pstm = con.prepareStatement(sql);
            
            /*if(codigo != "0"){
                pstm.setString(1, codigo);
            }*/
            
            rs = pstm.executeQuery();
                        
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setID(rs.getInt("customer_id"));                
                cliente.setTiendaID(rs.getInt("store_id"));               
                cliente.setNombre(rs.getString("first_name"));
                cliente.setApellido(rs.getString("last_name"));
                cliente.setEmail(rs.getString("email"));
                cliente.setDireccionID(rs.getInt("address_id"));
                cliente.setActivado(rs.getBoolean("activebool"));
                /*
                cliente.setTamaño(rs.getInt(("length")));
                cliente.setCosto(rs.getDouble("replacement_cost"));
                cliente.setRating(rs.getString("rating"));
                cliente.setEspecial(rs.getString("special_features"));
                cliente.setFulltex(rs.getString("fulltext"));*/
                //
                //
                //
                               
                listado.add(cliente);
                
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
    
    public int modificarCliente(Cliente c){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE customer " +
                         "SET store_id = ?, first_name = ?, last_name = ?,"
                    + "email=?,address_id=?,activebool=? "
                    +    "WHERE customer_id=?";
            pstm = con.prepareStatement(sql);            
            pstm.setInt(1, c.getTiendaID());
            pstm.setString(2, c.getNombre());
            pstm.setString(3, c.getApellido());
            pstm.setString(4, c.getEmail());
            pstm.setInt(5,c.getDireccionID());
            pstm.setBoolean(6,c.getActivado());
           
            pstm.setInt(79,c.getID());
            
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
