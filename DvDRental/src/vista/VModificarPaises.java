/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControladorPais;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Pais;

/**
 *
 * @author Cesar Solano
 */
public class VModificarPaises extends javax.swing.JInternalFrame {

    /**
     * Creates new form VModificarPaises
     */
    public VModificarPaises() {
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
        jlID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jbRegistrar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gestionar Paises");

        jlID.setText("ID Pais:");

        jLabel2.setText("Nombre Pais:");

        txtID.setEnabled(false);

        txtNombre.setEnabled(false);

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

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbCancelar.setEnabled(false);
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlID)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jbNuevo)
                .addGap(5, 5, 5)
                .addComponent(jbRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancelar)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pais", "Nombre"
            }
        ));
        cargarPaises();
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
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
            txtNombre.setText(modelo.getValueAt(
                    jTable1.getSelectedRow(), 1).toString());            
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        txtID.setText("");  
        txtNombre.setText("");
        
        
        if(jbNuevo.getText().equals("Nuevo")){
            jbRegistrar.setEnabled(true);
            txtID.setEnabled(true);
            txtNombre.setEnabled(true);        
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
            txtNombre.setEnabled(false);    
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
        if(txtID.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"Ingrese el ID de la Pelicula");
                      
        }else {
                Pais pais= new Pais();
                pais.setID(Integer.parseInt(txtID.getText()));
                pais.setPais(txtNombre.getText());                
                
                
                
                int tamaño;
                tamaño=ControladorPais.listadoPaises(pais.getID()+"").size();
                
                if(tamaño==0){
                int resultado = 0;
                    resultado = ControladorPais.grabarPais(pais);
                    if(resultado == 1){
                        JOptionPane.showMessageDialog(this,
                                "Registro Grabado con éxito",
                                "Confirmación",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Error al grabar",
                                "Confirmación",JOptionPane.ERROR_MESSAGE);
                    }

                    cargarPaises();

            jbRegistrar.setEnabled(false);
            txtID.setEnabled(false);
            txtNombre.setEnabled(false);  
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
        
    }//GEN-LAST:event_jbRegistrarActionPerformed

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
                
                if(ControladorPais.borrarPais(codigo) == 1){
                    JOptionPane.showMessageDialog(this, 
                            "Registro Borrado con éxtio", 
                            "Confirmación de acción", 
                            JOptionPane.INFORMATION_MESSAGE);                    
                    cargarPaises();
                }
                else{
                    JOptionPane.showMessageDialog(this, 
                            "Error al borrar", "Confirmación de acción", 
                            JOptionPane.ERROR_MESSAGE);                    
                }
            }
        }
        
    }//GEN-LAST:event_jbBorrarActionPerformed

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
            txtNombre.setEnabled(true);   
            jbModificar.setText("Actualizar");
            jbBorrar.setEnabled(false);            
            jbCancelar.setEnabled(true);
           
             }
        }else {
            
            jbNuevo.setEnabled(true);
            txtNombre.setEnabled(false);     
            jbModificar.setText("Modificar");
            jbModificar.setEnabled(true);
            jbBorrar.setEnabled(true);                                 
            jbCancelar.setEnabled(false);
            jTable1.setEnabled(true);
             
            //Se crea el objeto Pais
             Pais pais = new Pais();             
             //Se configura los datos en el objeto pais de la clase
             //Pais
             
             pais.setID(Integer.parseInt(txtID.getText()));
             pais.setPais(txtNombre.getText());  
                         
             
                         
             if(ControladorPais.modificarPais(pais) == 1){
                 JOptionPane.showMessageDialog(this,"Actualización exitosa");
                 this.cargarPaises();
             } else {
                 JOptionPane.showMessageDialog(this,"Actualización Fallida");
             }
             
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        txtID.setEnabled(false);
        txtNombre.setEnabled(false);  
        jbBorrar.setEnabled(true);
        jbNuevo.setEnabled(true);
        jbRegistrar.setEnabled(false);
        jbModificar.setText("Modificar");
        jbCancelar.setEnabled(false);
        jTable1.setEnabled(true);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void cargarPaises(){
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable1.getModel();
        ArrayList <Pais> listadoPaises =new ArrayList();
        listadoPaises=ControladorPais.listadoPaises("0");
        for(int i= 0; i < listadoPaises.size(); i++){                       
              modelo.addRow(new Object[]{
              listadoPaises.get(i).getID(),
              listadoPaises.get(i).getPais(),                         
                 
              });
        }    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JLabel jlID;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
