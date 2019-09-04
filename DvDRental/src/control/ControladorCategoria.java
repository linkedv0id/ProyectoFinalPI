/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Categoria;
import modelo.CategoriaDAO;

/**
 *
 * @author user
 */
public class ControladorCategoria {
      public static ArrayList<Categoria> listadoCategorias(String codigo)
    {
        ArrayList<Categoria> listado;
        listado = new ArrayList();
        CategoriaDAO categorias = new CategoriaDAO();
        listado = categorias.listadoCategorias(codigo);
        return listado; 
    }
    
      public static int grabarCategoria(Categoria c)
    {
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        int resultado = categoriaDAO.grabarCategoria(c);
        return resultado; 
    }
      public static int borrarCategoria(String codigo)
    {
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        int resultado = categoriaDAO.borrarCategoria(codigo);
        return resultado; 
    }
    
    
     public static int modificarCategoria(Categoria c)
    {
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        int resultado = categoriaDAO.modificarCategoria(c);
        return resultado; 
    }
      
      
      
}
