/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Direccion;
import modelo.DireccionDAO;

/**
 *
 * @author invitado
 */
public class ControladorDireccion {
    
    public static int modificarDireccion(Direccion d )
    {
        DireccionDAO direccionDAO = new DireccionDAO();
        int resultado = direccionDAO.modificarDireccion(d);
        return resultado; 
    }
    
    public static ArrayList<Direccion> listadoDirecciones(String codigo)
    {
        ArrayList<Direccion> listado;
        listado = new ArrayList();
        DireccionDAO direccion = new DireccionDAO();
        listado = direccion.listadoDirecciones(codigo);
        return listado; 
       
    }
    public static int borrarDireccion(String codigo)
    {
        DireccionDAO direccionDAO = new DireccionDAO();
        int resultado = direccionDAO.borrarDireccion(codigo);
        return resultado; 
    }
    public static int grabarDireccion(Direccion d)
    {
        DireccionDAO direccionDAO = new DireccionDAO();
        int resultado = direccionDAO.grabarDireccion(d);
        return resultado; 
    }
    
    
}
