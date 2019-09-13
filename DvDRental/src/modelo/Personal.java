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
public class Personal {
    private int id;
    private String nombre;
    private String apellido;
    private int direccionID;
    private String email;
    private int tiendaID;
    private boolean activado;
    private String nombreUsuario;
    private String contraseña;
    
    public Personal(){}
    
    public int getID(){return id;}
    public void setID(int id){this.id=id;}
    
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}
    
    public String getApellido(){return apellido;}
    public void setApellido(String apellido){this.apellido=apellido;}
    
    public int getDireccionID(){return direccionID;}
    public void setDireccionID(int direccionID){this.direccionID=direccionID;}
    
    public String getEmail(){return email;}
    public void setEmail(String email){this.email=email;}
    
    public int getTiendaID(){return id;}
    public void setTiendaID(int tiendaID){this.tiendaID=tiendaID;}
    
    public boolean getActivado(){return activado;}
    public void setActivado(boolean activado){this.activado=activado;}
    
    public String getNombreUsuario(){return nombreUsuario;}
    public void setNombreUsuario(String nombreUsuario){this.nombreUsuario=nombreUsuario;}
    
    public String getContraseña(){return contraseña;}
    public void setContraseña(String contraseña){this.contraseña=contraseña;}
    
}
