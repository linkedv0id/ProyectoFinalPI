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
public class Ciudad {
    private int id;
    private String ciudad;
    private int paisID;
    
    public Ciudad(){}
    
    public int getID(){return id;}
    public void setID(int id){this.id=id;}
    
    public String getCiudad(){return ciudad;}
    public void setCiudad(String ciudad){this.ciudad=ciudad;}
    
    public int getPaisID(){return paisID;}
    public void setPaisID(int paisID){this.paisID=paisID;}
    
}
