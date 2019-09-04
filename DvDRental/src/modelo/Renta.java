/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author user
 */
public class Renta {
    private int id;
    //private int fecha;
    private int inventarioID;
    private int clienteID;
    //private Date fechaRetorno;
    private int personalID;
    
    public Renta(){}
    
    public int getID(){return id;}
    public void setID(int id){this.id=id;}
    
    public int getClienteID(){return clienteID;}
    public void setClienteID(int clienteID){this.clienteID=clienteID;}
    
    public int getInventarioID(){return inventarioID;}
    public void setInventarioID(int inventarioID){this.inventarioID=inventarioID;}
    
    public int getPersonalID(){return personalID;}
    public void setPersonalID(int personalID){this.personalID=personalID;}
    
    
    
}
