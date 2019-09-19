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
public class LenguajeDAO {
    
     public ArrayList<Lenguaje> listadoLenguajes(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Lenguaje> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
            if(codigo.equalsIgnoreCase("0")){
                sql = "SELECT * FROM language ORDER BY language_id";            
            }else{
                sql = "SELECT * FROM language where language_id = ? "
                    + "ORDER BY codigo";      
            }                        
            pstm = con.prepareStatement(sql);
            
            if(codigo != "0"){
                pstm.setString(1, codigo);
            }
            
            rs = pstm.executeQuery();
                        
            
            while(rs.next()){
                Lenguaje lenguaje=new Lenguaje();
                lenguaje.setID(rs.getInt("language_id"));
                lenguaje.setNombre(rs.getString("name"));
                //
                //
               
                
                listado.add(lenguaje);
                
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
