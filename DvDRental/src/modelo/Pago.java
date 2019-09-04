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
public class Pago {
    private int id;
    private int clienteID;
    private int personalID;
    private int rentaID;
    private double valor;
    //private date fecha;
    
    public Pago(){}
    
    public int getID(){return id;}
    public void setID(int id){this.id=id;}
    
    public int getClienteID(){return clienteID;}
    public void setClienteID(int clienteID){this.clienteID=clienteID;}
    
    public int getPersonalID(){return personalID;}
    public void setPersonalID(int personalID){this.personalID=personalID;}
    
    public int getRentalID(){return rentaID;}
    public void setRentalID(int rentalID){this.rentaID=rentalID;}
    
    public double getValor(){return valor;}
    public void setValor(double valor){this.valor=valor;}
    
}
