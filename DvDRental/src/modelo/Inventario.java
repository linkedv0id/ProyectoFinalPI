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
public class Inventario {
    private int id;
    private int peliculaID;
    private int tiendaID;
    
    public Inventario(){}
    
    public int getID(){return id;}
    public void setID(int id){this.id=id;}
    
    public int getPeliculaID(){return peliculaID;}
    public void setPeliculaID(int peliculaID){this.peliculaID=peliculaID;}
    
    public int getTiendaID(){return tiendaID;}
    public void setTIendaID(int tiendaID){this.tiendaID=tiendaID;}
    
    
}
