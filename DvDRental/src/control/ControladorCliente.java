/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.ClienteDAO;

/**
 *
 * @author user
 */
public class ControladorCliente {
     public static ArrayList<Cliente> listadoClientes(String codigo)
    {
        ArrayList<Cliente> listado;
        listado = new ArrayList();
        ClienteDAO clientedao = new ClienteDAO();
        listado = clientedao.listadoClientes(codigo);
        return listado; 
       
    }
     public static int modificarCliente(Cliente c )
    {
        ClienteDAO clienteDAO = new ClienteDAO();
        int resultado = clienteDAO.modificarCliente(c);
        return resultado; 
    }
     public static int borrarCliente(String codigo)
    {
        ClienteDAO clienteDAO = new ClienteDAO();
        int resultado = clienteDAO.borrarCliente(codigo);
        return resultado; 
    }
    public static int grabarCliente(Cliente c)
    {
        ClienteDAO clienteDAO = new ClienteDAO();
        int resultado = clienteDAO.grabarCliente(c);
        return resultado; 
    }
}
