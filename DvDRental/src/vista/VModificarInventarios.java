/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControladorInventario;
import control.ControladorPelicula;
import control.ControladorTienda;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Inventario;
import modelo.Pelicula;
import modelo.Tienda;

/**
 *
 * @author invitado
 */
public class VModificarInventarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form VModificarInventarios
     */
    public VModificarInventarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtPeliculaID = new javax.swing.JTextField();
        jcTienda = new javax.swing.JComboBox<>();
        jcDisponible = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jbNuevo = new javax.swing.JButton();
        jbRegistrar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Inventarios");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion:"));

        jLabel1.setText("ID:");

        jLabel2.setText("Pelicula ID:");

        jLabel3.setText("Tienda ID:");

        jLabel4.setText("Disponible:");

        txtID.setEnabled(false);

        txtPeliculaID.setEnabled(false);

        jcTienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jcTienda.setEnabled(false);

        jcDisponible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "si", "no" }));
        jcDisponible.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(txtPeliculaID)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jcDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeliculaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cargarTiendasCombo();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Controles:"));

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbRegistrar.setText("Registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbModificar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jbBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jbNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jbNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancelar)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Pelicula ", "Tienda", "Disponible"
            }
        ));
        cargarInventarios("0");
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        ArrayList<Inventario> listaInventario = new ArrayList();
        listaInventario=ControladorInventario.listadoInventarios("0");
        txtID.setText(listaInventario.get(listaInventario.size()-1).getID()+1+"");  
        txtPeliculaID.setText("");
        jcTienda.setSelectedIndex(0);
        jcDisponible.setSelectedIndex(0);
        
        
        if(jbNuevo.getText().equals("Nuevo")){
            jbRegistrar.setEnabled(true);
            txtPeliculaID.setEnabled(true);
            jcTienda.setEnabled(true);
            jcDisponible.setEnabled(true);
                        
            jbBorrar.setEnabled(false);
            jbModificar.setEnabled(false);
            jbNuevo.setText("Cancelar");           
            jTable1.setEnabled(false);
            jTable1.setVisible(false);
            txtID.requestFocusInWindow();
        }
        else{
            jbRegistrar.setEnabled(false);
            txtPeliculaID.setEnabled(false);
            jcTienda.setEnabled(false);                      
            jcDisponible.setEnabled(false);
            
            jbNuevo.setText("Nuevo");
            jbModificar.setEnabled(true);
            
            jbBorrar.setEnabled(true);
            jTable1.setEnabled(true);
            jTable1.setVisible(true);
            jbNuevo.requestFocusInWindow();
        }
        
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        // TODO add your handling code here:
                Inventario i= new Inventario();
                i.setID(Integer.parseInt(txtID.getText()));
                i.setPeliculaID(Integer.parseInt(txtPeliculaID.getText()));                
                i.setTiendaID(Integer.parseInt(jcTienda.getSelectedItem().toString()));
                i.setDisponible(jcDisponible.getSelectedItem().toString());
                              
                
                int tamaño;
                tamaño=ControladorInventario.listadoInventarios(i.getID()+"").size();
                
                if(tamaño==0){
                int resultado = 0;
                    resultado = ControladorInventario.grabarInventario(i);
                    if(resultado == 1){
                        JOptionPane.showMessageDialog(this,
                                "Registro Grabado con éxito",
                                "Confirmación",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Error al grabar",
                                "Confirmación",JOptionPane.ERROR_MESSAGE);
                    }

                    cargarInventarios("0");

            jbRegistrar.setEnabled(false);           
            txtPeliculaID.setEnabled(false); 
            jcTienda.setEnabled(false);
            jcDisponible.setEnabled(false);
            
            jbBorrar.setEnabled(true);
            
            
            jbNuevo.setText("Nuevo");
            jbModificar.setEnabled(true);           
            jTable1.setEnabled(true);
            jTable1.setVisible(true);
            jbNuevo.requestFocusInWindow();
                                       
            }else{
                   JOptionPane.showMessageDialog(this,
                           "IDya registrado","Confirmación",
                           JOptionPane.ERROR_MESSAGE); 
                   txtID.requestFocusInWindow();
                }
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        if(jbModificar.getText().equalsIgnoreCase("Modificar")){
            if(jTable1.getSelectedRow() == -1){
               if(jTable1.getRowCount() == 0){
                   JOptionPane.showMessageDialog(this,"No hay registros");
               }else{
                   JOptionPane.showMessageDialog(this,"Seleccione una fila");
               }
            }else{    
                
            jbNuevo.setEnabled(false);
            
            txtPeliculaID.setEnabled(true);   
            jcTienda.setEnabled(true);
            jcDisponible.setEnabled(true);
            
            jbBorrar.setEnabled(false);
            
            jbModificar.setText("Actualizar");
                        
            jbCancelar.setEnabled(true);
           
             }
        }else {
            
            jbNuevo.setEnabled(true);
            txtPeliculaID.setEnabled(false);
            jcTienda.setEnabled(false);
            jcDisponible.setEnabled(false);
            
            
            jbModificar.setText("Modificar");
            jbModificar.setEnabled(true);
            jbBorrar.setEnabled(true);  
                                             
            jbCancelar.setEnabled(false);
            jTable1.setEnabled(true);
             
            //Se crea el objeto Pais
             Inventario i = new Inventario();             
             //Se configura los datos en el objeto pais de la clase
             //Pais
             
             i.setID(Integer.parseInt(txtID.getText()));
             try{
             i.setPeliculaID(Integer.parseInt(txtPeliculaID.getText()));                
             i.setTiendaID(Integer.parseInt(jcTienda.getSelectedItem().toString()));
             
             }catch (NumberFormatException e){}
             i.setDisponible(jcDisponible.getSelectedItem().toString());            
             
                         
             if(ControladorInventario.modificarInventario(i) == 1){
                 JOptionPane.showMessageDialog(this,"Actualización exitosa");
                 this.cargarInventarios("0");
             } else {
                 JOptionPane.showMessageDialog(this,"Actualización Fallida");
             }
             
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void cargarTiendasCombo(){
         ArrayList<Tienda> listaTiendas = new ArrayList();
          listaTiendas=ControladorTienda.listadoTiendas("0");
                    
          for(int i=0;i<listaTiendas.size();i++){
              jcTienda.addItem(listaTiendas.get(i).getID()+"");
                            
          }
        
    }
    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        // TODO add your handling code here:
        if(txtID.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, 
                    "Por favor seleccione un inventario","Error", 
                    JOptionPane.ERROR_MESSAGE);
        }else{
            int respuesta = JOptionPane.showConfirmDialog(this,
                    "¿Desea Eliminar inventario con el codigo : " +
                            txtID.getText().trim()+
                    " ?", "Confirmación de Acción", JOptionPane.YES_NO_OPTION);
            if(respuesta == JOptionPane.YES_OPTION){
                String codigo = "";
                codigo  = txtID.getText().trim();
                
                if(ControladorInventario.borrarInventario(codigo) == 1){
                    JOptionPane.showMessageDialog(this, 
                            "Registro Borrado con éxtio", 
                            "Confirmación de acción", 
                            JOptionPane.INFORMATION_MESSAGE);                    
                    cargarInventarios("0");
                }
                else{
                    JOptionPane.showMessageDialog(this, 
                            "Error al borrar", "Confirmación de acción", 
                            JOptionPane.ERROR_MESSAGE);                    
                }
            }
        }
        
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        txtPeliculaID.setEnabled(false);
        jcTienda.setEnabled(false);
        jcDisponible.setEnabled(false);
        
        
        
        jbNuevo.setEnabled(true);
        jbRegistrar.setEnabled(false);
        jbModificar.setText("Modificar");
        jbCancelar.setEnabled(false);
        jTable1.setEnabled(true);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==-1){
            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"No hay registros");
            }
            else{
                JOptionPane.showMessageDialog(this,"Seleccione una fila");
            }
        }else {
                                  
            txtID.setText(modelo.getValueAt(
                    jTable1.getSelectedRow(), 0).toString());            
            txtPeliculaID.setText(modelo.getValueAt(
                    jTable1.getSelectedRow(), 1).toString());
           
           jcTienda.setSelectedItem(modelo.getValueAt(jTable1.getSelectedRow(),2).toString());
            
            jcDisponible.setSelectedItem(modelo.getValueAt(jTable1.getSelectedRow(),3).toString());
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    
    
    
    

    private void cargarInventarios(String c){    
        //traer el listado de peliculas  
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable1.getModel();
        ArrayList<Inventario> listadoInventario = new ArrayList();        
        listadoInventario = ControladorInventario.listadoInventariosTienda(c);  
        limpiarTabla();
        String titulo;
        for(int i= 0; i < listadoInventario.size(); i++){  
              //titulo=nombrePeliculas(listadoInventario.get(i).getPeliculaID()+"");
              modelo.addRow(new Object[]{
              listadoInventario.get(i).getID(),
              listadoInventario.get(i).getPeliculaID(),
              listadoInventario.get(i).getTiendaID(),
              listadoInventario.get(i).getDisponible()
              });
              
             
        }
    }
    
    private void limpiarTabla(){
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable1.getModel();
        for(int i=modelo.getRowCount()-1; i>=0 ; i--){
            modelo.removeRow(i);
        }
    }
    public String nombrePeliculas(String c){
        ArrayList<Pelicula> listadoPeliculas = new ArrayList();        
        listadoPeliculas = ControladorPelicula.listadoPeliculas(c);  
        
        
        return listadoPeliculas.get(0).getTitulo();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JComboBox<String> jcDisponible;
    private javax.swing.JComboBox<String> jcTienda;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPeliculaID;
    // End of variables declaration//GEN-END:variables
}