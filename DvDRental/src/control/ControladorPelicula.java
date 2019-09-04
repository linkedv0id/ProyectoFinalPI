/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.util.ArrayList;
import modelo.Pelicula;
import modelo.PeliculaDAO;
/**
 *
 * @author user
 */
public class ControladorPelicula {
    
    public static int modificarPelicula(Pelicula p)
    {
        PeliculaDAO programaDAO = new PeliculaDAO();
        int resultado = programaDAO.modificarPelicula(p);
        return resultado; 
    }
    
     public static ArrayList<Pelicula> listadoCategoriasP(String codigo)
    {
        ArrayList<Pelicula> listado;
        listado = new ArrayList();
        PeliculaDAO categoriasP = new PeliculaDAO();
        listado = categoriasP.listadoCategoriasPeli(codigo);
        return listado; 
       
    }
     public static int borrarPelicula(String codigo)
    {
        PeliculaDAO peliculaDAO = new PeliculaDAO();
        int resultado = peliculaDAO.borrarPelicula(codigo);
        return resultado; 
    }
     public static int grabarPelicula(Pelicula p)
    {
        PeliculaDAO peliculaDAO = new PeliculaDAO();
        int resultado = peliculaDAO.grabarPelicula(p);
        return resultado; 
    }
     
     
    
}
