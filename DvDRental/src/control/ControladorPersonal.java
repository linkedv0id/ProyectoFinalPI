/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Personal;
import modelo.PersonalDAO;

/**
 *
 * @author user
 */
public class ControladorPersonal {
    
     public static ArrayList<Personal> listadoPersonal(String codigo)
    {
        ArrayList<Personal> listado;
        listado = new ArrayList();
        PersonalDAO personal = new PersonalDAO();
        listado = personal.listadoPersonal(codigo);
        return listado; 
    }
    
      public static int grabarPersonal(Personal p)
    {
        PersonalDAO personalDAO = new PersonalDAO();
        int resultado = personalDAO.grabarPersonal(p);
        return resultado; 
    }
      public static int borrarPersonal(String codigo)
    {
        PersonalDAO personalDAO = new PersonalDAO();
        int resultado = personalDAO.borrarPersonal(codigo);
        return resultado; 
    }
    
    
     public static int modificarPersonal(Personal p)
    {
        PersonalDAO personalDAO = new PersonalDAO();
        int resultado = personalDAO.modificarPersonal(p);
        return resultado; 
    }   
}
