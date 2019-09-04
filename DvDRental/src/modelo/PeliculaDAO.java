/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
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
public class PeliculaDAO {  
     
    
    public int borrarPelicula(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM film WHERE film_id = ? ";
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
    
    
    public int grabarPelicula(Pelicula p){
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        
         try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO film values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, p.getID());
            pstm.setString(2, p.getTitulo());
            pstm.setString(3,p.getDescripcion());
            pstm.setInt(4,p.getAño());
            pstm.setInt(5,p.getLenguaje());
            pstm.setInt(6,p.getDuracionRenta());
            pstm.setDouble(7,p.getTasa());
            pstm.setInt(8,p.getTamaño());
            pstm.setDouble(9,p.getCosto());
            pstm.setObject(10, null);
            pstm.setTimestamp(11, new Timestamp(1,1,1,1,1,1,1));
            pstm.setObject(12,null);
            pstm.setObject(13,null);
            
            
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
    
   
    
    public ArrayList<Pelicula> listadoCategoriasPeli(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Pelicula> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
            if(codigo.equalsIgnoreCase("0")){
                sql = "SELECT * FROM film  ORDER BY film_id";            
            }else{
                sql = "SELECT * FROM film INNER JOIN film_category ON film.film_id=film_category.film_id WHERE category_id="+codigo;     
            }                        
            pstm = con.prepareStatement(sql);
            
            /*if(codigo != "0"){
                pstm.setString(1, codigo);
            }*/
            
            rs = pstm.executeQuery();
                        
            while(rs.next()){
                Pelicula pelicula = new Pelicula();
                pelicula.setID(rs.getInt("film_id"));
                pelicula.setTitulo(rs.getString("title"));               
                pelicula.setDescripcion(rs.getString("description"));
                pelicula.setAño(rs.getInt("release_year"));
                pelicula.setLenguaje(rs.getInt("language_id"));
                pelicula.setDuracionRenta(rs.getInt("rental_duration"));
                pelicula.setTasa(rs.getDouble("rental_rate"));
                pelicula.setTamaño(rs.getInt(("length")));
                pelicula.setCosto(rs.getDouble("replacement_cost"));
                pelicula.setRating(rs.getString("rating"));
                pelicula.setEspecial(rs.getString("special_features"));
                pelicula.setFulltex(rs.getString("fulltext"));
                //
                //
                //
                               
                listado.add(pelicula);
                
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
    
    public int modificarPelicula(Pelicula p){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE film " +
                         "SET title = ?, description = ?, release_year = ?,"
                    + "language_id=?,rental_duration=?,rental_rate=?,length=?,replacement_cost=? "
                    +    "WHERE film_id=?";
            pstm = con.prepareStatement(sql);            
            pstm.setString(1, p.getTitulo());
            pstm.setString(2, p.getDescripcion());
            pstm.setInt(3, p.getAño());
            pstm.setInt(4, p.getLenguaje());
            pstm.setInt(5,p.getDuracionRenta());
            pstm.setDouble(6,p.getTasa());
            pstm.setInt(7,p.getTamaño());
            pstm.setDouble(8,p.getCosto());
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
