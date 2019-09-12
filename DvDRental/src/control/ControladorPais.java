/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Pais;
import modelo.PaisDAO;

/**
 *
 * @author user
 */
public class ControladorPais {
    
     public static ArrayList<Pais> listadoPaises(String codigo)
    {
        ArrayList<Pais> listado;
        listado = new ArrayList();
        PaisDAO paisDAO = new PaisDAO();
        listado = paisDAO.listadoPaises(codigo);
        return listado; 
    }
    
      public static int grabarPais(Pais p)
    {
        PaisDAO paisDAO = new PaisDAO();
        int resultado = paisDAO.grabarPais(p);
        return resultado; 
    }
      public static int borrarPais(String codigo)
    {
        PaisDAO paisDAO = new PaisDAO();
        int resultado = paisDAO.borrarPais(codigo);
        return resultado; 
    }
    
    
     public static int modificarPais(Pais p)
    {
        PaisDAO paisDAO = new PaisDAO();
        int resultado = paisDAO.modificarPais(p);
        return resultado; 
    } 
    
}
