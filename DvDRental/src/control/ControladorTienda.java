/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Tienda;
import modelo.TiendaDAO;

/**
 *
 * @author user
 */
public class ControladorTienda {
    
     public static ArrayList<Tienda> listadoTiendas(String codigo)
    {
        ArrayList<Tienda> listado;
        listado = new ArrayList();
        TiendaDAO tienda = new TiendaDAO();
        listado = tienda.listadoTiendas(codigo);
        return listado; 
    }
     
     public static int grabarTienda(Tienda t)
    {
        TiendaDAO tiendaDAO = new TiendaDAO();
        int resultado = tiendaDAO.grabarTienda(t);
        return resultado; 
    }
     
     public static int borrarTienda(String codigo)
    {
        TiendaDAO tiendaDAO = new TiendaDAO();
        int resultado = tiendaDAO.borrarTienda(codigo);
        return resultado; 
    }
     
     public static int modificarCiudad(Tienda t)
    {
        TiendaDAO tiendaDAO = new TiendaDAO();
        int resultado = tiendaDAO.modificarTienda(t);
        return resultado; 
    }  
     
     
     
     
}
