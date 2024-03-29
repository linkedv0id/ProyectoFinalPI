/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControladorCiudad;
import control.ControladorPais;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Ciudad;
import modelo.Pais;

/**
 *
 * @author user
 */
public class VModificarCiudad extends javax.swing.JInternalFrame {

    /**
     * Creates new form VModificarCiudad
     */
    public VModificarCiudad() {
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
        jlCiudad = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jlPais = new javax.swing.JLabel();
        jcPais = new javax.swing.JComboBox();
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
        setTitle("Gestionar Ciudades");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion:"));

        jlCiudad.setText("Ciudad:");

        txtCiudad.setEnabled(false);

        jLabel1.setText("ID Ciudad:");

        txtID.setEnabled(false);

        jlPais.setText("Pais:");

        jcPais.setEnabled(false);
        jcPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        cargarPaisesCombo();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCiudad)
                    .addComponent(jLabel1)
                    .addComponent(jlPais))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCiudad)
                    .addComponent(txtID)
                    .addComponent(jcPais, 0, 105, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCiudad))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPais)
                    .addComponent(jcPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Controles"));

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbRegistrar.setEnabled(false);
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

        jbCancelar.setEnabled(false);
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
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbRegistrar)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jbBorrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jbCancelar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jbNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancelar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ciudad", "Pais ID"
            }
        ));
        cargarCiudades();
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
            txtCiudad.setText(modelo.getValueAt(
                    jTable1.getSelectedRow(), 1).toString());
            jcPais.setSelectedIndex(Integer.parseInt(modelo.getValueAt(jTable1.getSelectedRow(), 2).toString()));
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        txtID.setText("");  
        txtCiudad.setText("");
        jcPais.setSelectedIndex(0);
        
        if(jbNuevo.getText().equals("Nuevo")){
            jbRegistrar.setEnabled(true);
            txtID.setEnabled(true);
            txtCiudad.setEnabled(true);            
            jcPais.setEnabled(true);           
            jbModificar.setEnabled(false);
            jbNuevo.setText("Cancelar");
            jbBorrar.setEnabled(false);
            jTable1.setEnabled(false);
            jTable1.setVisible(false);
            txtID.requestFocusInWindow();
        }
        else{
            jbRegistrar.setEnabled(false);
            txtID.setEnabled(false);
            txtCiudad.setEnabled(false);                      
            jcPais.setEnabled(false);             
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
        if(txtID.getText().trim().equals(""))
            JOptionPane.showMessageDialog(this,"Ingrese el ID de la Pelicula");
        else{
            if (jcPais.getSelectedItem().toString().trim().
                    equals("Seleccionar") ){
                JOptionPane.showMessageDialog(this,"Seleccione Pais");
                jcPais.requestFocusInWindow(); }               
            else {
                Ciudad ciudad= new Ciudad();
                ciudad.setID(Integer.parseInt(txtID.getText()));
                ciudad.setCiudad(txtCiudad.getText());                
                ciudad.setPaisID(jcPais.getSelectedIndex());
                
                
                int tamaño;
                tamaño=ControladorCiudad.listadoCiudades(ciudad.getID()+"").size();
                
                if(tamaño==0){
                int resultado = 0;
                    resultado = ControladorCiudad.grabarCiudad(ciudad);
                    if(resultado == 1){
                        JOptionPane.showMessageDialog(this,
                                "Registro Grabado con éxito",
                                "Confirmación",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Error al grabar",
                                "Confirmación",JOptionPane.ERROR_MESSAGE);
                    }

                    cargarCiudades();

            jbRegistrar.setEnabled(false);
            txtID.setEnabled(false);
            txtCiudad.setEnabled(false);                      
            jcPais.setEnabled(false);             
            jbNuevo.setText("Nuevo");
            jbModificar.setEnabled(true);
            jbBorrar.setEnabled(true);
            jTable1.setEnabled(true);
            jTable1.setVisible(true);
            jbNuevo.requestFocusInWindow();
                                       
            }else{
                   JOptionPane.showMessageDialog(this,
                           "IDya registrado","Confirmación",
                           JOptionPane.ERROR_MESSAGE); 
                   txtID.requestFocusInWindow();
                }
                
          
            }
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
            txtCiudad.setEnabled(true);            
            jcPais.setEnabled(true);                      
            jbModificar.setText("Actualizar");
            jbBorrar.setEnabled(false);            
            jbCancelar.setEnabled(true);
           
             }
        }else {
            
            jbNuevo.setEnabled(true);
            txtCiudad.setEnabled(false);                      
            jcPais.setEnabled(false);             
            jbModificar.setText("Modificar");
            jbModificar.setEnabled(true);
            jbBorrar.setEnabled(true);                                 
            jbCancelar.setEnabled(false);
            jTable1.setEnabled(true);
             
            //Se crea el objeto Ciudad
             Ciudad ciudad = new Ciudad();
             
             //Se configura los datos en el objeto programa de la clase
             //Ciudad
             ciudad.setID(Integer.parseInt(txtID.getText()));
             ciudad.setCiudad(txtCiudad.getText());  
             ciudad.setPaisID(jcPais.getSelectedIndex());            
             
                         
             if(ControladorCiudad.modificarCiudad(ciudad) == 1){
                 JOptionPane.showMessageDialog(this,"Actualización exitosa");
                 this.cargarCiudades();
             } else {
                 JOptionPane.showMessageDialog(this,"Actualización Fallida");
             }
             
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        // TODO add your handling code here:
        if(txtID.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, 
                    "Por favor seleccione una Ciudad","Error", 
                    JOptionPane.ERROR_MESSAGE);
        }else{
            int respuesta = JOptionPane.showConfirmDialog(this,
                    "¿Desea Eliminar la Ciudad con el codigo : " +
                            txtID.getText().trim()+
                    " ?", "Confirmación de Acción", JOptionPane.YES_NO_OPTION);
            if(respuesta == JOptionPane.YES_OPTION){
                String codigo = "";
                codigo  = txtID.getText().trim();
                
                if(ControladorCiudad.borrarCiudad(codigo) == 1){
                    JOptionPane.showMessageDialog(this, 
                            "Registro Borrado con éxtio", 
                            "Confirmación de acción", 
                            JOptionPane.INFORMATION_MESSAGE);                    
                    cargarCiudades();
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
        txtID.setEnabled(false);
        txtCiudad.setEnabled(false);                  
        jcPais.setEnabled(false);             
        jbBorrar.setEnabled(true);
        jbNuevo.setEnabled(true);
        jbRegistrar.setEnabled(false);
        jbModificar.setText("Modificar");
        jbCancelar.setEnabled(false);
        jTable1.setEnabled(true);
    }//GEN-LAST:event_jbCancelarActionPerformed

     private void cargarCiudades(){
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable1.getModel();
        ArrayList <Ciudad> listadoClientes =new ArrayList();
        listadoClientes=ControladorCiudad.listadoCiudades("0");
        for(int i= 0; i < listadoClientes.size(); i++){                       
              modelo.addRow(new Object[]{
              listadoClientes.get(i).getID(),
              listadoClientes.get(i).getCiudad(),
              listadoClientes.get(i).getPaisID(),              
                 
              });
        }    
    }
      private void cargarPaisesCombo(){
         ArrayList<Pais> listaPaises = new ArrayList();
          listaPaises=ControladorPais.listadoPaises("0");
                    
          for(int i=0;i<listaPaises.size();i++){
              jcPais.addItem(listaPaises.get(i).getPais());
                            
          }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JComboBox jcPais;
    private javax.swing.JLabel jlCiudad;
    private javax.swing.JLabel jlPais;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
