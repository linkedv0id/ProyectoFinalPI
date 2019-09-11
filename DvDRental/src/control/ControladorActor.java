
package control;

import java.util.ArrayList;
import modelo.Actor;
import modelo.ActorDAO;


public class ControladorActor {
    
    public static ArrayList<Actor> listadoActores(String codigo)
    {
        ArrayList<Actor> listado;
        listado = new ArrayList();
        ActorDAO actor = new ActorDAO();
        listado = actor.listadoActores(codigo);
        return listado; 
    }
    
      public static int grabarActor(Actor c)
    {
        ActorDAO ActorDAO = new ActorDAO();
        int resultado = ActorDAO.grabarActor(c);
        return resultado; 
    }
      public static int borrarActor(String codigo)
    {
        ActorDAO ActorDAO = new ActorDAO();
        int resultado = ActorDAO.borrarActor(codigo);
        return resultado; 
    }
    
    
     public static int modificarActor(Actor c)
    {
        ActorDAO ActorDAO = new ActorDAO();
        int resultado = ActorDAO.modificarActor(c);
        return resultado; 
    }   
}
    

