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
    private JMenuItem menu2Item1,menu2Item2,menu2Item3,menu2Item4;  
    private JMenuItem menu3Item1,menu3Item2,menu3Item3;
    private JMenuItem menu4Item1, menu4Item2,menu4Item3,menu4Item4,menu4Item5,menu4Item6;
    private JDesktopPane JDPanel;
    private Container contenedor;
    
    private int tiendaID;
    private int empleadoID;
    
    
    public Inicio(int tienda_id,int empleado_id){
        tiendaID=tienda_id;
        empleadoID=empleado_id;
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
        menu2Item2=new JMenuItem("Gestionar Ciudades");
        menu2Item3=new JMenuItem("Listado de Direcciones");
        menu2Item4=new JMenuItem("Gestionar Direcciones");
        menu2.add(menu2Item1); menu2.add(menu2Item2); menu2.add(menu2Item3);menu2.add(menu2Item4);
        
        menu3=new JMenu("Clientes");
        menu3Item1=new JMenuItem("Gestionar Clientes");
        menu3Item2=new JMenuItem("Alquilar Pelicula");
        menu3Item3=new JMenuItem("Chat Cliente");
        menu3.add(menu3Item1); menu3.add(menu3Item2); menu3.add(menu3Item3);
        
        
        menu4=new JMenu("Administracion");
        menu4Item1= new JMenuItem("Listar Inventario");
        menu4Item2=new JMenuItem("Personal");
        menu4Item3=new JMenuItem("Tiendas");
        menu4Item4=new JMenuItem("Renta");
        menu4Item5=new JMenuItem("Listado de Pagos");
        menu4Item6=new JMenuItem("Modificar Inventarios");
        menu4.add(menu4Item1); menu4.add(menu4Item2);menu4.add(menu4Item3);menu4.add(menu4Item4);menu4.add(menu4Item5);
        menu4.add(menu4Item6);
        
        
        //
        //
        
        barraMenu.add(menu0); barraMenu.add(menu1); barraMenu.add(menu2);barraMenu.add(menu3);
        barraMenu.add(menu4);
        
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
        menu2Item2.addActionListener(new java.awt.event.ActionListener() {          
            public void actionPerformed(ActionEvent evt) {
               menu2Item2ActionPerformed(evt);
            }
        });
        
        menu2Item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menu2Item3DireccionActionPerformed(evt);
            }
        });
        
        menu2Item4.addActionListener(new java.awt.event.ActionListener() {           
            public void actionPerformed(ActionEvent e) {
               menu2Item4DireccionesActionPerformed(e);
            }
        });
        
        menu3Item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
             menu3Item1ClientesActionPerformed(evt);
            }
        });
        
        menu3Item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu3Item2AlquilarActionPerformed(e);
            }
        });
        
        menu3Item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu3Item3ChatClienteActionPerformed(e);
            }
        });
        
        menu4Item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
               menu4Item1InventarioActionPerformed(e);
            }
        });
        
        menu4Item2.addActionListener(new java.awt.event.ActionListener() {           
            public void actionPerformed(ActionEvent evt) {
                menu4Item2PersonalActionPerformed(evt);
            }
        })
        ;
                
        
        menu4Item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
             menu4Item3TiendasActionPerformed(evt);
            }
        });
        
        menu4Item4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
             menu4Item4RentaActionPerformed(evt);
            }
        });
        
        menu4Item5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
               menu4Item5ActionPerformed(e);
            }
        });
        menu4Item6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
               menu4Item6InventAriosactionPerformed(e);
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
    public void menu2Item2ActionPerformed(ActionEvent evt){
        centrar(menu2Item2.getText());
    }
    public void menu2Item3DireccionActionPerformed(ActionEvent evt){
        centrar(menu2Item3.getText());
    }
    
    public void menu3Item1ClientesActionPerformed(ActionEvent evt){
        centrar(menu3Item1.getText());
    }
    
    public void menu3Item3ClientesActionPerformed(ActionEvent evt){
        centrar(menu3Item3.getText());
    }
    
    public void menu4Item2PersonalActionPerformed(ActionEvent evt){
        centrar(menu4Item2.getText());
    }
    public void menu4Item3TiendasActionPerformed(ActionEvent evt){
        centrar(menu4Item3.getText());
    }
    public void menu4Item4RentaActionPerformed(ActionEvent evt){
        centrar(menu4Item4.getText());
    }
    public void menu2Item4DireccionesActionPerformed(ActionEvent evt){
        centrar(menu2Item4.getText());
    }
    public void menu4Item1InventarioActionPerformed(ActionEvent evt){
        centrar(menu4Item1.getText());
    }
    public void menu3Item2AlquilarActionPerformed(ActionEvent evt){
        centrar(menu3Item2.getText());
    }
    public void menu3Item3ChatClienteActionPerformed(ActionEvent evt){
        centrar(menu3Item3.getText());
    }
    public void menu4Item5ActionPerformed(ActionEvent evt){
        centrar(menu4Item5.getText());
    }
    public void menu4Item6InventAriosactionPerformed(ActionEvent e){
        centrar(menu4Item6.getText());
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
        if(texto.equalsIgnoreCase("Gestionar Ciudades")){
            v=new VModificarCiudad();
        }
        if(texto.equalsIgnoreCase("Listado de Direcciones")){
            v=new VDirecciones();
        }
        if(texto.equalsIgnoreCase("Tiendas")){
            v=new VModificarTienda();
        }
        if(texto.equalsIgnoreCase("Personal")){
            v=new VModificarPersonal();
        }
        if(texto.equalsIgnoreCase("Gestionar Direcciones")){
            v=new VModificarDireccion();
        }
        if(texto.equalsIgnoreCase("Listar Inventario")){
            v=new VListaInventario();
        }
        
        if(texto.equalsIgnoreCase("Renta")){
            v=new VModificarRenta();
        }
        if(texto.equalsIgnoreCase("Alquilar Pelicula")){
            v=new VAlquilarPelicula(tiendaID,empleadoID);
        }
        if(texto.equalsIgnoreCase("Chat Cliente")){
            v=new VChatServer();
        }
       if(texto.equalsIgnoreCase("listado de pagos")){
           v=new VListadoPagos();
       }
       if(texto.equalsIgnoreCase("Modificar Inventarios")){
           v=new VModificarInventarios();
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
