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
}
