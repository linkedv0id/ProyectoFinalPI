/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControladorCiudad;
import control.ControladorDireccion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Ciudad;
import modelo.Direccion;

/**
 *
 * @author user
 */
public class VModificarDireccion extends javax.swing.JInternalFrame {
    int direccionID;

    /**
     * Creates new form VModificarDireccion
     */
    public VModificarDireccion() {
        direccionID=0;
        initComponents();
    }
    public int getDireccionID(){
        return direccionID;
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
        jlID = new javax.swing.JLabel();
        jlDireccion = new javax.swing.JLabel();
        jlDIreccion2 = new javax.swing.JLabel();
        jlDistrito = new javax.swing.JLabel();
        jlCiudad = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jlTelefono = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtDireccion2 = new javax.swing.JTextField();
        txtDistrito = new javax.swing.JTextField();
        jcCiudad = new javax.swing.JComboBox();
        txtCodigo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbNuevo = new javax.swing.JButton();
        jbRegistrar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Direcciones");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos:"));

        jlID.setText("ID:");

        jlDireccion.setText("Direccion:");

        jlDIreccion2.setText("Direccion2:");

        jlDistrito.setText("Distrito:");

        jlCiudad.setText("Ciudad:");

        jlCodigo.setText("Codigo Postal:");

        jlTelefono.setText("Telefono:");

        txtID.setEnabled(false);

        txtDireccion.setEnabled(false);

        txtDireccion2.setEnabled(false);

        txtDistrito.setEnabled(false);

        jcCiudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        jcCiudad.setEnabled(false);
        cargarCiudadesCombo();

        txtCodigo.setEnabled(false);

        txtTelefono.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlID)
                    .addComponent(jlDireccion)
                    .addComponent(jlDIreccion2)
                    .addComponent(jlDistrito)
                    .addComponent(jlCiudad)
                    .addComponent(jlCodigo)
                    .addComponent(jlTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID)
                    .addComponent(txtDireccion)
                    .addComponent(txtDireccion2)
                    .addComponent(txtDistrito)
                    .addComponent(jcCiudad, 0, 99, Short.MAX_VALUE)
                    .addComponent(txtCodigo)
                    .addComponent(txtTelefono))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDIreccion2)
                    .addComponent(txtDireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDistrito)
                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCiudad)
                    .addComponent(jcCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Controles:"));
        jPanel2.setToolTipText("");

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbRegistrar.setText("Registrar");
        jbRegistrar.setEnabled(false);
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

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jbNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Direccion", "Direccion2", "Distrito","Ciudad","Codigo Postal","Telefono"
            }
        ));
        cargarDireccionesTabla();
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            txtDireccion.setText(modelo.getValueAt(
                    jTable1.getSelectedRow(), 1).toString());
           try{
           txtDireccion.setText(modelo.getValueAt(jTable1.getSelectedRow(),2).toString());
            }catch (NullPointerException e){ txtDireccion.setText("");}
            txtDistrito.setText(modelo.getValueAt(jTable1.getSelectedRow(),3).toString());
            jcCiudad.setSelectedIndex(Integer.parseInt(modelo.getValueAt(jTable1.getSelectedRow(), 4).toString()));
            txtCodigo.setText(modelo.getValueAt(jTable1.getSelectedRow(), 5).toString());
            txtTelefono.setText(modelo.getValueAt(jTable1.getSelectedRow(),6).toString());
            
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        ArrayList<Direccion> listaDirecciones = new ArrayList();
        listaDirecciones=ControladorDireccion.listadoDirecciones("0");
        txtID.setText(listaDirecciones.get(listaDirecciones.size()-1).getID()+1+"");  
        txtDireccion.setText("");
        txtDireccion2.setText("");
        txtDistrito.setText("");
        jcCiudad.setSelectedIndex(0);
        txtCodigo.setText("");
        txtTelefono.setText("");
        
        if(jbNuevo.getText().equals("Nuevo")){
            jbRegistrar.setEnabled(true);
            txtDireccion.setEnabled(true);
            txtDireccion2.setEnabled(true);
            txtDistrito.setEnabled(true);
            jcCiudad.setEnabled(true);   
            txtCodigo.setEnabled(true);
            txtTelefono.setEnabled(true);
            
            jbBorrar.setEnabled(false);
            jbModificar.setEnabled(false);
            jbNuevo.setText("Cancelar");           
            jTable1.setEnabled(false);
            jTable1.setVisible(false);
            txtID.requestFocusInWindow();
        }
        else{
            jbRegistrar.setEnabled(false);
            txtDireccion.setEnabled(false);
            txtDireccion2.setEnabled(false);                      
            txtDistrito.setEnabled(false);
            jcCiudad.setEnabled(false);  
            txtCodigo.setEnabled(false);
            txtTelefono.setEnabled(false);
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
                Direccion direccion= new Direccion();
                direccion.setID(Integer.parseInt(txtID.getText()));
                direccion.setDireccion(txtDireccion.getText());                
                direccion.setDireccion2(txtDireccion2.getText());
                direccion.setDistrito(txtDistrito.getText());
                direccion.setCiudadID(jcCiudad.getSelectedIndex());
                direccion.setCodigoPostal(txtCodigo.getText());
                direccion.setTelefono(txtTelefono.getText());               
                
                int tamaño;
                tamaño=ControladorDireccion.listadoDirecciones(direccion.getID()+"").size();
                
                if(tamaño==0){
                int resultado = 0;
                    resultado = ControladorDireccion.grabarDireccion(direccion);
                    if(resultado == 1){
                        JOptionPane.showMessageDialog(this,
                                "Registro Grabado con éxito",
                                "Confirmación",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Error al grabar",
                                "Confirmación",JOptionPane.ERROR_MESSAGE);
                    }

                    cargarDireccionesTabla();

            jbRegistrar.setEnabled(false);           
            txtDireccion.setEnabled(false); 
            txtDireccion2.setEnabled(false);
            txtDistrito.setEnabled(false);
            jcCiudad.setEnabled(false);
            txtCodigo.setEnabled(false);
            txtTelefono.setEnabled(false);
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
            
            txtDireccion.setEnabled(true);   
            txtDireccion2.setEnabled(true);
            txtDistrito.setEnabled(true);
            jcCiudad.setEnabled(true);   
            txtCodigo.setEnabled(true);
            txtTelefono.setEnabled(true);
            jbBorrar.setEnabled(false);
            
            jbModificar.setText("Actualizar");
                        
            jbCancelar.setEnabled(true);
           
             }
        }else {
            
            jbNuevo.setEnabled(true);
            txtDireccion.setEnabled(false);
            txtDireccion2.setEnabled(false);
            txtDistrito.setEnabled(false);
            jcCiudad.setEnabled(false);   
            txtCodigo.setEnabled(false);
            txtTelefono.setEnabled(false);
            
            
            
            jbModificar.setText("Modificar");
            jbModificar.setEnabled(true);
            jbBorrar.setEnabled(true);  
                                             
            jbCancelar.setEnabled(false);
            jTable1.setEnabled(true);
             
            //Se crea el objeto Pais
             Direccion direccion = new Direccion();             
             //Se configura los datos en el objeto pais de la clase
             //Pais
             
             direccion.setID(Integer.parseInt(txtID.getText()));
             direccion.setDireccion(txtDireccion.getText());
             direccion.setDireccion2(txtDireccion2.getText());
             direccion.setDistrito(txtDistrito.getText());
             direccion.setCiudadID(jcCiudad.getSelectedIndex());
             direccion.setCodigoPostal(txtCodigo.getText());
             direccion.setTelefono(txtTelefono.getText());
                         
             
                         
             if(ControladorDireccion.modificarDireccion(direccion) == 1){
                 JOptionPane.showMessageDialog(this,"Actualización exitosa");
                 this.cargarDireccionesTabla();
             } else {
                 JOptionPane.showMessageDialog(this,"Actualización Fallida");
             }
             
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        txtDireccion.setEnabled(false);
        txtDireccion2.setEnabled(false);
        txtDistrito.setEnabled(false);
        jcCiudad.setEnabled(false);   
        txtCodigo.setEnabled(false);
        txtTelefono.setEnabled(false);
        
        
        jbNuevo.setEnabled(true);
        jbRegistrar.setEnabled(false);
        jbModificar.setText("Modificar");
        jbCancelar.setEnabled(false);
        jTable1.setEnabled(true);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        // TODO add your handling code here:
        if(txtID.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, 
                    "Por favor seleccione un Pais","Error", 
                    JOptionPane.ERROR_MESSAGE);
        }else{
            int respuesta = JOptionPane.showConfirmDialog(this,
                    "¿Desea Eliminar el Pais con el codigo : " +
                            txtID.getText().trim()+
                    " ?", "Confirmación de Acción", JOptionPane.YES_NO_OPTION);
            if(respuesta == JOptionPane.YES_OPTION){
                String codigo = "";
                codigo  = txtID.getText().trim();
                
                if(ControladorDireccion.borrarDireccion(codigo) == 1){
                    JOptionPane.showMessageDialog(this, 
                            "Registro Borrado con éxtio", 
                            "Confirmación de acción", 
                            JOptionPane.INFORMATION_MESSAGE);                    
                    cargarDireccionesTabla();
                }
                else{
                    JOptionPane.showMessageDialog(this, 
                            "Error al borrar", "Confirmación de acción", 
                            JOptionPane.ERROR_MESSAGE);                    
                }
            }
        }
    }//GEN-LAST:event_jbBorrarActionPerformed

    
    
    
   private void cargarCiudadesCombo(){
        ArrayList<Ciudad> listaCiudades = new ArrayList();
          listaCiudades=ControladorCiudad.listadoCiudades("0");
                    
          for(int i=0;i<listaCiudades.size();i++){
              jcCiudad.addItem(listaCiudades.get(i).getCiudad());
               
          }
   }
   
   private void cargarDireccionesTabla(){
        limpiarTabla();
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable1.getModel();
        ArrayList<Direccion> listadoDirecciones = new ArrayList();        
        listadoDirecciones = ControladorDireccion.listadoDirecciones("0");         
        for(int i= 0; i < listadoDirecciones.size(); i++){                       
              modelo.addRow(new Object[]{
              listadoDirecciones.get(i).getID(),
              listadoDirecciones.get(i).getDireccion(),
              listadoDirecciones.get(i).getDireccion2(),
              listadoDirecciones.get(i).getDistrito(),
              listadoDirecciones.get(i).getCiudadID(),
              listadoDirecciones.get(i).getCodigoPostal(),
              listadoDirecciones.get(i).getTelefono()
              
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
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JComboBox jcCiudad;
    private javax.swing.JLabel jlCiudad;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlDIreccion2;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlDistrito;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccion2;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}