/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControladorActor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Actor;

/**
 *
 * @author user
 */
public class VModificarActores extends javax.swing.JInternalFrame {

    /**
     * Creates new form VModificarActores
     */
    public VModificarActores() {
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
        jlNombre = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
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
        setTitle("Actores");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Infomracion"));

        jlID.setText("ID:");

        jlNombre.setText("Nombre:");

        jlApellido.setText("Apellido:");

        txtID.setEnabled(false);

        txtNombre.setEnabled(false);

        txtApellido.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlID)
                    .addComponent(jlNombre)
                    .addComponent(jlApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jbModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCancelar)
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido"
            }
        ));
        cargarActores();
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRow() == -1) {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No hay registros");
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una fila");
            }
        } else {

            txtID.setText(modelo.getValueAt(
                    jTable1.getSelectedRow(), 0).toString());
            txtNombre.setText(modelo.getValueAt(
                    jTable1.getSelectedRow(), 1).toString());
            txtApellido.setText(modelo.getValueAt(jTable1.getSelectedRow(),2).toString());

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        txtID.setText("");            
        txtNombre.setText("");
        txtApellido.setText("");
        
        if(jbNuevo.getText().equals("Nuevo")){
            jbRegistrar.setEnabled(true);
            txtID.setEnabled(true);
            txtNombre.setEnabled(true);
            txtApellido.setEnabled(true);
            
            jbModificar.setEnabled(false);
            jbNuevo.setText("Cancelar");
            jbBorrar.setEnabled(false);
            
            jTable1.setVisible(false);
            txtID.requestFocusInWindow();
        }else{
            jbRegistrar.setEnabled(false);
            txtID.setEnabled(false);
            txtNombre.setEnabled(false);
            txtApellido.setEnabled(false);
            
            jbNuevo.setText("Nuevo");
            jbModificar.setEnabled(true);
            jbBorrar.setEnabled(true);            
            jTable1.setVisible(true);
            jTable1.setEnabled(true);
            jbNuevo.requestFocusInWindow();
           
        }
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        // TODO add your handling code here:
        if(txtID.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"Ingrese el ID del Actor");}
        else{
            Actor actor =new Actor();            
            actor.setID(Integer.parseInt(txtID.getText()));
            actor.setNombre(txtNombre.getText());
            actor.setApellido(txtApellido.getText());
            int tamaño;
            
            tamaño=ControladorActor.listadoActores(actor.getID()+"").size();
            
              if(tamaño==0){
                int resultado = 0;
                    resultado = ControladorActor.grabarActor(actor);
                    if(resultado == 1){
                        JOptionPane.showMessageDialog(this,
                                "Registro Grabado con éxito",
                                "Confirmación",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Error al grabar",
                                "Confirmación",JOptionPane.ERROR_MESSAGE);
                    }

                    cargarActores();

            jbRegistrar.setEnabled(false);
            txtID.setEnabled(false);
            txtNombre.setEnabled(false); 
            txtApellido.setEnabled(false); 
            jbNuevo.setText("Nuevo");
            jbModificar.setEnabled(true);
            jbBorrar.setEnabled(true);   
            jTable1.setEnabled(true);
            jbNuevo.requestFocusInWindow();
                                       
            }else{
                   JOptionPane.showMessageDialog(this,
                           "ID ya registrado","Confirmación",
                           JOptionPane.ERROR_MESSAGE); 
                   txtID.requestFocusInWindow();
                }
            
        }
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        if(jbModificar.getText().equalsIgnoreCase("Modificar")){
            if(jTable1.getSelectedRow() == -1){
               if(jTable1.getRowCount() == 0){
                   JOptionPane.showMessageDialog(this,"No hay registros");
               }
               else{
                   JOptionPane.showMessageDialog(this,"Seleccione una fila");
               }
               } else{        
               txtNombre.setEnabled(true); 
               txtApellido.setEnabled(true);
               jbBorrar.setEnabled(false);
               jbNuevo.setEnabled(false);
               jbRegistrar.setEnabled(false);
               jbModificar.setText("Actualizar");
               jbCancelar.setEnabled(true);
               jTable1.setEnabled(false);
           }} else {
            
             txtNombre.setEnabled(false);  
             txtApellido.setEnabled(false);
             jbBorrar.setEnabled(true);
             jbNuevo.setEnabled(true);
             jbRegistrar.setEnabled(false);
             jbModificar.setText("Modificar");
             jbCancelar.setEnabled(false);
             jTable1.setEnabled(true);
             
            //Se crea el objeto categoria 
             Actor actor = new Actor();
             //Se configura los datos en el objeto programa de la clase
             //Programa
             actor.setID(Integer.parseInt(txtID.getText()));
             actor.setNombre(txtNombre.getText());                                        
             actor.setApellido(txtApellido.getText());
                         
             if(ControladorActor.modificarActor(actor) == 1){
                 JOptionPane.showMessageDialog(this,"Actualización exitosa");
                 this.cargarActores();
             } else {
                 JOptionPane.showMessageDialog(this,"Actualización Fallida");
             }
             
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        // TODO add your handling code here:
        if(txtID.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, 
                    "Por favor seleccione un Actor","Error", 
                    JOptionPane.ERROR_MESSAGE);
        }else{
            int respuesta = JOptionPane.showConfirmDialog(this,
                    "¿Desea Eliminar el Actor con el codigo : " +
                            txtID.getText().trim()+
                    " ?", "Confirmación de Acción", JOptionPane.YES_NO_OPTION);
            if(respuesta == JOptionPane.YES_OPTION){
                String codigo = "";
                codigo  = txtID.getText().trim();
                
                if(ControladorActor.borrarActor(codigo) == 1){
                    JOptionPane.showMessageDialog(this, 
                            "Registro Borrado con éxtio", 
                            "Confirmación de acción", 
                            JOptionPane.INFORMATION_MESSAGE);                    
                    cargarActores();
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
        txtNombre.setEnabled(false);  
        txtApellido.setEnabled(false);
                
        jbBorrar.setEnabled(true);
        jbNuevo.setEnabled(true);
        jbRegistrar.setEnabled(false);
        jbModificar.setText("Modificar");
        jbCancelar.setEnabled(false);
        jTable1.setEnabled(true);
    }//GEN-LAST:event_jbCancelarActionPerformed

    
    
    
    private void cargarActores() {
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable1.getModel();
        ArrayList<Actor> listadoActores = new ArrayList();
        listadoActores = ControladorActor.listadoActores("0");
        for (int i = 0; i < listadoActores.size(); i++) {
            modelo.addRow(new Object[]{
                listadoActores.get(i).getID(),
                listadoActores.get(i).getNombre(),
                listadoActores.get(i).getApellido()});            
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
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
