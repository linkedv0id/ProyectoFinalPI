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
public class Tienda {
    private int id;
    private int gerenteID;
    private int direccionID;
    
    public Tienda(){}
    
    public int getID(){return id;}
    public void setID(int id){this.id=id;}
    
    public int getGerenteID(){return gerenteID;}
    public void setGerenteID(int gerenteID){this.gerenteID=gerenteID;}
    
    public int getDireccionID(){return direccionID;}
    public void setDireccionID(int direccionID){this.direccionID=direccionID;}
    
    
}
