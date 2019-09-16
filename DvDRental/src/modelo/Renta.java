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
    private String fecha;
    private int inventarioID;
    private int clienteID;
    private String fechaRetorno;
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
    
    public String getFecha() {return fecha;}
    public void setFecha(String fecha) {this.fecha = fecha;}
    
    public String getFechaRetorno() {return fechaRetorno;}
    public void setFechaRetorno(String fechaRetorno) {this.fechaRetorno = fechaRetorno;}
    
}
