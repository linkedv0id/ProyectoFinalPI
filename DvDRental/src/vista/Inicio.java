/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.Border;
/**
 *
 * @author user
 */
public class Inicio extends JFrame {
    private JMenuBar barraMenu;
    private JMenu menu0,menu1, menu2,menu3,menu4;
    private JMenuItem menu0Item1, menu0Item2;
    private JMenuItem menu1Item1, menu1Item2,menu1Item3,menu1Item4;
    private JMenuItem menu2Item1;  
    private JMenuItem menu3Item1;
    private JDesktopPane JDPanel;
    private Container contenedor;
    
    
    
    public Inicio(){
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        setVisible(true);
        setTitle(" Tiendas DvDRental");        
        setExtendedState(6);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        barraMenu=new JMenuBar();
        setJMenuBar(barraMenu);
        
        menu0=new JMenu("Principal");
        menu0Item1=new JMenuItem("Acerca");
        menu0Item2=new JMenuItem("Salir");
        menu0.add(menu0Item1); menu0.add(menu0Item2);
        
        menu1=new JMenu("Opciones");        
        menu1Item1= new JMenuItem("Modificar Peliculas");       
        menu1Item2= new JMenuItem("Listado de Peliculas");
        menu1Item3=new JMenuItem("Gestionar Categorias");
        menu1Item4= new JMenuItem("Modificar Actores");
        menu1.add(menu1Item1);  ;  menu1.add(menu1Item2);menu1.add(menu1Item3);menu1.add(menu1Item4);
        
        menu2=new JMenu("Ubicaciones");
        menu2Item1= new JMenuItem("Gestionar Paises");
        menu2.add(menu2Item1);
        
        menu3=new JMenu("Clientes");
        menu3Item1=new JMenuItem("Gestionar Clientes");
        menu3.add(menu3Item1);
        
        
        
        //
        //
        
        barraMenu.add(menu0); barraMenu.add(menu1); barraMenu.add(menu2);barraMenu.add(menu3);
        
        JDPanel=new JDesktopPane();
        contenedor=getContentPane();
        contenedor.add(JDPanel);
        JDPanel.setBorder(new ImagenFondo());
        
               
        menu0Item1.addActionListener(new java.awt.event.ActionListener(){
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu0Item1AcercaActionPerformed(evt);
            }
        });
                
        menu0Item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu0Item2SalirActionPerformed(evt);
            }
        });
        
        menu1Item1.addActionListener(new java.awt.event.ActionListener (){
            public void actionPerformed(ActionEvent evt){
                menu1Item1AgregarActionPerformed(evt);
            }
        });
        
        menu1Item2.addActionListener(new java.awt.event.ActionListener() {            
            public void actionPerformed(ActionEvent evt) {
                 menu1Item2ListarActionPerformed(evt);
            }
        });
        menu1Item3.addActionListener(new java.awt.event.ActionListener() {            
            public void actionPerformed(ActionEvent evt) {
                 menu1ItemCategoriasActionPerformed(evt);
            }
        });
        
        menu1Item4.addActionListener(new java.awt.event.ActionListener() {            
            public void actionPerformed(ActionEvent evt) {
                 menu1Item4ActoresActionPerformed(evt);
            }
            });
        
        menu2Item1.addActionListener(new java.awt.event.ActionListener() {           
            public void actionPerformed(ActionEvent evt) {
               menu2Item1PaisesActionPerformed( evt);
            }
        });
        
        menu3Item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
             menu3Item1ClientesActionPerformed(evt);
            }
        });
        
        
        
    }
    public void menu0Item1AcercaActionPerformed(ActionEvent evt){
       JOptionPane.showMessageDialog(this,"Aplicacion DvDRental V.1.01","Acerca De",2);
    }
    public void menu0Item2SalirActionPerformed(ActionEvent evt){
        dispose();
    }
    public void menu1Item1AgregarActionPerformed(ActionEvent evt){
        centrar(menu1Item1.getText());
    }
    public void menu1Item2ListarActionPerformed(ActionEvent evt){
        
        centrar(menu1Item2.getText());
    }
    public void menu1ItemCategoriasActionPerformed(ActionEvent evt){
        centrar(menu1Item3.getText());
    }
    public void menu1Item4ActoresActionPerformed(ActionEvent evt){
        centrar(menu1Item4.getText());
    }
    public void menu2Item1PaisesActionPerformed(ActionEvent evt){
        centrar(menu2Item1.getText());
    }
    public void menu3Item1ClientesActionPerformed(ActionEvent evt){
        centrar(menu3Item1.getText());
    }
    
    
     public void centrar(String texto){
        JInternalFrame v=null; 
        if(texto.equalsIgnoreCase("Listado de Peliculas")){
         v= new VListarPeliculas(); 
        }
        if(texto.equalsIgnoreCase("Modificar Peliculas")){
            v=new VModificarPeliculas();
        }
        if(texto.equalsIgnoreCase("Gestionar Categorias")){
            v=new VModificarCategorias();
        }
        if(texto.equalsIgnoreCase("Gestionar Paises")){
            v=new VModificarPaises();
        }
        if(texto.equalsIgnoreCase("Gestionar Clientes")){
            v=new VModificarClientes();
        }
        if(texto.equalsIgnoreCase("Modificar Actores")){
            v = new VModificarActores();
        }
         
        int x = (JDPanel.getWidth() / 2) - v.getWidth() /2;
        int y = (JDPanel.getHeight() / 2) - v.getHeight() /2;

        if (v.isShowing()){
            v.setLocation(x,y);
        }
        else{
            JDPanel.add(v);
            v.setLocation(x,y);
            v.setVisible(true);
        }
     }
   
}
