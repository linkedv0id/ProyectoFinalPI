/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import control.ControladorCategoria;
import control.ControladorPelicula;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.Pelicula;

/**
 *
 * @author user
 */
public class VListarPeliculas  extends JInternalFrame{
    private ArrayList <Categoria> c;
    private ArrayList <Pelicula> p;
        
    
    private JLabel jLcategoria;
    private JComboBox jCCategoria; 
    
    private JPanel panel,panelC,panelBoton;
    private Container contenedor;
    private JScrollPane scpanel;
    private JTable tabla;
    private JButton aceptar;
    
    DefaultTableModel modelo1;
    
    public VListarPeliculas(){
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){
         setSize(500,560);        
        setClosable(true);
        setIconifiable(true);
        setMaximizable(false);        
        setTitle("Listado De Peliculas");
        //setEnabled(false);
                
        tabla=new JTable();
        String cabecera[]={"ID","Titulo","Descripcion"};
        String datos [][]={};
        modelo1=new DefaultTableModel(datos,cabecera);
        tabla.setModel(modelo1);
        
        jLcategoria =new JLabel("Categoria:");
        jCCategoria=new JComboBox();
        jCCategoria.addItem("Todas");
        
        panelC=new JPanel();
        panelC.add(jLcategoria);
        panelC.add(jCCategoria);
        panelC.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY,1),"Elije una Categoria: "));
        
        panel=new JPanel();
        scpanel=new JScrollPane();  
        scpanel.setViewportView(tabla);
        panel.add(scpanel);
        
        panelBoton=new JPanel();
        aceptar=new JButton("Aceptar");
        panelBoton.add(aceptar);
        
        contenedor=getContentPane();
        contenedor.setLayout(new BorderLayout());
        contenedor.add(panelC,BorderLayout.NORTH);
        contenedor.add(panel,BorderLayout.CENTER);
        contenedor.add(panelBoton,BorderLayout.SOUTH);
        
        jCCategoria.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                jCCategoriaItemStateChanged(evt);
            }
        });
        
        aceptar.addActionListener(new ActionListener (){             
             public void actionPerformed(ActionEvent evt) {
                 aceptarActionListener(evt);
             }
        });
        
         cargarPeliculas("0");   
         cargarCategoriasCombo();
        
        
        
    }
     private void cargarCategoriasCombo(){
          ArrayList<Categoria> listaCategorias = new ArrayList();
          listaCategorias=ControladorCategoria.listadoCategorias("0");
          c=new ArrayList();
          c=ControladorCategoria.listadoCategorias("0");
         // System.out.println(listaCategorias.size());
         // ArrayList<String> combo =new ArrayList();
          
          for(int i=0;i<listaCategorias.size();i++){
              //combo.add(listaCategorias.get(i).getNombre());
              jCCategoria.addItem(listaCategorias.get(i).getNombre());
              System.out.println(listaCategorias.get(i).getNombre());
              
          }         
          
          
      }
       private void cargarPeliculas(String c){    
        //traer el listado de peliculas  
        ArrayList<Pelicula> listadoPeliculas = new ArrayList();
        //p=new ArrayList();
        //p=Controlador.listadoPeliculas(c);
        listadoPeliculas = ControladorPelicula.listadoCategoriasP(c);  
       //recorrer el listado y llenar cada fila
        for(int i= 0; i < listadoPeliculas.size(); i++){                       
              modelo1.addRow(new Object[]{
              listadoPeliculas.get(i).getID(),
              listadoPeliculas.get(i).getTitulo(),
              listadoPeliculas.get(i).getDescripcion()});
             
        }
    }
    
    private void jCCategoriaItemStateChanged(ItemEvent evt){
          String nombre="";
          int index =0;
          if (evt.getStateChange() == ItemEvent.SELECTED) {
            nombre = jCCategoria.getSelectedItem().toString();
            
           
            for(int i=0; i<c.size();i++){
                if(nombre.equals(c.get(i).getNombre())){
                    index=c.get(i).getID();
                    
                }else{ if(nombre.equals("Todas")){index=0;}}
            }  
            p=new ArrayList();
            p=ControladorPelicula.listadoCategoriasP(index+"");
                                   
            System.out.println(index);
            System.out.println(p.size());
            System.out.println(p.get(1).getTitulo());
            actualizar(p);
           
        }
          
      }
     public void actualizar (ArrayList<Pelicula>p){
          limpiarListadoTabla();
          for(int i= 0; i < p.size(); i++){                       
              modelo1.addRow(new Object[]{
              p.get(i).getID(),
              p.get(i).getTitulo(),
              p.get(i).getDescripcion()});
             
        }
      }
     private void limpiarListadoTabla(){
        
        for(int i=modelo1.getRowCount()-1; i>=0 ; i--){
            modelo1.removeRow(i);
        }
    }
     
     public void aceptarActionListener(ActionEvent evt){
         dispose();
     }
    
}
