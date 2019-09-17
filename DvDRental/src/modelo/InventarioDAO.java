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
 * @author invitado
 */
public class InventarioDAO {
    
    
    public ArrayList<Inventario> listadoInventario(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Inventario> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
            if(codigo.equalsIgnoreCase("0")){
                sql = "SELECT * FROM inventory ORDER BY inventory_id";            
            }else{
                sql = "SELECT * FROM inventory where inventory_id = ? "
                    + "ORDER BY codigo";      
            }                        
            pstm = con.prepareStatement(sql);
            
            if(codigo != "0"){
                pstm.setString(1, codigo);
            }
            
            rs = pstm.executeQuery();
                        
            
            while(rs.next()){
                Inventario inventario = new Inventario();
                inventario.setID(rs.getInt("inventory_id"));
                inventario.setPeliculaID(rs.getInt("film_id"));
                inventario.setTiendaID(rs.getInt("store_id"));
                //
                //
               
                
                listado.add(inventario);
                
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
    
}
