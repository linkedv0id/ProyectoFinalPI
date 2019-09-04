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
public class Direccion {
    private int id;
    private String direccion;
    private String direccion2;
    private String distrito;
    private int ciudadID;
    private String codigoPostal;
    private String telefono;
    
    public int getID(){return id;}
    public void setID(int id){this.id=id;}
    
    public String getDireccion(){return direccion;}
    public void setDireccion(String direccion){this.direccion=direccion;}
    
    public String getDireccion2(){return direccion2;}
    public void setDireccion2(String direccion2){this.direccion2=direccion2;}
    
    public String getDistrito(){return distrito;}
    public void setDistrito(String distrito){this.distrito=distrito;}
    
    public int getCiudadID  (){return ciudadID;}
    public void setCiudadID(int ciudadID){this.ciudadID=ciudadID;}
    
    public String getCodigoPostal(){return codigoPostal;}
    public void setCodigoPostal(String codigoPostal){this.codigoPostal=codigoPostal;}
    
    public String getTelefono(){return telefono;}
    public void setTelefono(String telefono){this.telefono=telefono;}
   
    
    
    
}
