/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import control.ControladorCategoria;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import modelo.Categoria;

/**
 *
 * @author user
 */
public class VAgregarPelicula extends JInternalFrame {
    private JLabel jlTitulo,jlID,jlDescripcion,jlAño,jlLenguaje;
    private JLabel  jlDuracionAlquiler, jlTasaAlquiler, jlTamaño;
    private JLabel jlCosto, jlClasificacion, jlEspecial,jlFullText,jlCategorias;
    
    private JTextField txtTitulo,txtID,txtDescripcion,txtAño,txtTasaAlquiler,txtTamaño;
    private JTextField txtCosto,txtClasificacion,txtEspecial,txtFullText,txtCategorias;
    
   // private JTextArea ;
    
    private JComboBox jcLenguaje,jcDuracionAlquiler,jcCategorias;
    
    private JButton btAceptar,btCancelar;
    
    private ArrayList <String> categorias ;
    
    private JPanel panelInfo,panelCategorias,panelBotones;
    private String nombreCategoria,n="";
    private Container contenedor;
    
    
    public VAgregarPelicula(){
        iniciarComponentes();
    }
    public void iniciarComponentes(){
        setSize(700,400);        
        setClosable(true);
        setIconifiable(true);
        setMaximizable(false);        
        setTitle("Agregar Peliculas");    
        
        
        
        jlTitulo=new JLabel("Titulo:");
        jlID=new JLabel("ID:");
        jlDescripcion=new JLabel("Descripcion:");
        jlAño=new JLabel("Año:");
        jlLenguaje=new JLabel("Lenguaje:");
        jlDuracionAlquiler=new JLabel("Duracion Alquiler:");
        jlTasaAlquiler=new JLabel("Tasa Arrenfamiento:");
        jlTamaño=new JLabel("Tamaño:");
        jlCosto=new JLabel("Costo Reposicion:");
        jlClasificacion=new JLabel("Clasificacion:");
        jlEspecial=new JLabel("Presentacion Especial:");
        jlFullText=new JLabel("FullText:");
        jlCategorias=new JLabel("Elije las categorias de la pelicula:");
        
        txtTitulo=new JTextField();
        txtID=new JTextField();
        txtDescripcion=new JTextField();
        txtAño=new JTextField();
        txtTasaAlquiler=new JTextField();
        txtTamaño=new JTextField();
        txtCosto=new JTextField();
        txtClasificacion=new JTextField();
        txtEspecial=new JTextField();
        txtFullText=new JTextField();
        
        txtCategorias=new JTextField(30);
        
        jcLenguaje=new JComboBox();
        jcDuracionAlquiler=new JComboBox();
        jcCategorias=new JComboBox();
        
        btAceptar=new JButton("Aceptar");
        btCancelar=new JButton("Cancelar");
        
        categorias=new ArrayList();
        
        panelInfo=new JPanel();
        panelCategorias=new JPanel();
        panelBotones=new JPanel();
        
        contenedor=getContentPane();
        
        
        panelInfo.setLayout(new GridLayout(12,2));
        panelInfo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY,2),"Informacion Pelicula:"));
        
        
        panelInfo.add(jlTitulo);panelInfo.add(txtTitulo);
        panelInfo.add(jlID);panelInfo.add(txtID);
        panelInfo.add(jlDescripcion);panelInfo.add(txtDescripcion);
        panelInfo.add(jlAño);panelInfo.add(txtAño);
        panelInfo.add(jlLenguaje);panelInfo.add(jcLenguaje);
        panelInfo.add(jlDuracionAlquiler);panelInfo.add(jcDuracionAlquiler);
        panelInfo.add(jlTasaAlquiler);panelInfo.add(txtTasaAlquiler);
        panelInfo.add(jlTamaño);panelInfo.add(txtTamaño);
        panelInfo.add(jlCosto);panelInfo.add(txtCosto);
        panelInfo.add(jlClasificacion);panelInfo.add(txtClasificacion);
        panelInfo.add(jlEspecial);panelInfo.add(txtEspecial);
        panelInfo.add(jlFullText);panelInfo.add(txtFullText);
        
        panelBotones.add(btAceptar);panelBotones.add(btCancelar);
        panelBotones.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY,2)));
        
        //contenedor.setLayout(new GridLayout(3,1));
        contenedor.setLayout(new BorderLayout());
        
        contenedor.add(panelInfo,BorderLayout.CENTER); contenedor.add(panelBotones,BorderLayout.SOUTH);
        
        
        panelCategorias.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY,2),"Elige las Categorias de la Pelicula:"));
        panelCategorias.add(jlCategorias);
        panelCategorias.add(jcCategorias);
        panelCategorias.add(txtCategorias);
        
        contenedor.add(panelCategorias,BorderLayout.NORTH);
        cargarCategoriasCombo();
        
        jcCategorias.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                 
                nombreCategoria=jcCategoriasItemStateChanged(evt);
                if(comprobarArray(nombreCategoria)==false){
                categorias.add(nombreCategoria);
                n+=nombreCategoria+"/";
                txtCategorias.setText(n);
                
                }                
            }
        });
        
        
        
        
        
        
        
    }
    private String jcCategoriasItemStateChanged(ItemEvent evt){
        String nombre="";      
    
         if (evt.getStateChange() == ItemEvent.SELECTED) {
            nombre = jcCategorias.getSelectedItem().toString();
                           
         }
         
        return nombre;         
    }
    
    
    public boolean comprobarArray(String n){
        boolean esta=false;
        for(int x=0;x<categorias.size();x++){
            if(categorias.get(x).equalsIgnoreCase(n)){
               esta=true;
            }
        }return esta;
    }
        
    
     private void cargarCategoriasCombo(){
          ArrayList<Categoria> listaCategorias = new ArrayList();
          listaCategorias=ControladorCategoria.listadoCategorias("0");
                    
          for(int i=0;i<listaCategorias.size();i++){
              jcCategorias.addItem(listaCategorias.get(i).getNombre());
                            
          }    
      }
    
    
    
}
