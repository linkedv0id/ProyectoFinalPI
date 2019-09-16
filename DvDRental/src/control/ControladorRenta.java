/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Renta;
import modelo.RentaDAO;

/**
 *
 * @author user
 */
public class ControladorRenta {
    
     public static ArrayList<Renta> listadoRentas(String codigo)
    {
        ArrayList<Renta> listado;
        listado = new ArrayList();
        RentaDAO rentaDAO = new RentaDAO();
        listado = rentaDAO.listadoRenta(codigo);
        return listado; 
    }
    
      public static int grabarRenta(Renta r)
    {
        RentaDAO rentaDAO = new RentaDAO();
        int resultado = rentaDAO.grabarRenta(r);
        return resultado; 
    }
      public static int borrarRenta(String codigo)
    {
        RentaDAO rentaDAO = new RentaDAO();
        int resultado = rentaDAO.borrarRenta(codigo);
        return resultado; 
    }
    
    
     public static int modificarRenta(Renta r)
    {
        RentaDAO rentaDAO = new RentaDAO();
        int resultado = rentaDAO.modificarRenta(r);
        return resultado; 
    } 
    
}
