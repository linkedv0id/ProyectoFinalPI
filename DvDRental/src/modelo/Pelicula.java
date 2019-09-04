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
public class Pelicula {
    private int id;
    private String titulo;
    private String descripcion;
    private int año;
    private int lenguaje;
    private double tasaAlquiler;
    private int tamaño;
    private int duracionRenta;
    private double costo;
    private String rating;
    private String especial;
    private String fulltex;
    
   
  public Pelicula(){}   
     
    
  public int getID(){return id;}
  
  public void setID(int d){id=d;}
  
  public String getTitulo(){return titulo;}
  
  public void setTitulo(String titulo){this.titulo=titulo;}
  
  public String getDescripcion(){return descripcion;}
  
  public void setDescripcion(String d){ descripcion=d;}
  
  public int getAño(){return año;}
  
  public void setAño(int año){this.año=año;}
  
  public int getLenguaje(){return lenguaje;}
  
  public void setLenguaje(int lenguaje){this.lenguaje=lenguaje;}
  
  public int getDuracionRenta(){return duracionRenta;}
  
  public void setDuracionRenta(int duracionRenta){this.duracionRenta=duracionRenta;}
      
   
  public double getCosto(){return costo;}
  
  public void setCosto(double costo){this.costo=costo;}
  
  public String getRating(){return rating;}
  
  public void setRating(String rating){this.rating=rating;}
  
  public double getTasa(){return tasaAlquiler;}
  public void setTasa(double tasaAlquiler){this.tasaAlquiler=tasaAlquiler;}
  
  public int getTamaño(){return tamaño;}
  public void setTamaño(int tamaño){this.tamaño=tamaño;}
  
  public String getEspecial(){return especial;}
  public void setEspecial(String especial){this.especial=especial;}
  
  public String getFulltex(){return fulltex;}
  public void setFulltex(String fulltex){this.fulltex=fulltex;}
  
    
    
    
}

    
