/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



/**
 *
 * @author user
 */
public class Cliente {
    private int id;
    private int tiendaID;
    private String nombre;
    private String apellido;
    private String email;
    private int direccionID;
    private boolean activado;
    //private date fechaCreacion;
    private int activo;
    
    public Cliente(){}
    
    
    public int getID(){return id;}
    public void setID(int id){this.id=id;}
    
    public int getTiendaID(){return id;}
    public void setTiendaID(int tiendaID){this.tiendaID=tiendaID;}
    
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}
    
    public String getApellido(){return apellido;}
    public void setApellido(String apellido){this.apellido=apellido;}
    
    public String getEmail(){return email;}
    public void setEmeail(String email){this.email=email;}
    
    public int getDireccionID(){return direccionID;}
    public void setDireccionID(int direccionID){this.direccionID=direccionID;}
    
    public boolean getActivado(){return activado;}
    public void setActvado(boolean activado){this.activado=activado;}
    
    public int getActivo(){return activo;}
    public void setActivo(int activo){this.activo=activo;}    
    
    
}
