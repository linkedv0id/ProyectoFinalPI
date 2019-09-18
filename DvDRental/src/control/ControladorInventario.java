/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Inventario;
import modelo.InventarioDAO;

/**
 *
 * @author user
 */
public class ControladorInventario {
    
     public static ArrayList<Inventario> listadoInventarios(String codigo)
    {
        ArrayList<Inventario> listado;
        listado = new ArrayList();
        InventarioDAO inventarios = new InventarioDAO();
        listado = inventarios.listadoInventarios(codigo);
        return listado; 
    }
      public static ArrayList<Inventario> listadoInventariosTienda(String codigo)
    {
        ArrayList<Inventario> listado;
        listado = new ArrayList();
        InventarioDAO inventarios = new InventarioDAO();
        listado = inventarios.listadoInventariosTiendas(codigo);
        return listado; 
    }
    
      public static int grabarInventario(Inventario i)
    {
        InventarioDAO inventarioDAO = new InventarioDAO();
        int resultado = inventarioDAO.grabarInventario(i);
        return resultado; 
    }
      public static int borrarInventario(String codigo)
    {
        InventarioDAO inventarioDAO = new InventarioDAO();
        int resultado = inventarioDAO.borrarInventario(codigo);
        return resultado; 
    }
    
    
     public static int modificarInventario(Inventario i)
    {
        InventarioDAO inventarioDAO = new InventarioDAO();
        int resultado = inventarioDAO.modificarInventario(i);
        return resultado; 
    }
    
}
