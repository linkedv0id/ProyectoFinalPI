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
public class Actor {
    private int id;
    private String nombre;
    private String apellido;
    
    public Actor(){}
    
    public int getID(){return id;}
    public void setID(int id){this.id=id;}
    
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}
    
    public String getApellido(){return apellido;}
    public void setApellido(String apellido){this.apellido=apellido;}
    
    
}
