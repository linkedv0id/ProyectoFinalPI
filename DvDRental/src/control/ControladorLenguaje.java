/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Lenguaje;
import modelo.LenguajeDAO;

/**
 *
 * @author user
 */
public class ControladorLenguaje {
    
      public static ArrayList<Lenguaje> listadoLenguajes(String codigo)
    {
        ArrayList<Lenguaje> listado;
        listado = new ArrayList();
        LenguajeDAO categorias = new LenguajeDAO();
        listado = categorias.listadoLenguajes(codigo);
        return listado; 
    }
}
