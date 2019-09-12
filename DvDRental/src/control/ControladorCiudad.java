/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Ciudad;
import modelo.CiudadDAO;

/**
 *
 * @author user
 */
public class ControladorCiudad {
    
     public static ArrayList<Ciudad> listadoCiudades(String codigo)
    {
        ArrayList<Ciudad> listado;
        listado = new ArrayList();
        CiudadDAO ciudad = new CiudadDAO();
        listado = ciudad.listadoCiudades(codigo);
        return listado; 
    }
    
      public static int grabarCiudad(Ciudad c)
    {
        CiudadDAO ciudadDAO = new CiudadDAO();
        int resultado = ciudadDAO.grabarCiudad(c);
        return resultado; 
    }
      public static int borrarCiudad(String codigo)
    {
        CiudadDAO ciudadDAO = new CiudadDAO();
        int resultado = ciudadDAO.borrarCiudad(codigo);
        return resultado; 
    }
    
    
     public static int modificarCiudad(Ciudad c)
    {
        CiudadDAO ciudadDAO = new CiudadDAO();
        int resultado = ciudadDAO.modificarCiudad(c);
        return resultado; 
    }   
    
}
