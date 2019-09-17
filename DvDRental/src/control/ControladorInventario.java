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
 * @author invitado
 */
public class ControladorInventario {
    
      public static ArrayList<Inventario> listadoInventario(String codigo)
    {
        ArrayList<Inventario> listado;
        listado = new ArrayList();
        InventarioDAO inventario = new InventarioDAO();
        listado = inventario.listadoInventario(codigo);
        return listado; 
    }
    
}
