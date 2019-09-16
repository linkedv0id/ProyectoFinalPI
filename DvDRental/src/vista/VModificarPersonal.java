/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControladorPersonal;
import control.ControladorTienda;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.Personal;
import modelo.Tienda;

/**
 *
 * @author user
 */
public class VModificarPersonal extends javax.swing.JInternalFrame {
     File foto = null;
    /** 
     * Creates new form VModificarPersonal
     */
    public VModificarPersonal() {
        initComponents();
    }
     public void setFoto(File foto){
        this.foto = foto;
    }
    
    public File getFoto(){
        return foto;
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
        txtDireccionID = new javax.swing.JTextField();
        jbDireccion = new javax.swing.JButton();
        jlEmail = new javax.swing.JLabel();
        jlDireccion = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jlTienda = new javax.swing.JLabel();
        jlNombreUsuario = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jlContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jcTienda = new javax.swing.JComboBox();
        jcActivado = new javax.swing.JComboBox();
        jlActivado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbFoto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbNuevo = new javax.swing.JButton();
        jbRegistrar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Personal de la Tienda");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado:"));

        jlID.setText("ID:");

        jlNombre.setText("Nombre:");

        jlApellido.setText("Apellido:");

        txtID.setEnabled(false);

        txtNombre.setEnabled(false);

        txtApellido.setEnabled(false);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtDireccionID.setEnabled(false);

        jbDireccion.setText("Seleccionar");
        jbDireccion.setEnabled(false);

        jlEmail.setText("Email:");

        jlDireccion.setText("Direccion ID:");

        txtEmail.setEnabled(false);

        jlTienda.setText("Tienda ID:");

        jlNombreUsuario.setText("Nombre de Usuario:");

        txtNombreUsuario.setEnabled(false);

        jlContraseña.setText("Contraseña:");

        txtContraseña.setEnabled(false);

        jcTienda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        jcTienda.setEnabled(false);
        cargarTiendasCombo();
        jcTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTiendaActionPerformed(evt);
            }
        });

        jcActivado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar","true","false" }));
        jcActivado.setEnabled(false);

        jlActivado.setText("Activado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlID)
                    .addComponent(jlNombre)
                    .addComponent(jlApellido)
                    .addComponent(jlDireccion)
                    .addComponent(jlEmail)
                    .addComponent(jlTienda)
                    .addComponent(jlNombreUsuario)
                    .addComponent(jlContraseña)
                    .addComponent(jlActivado))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcActivado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDireccionID, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbDireccion))
                    .addComponent(txtID)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido)
                    .addComponent(txtEmail)
                    .addComponent(txtNombreUsuario)
                    .addComponent(jcTienda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
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
                    .addComponent(jlNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDireccion)
                    .addComponent(jlDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTienda)
                    .addComponent(jcTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcActivado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlActivado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNombreUsuario)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlContraseña)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));

        jbFoto.setText("Seleccionar");
        jbFoto.setEnabled(false);
        jbFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFotoActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jbFoto)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbFoto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Controles"));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jbNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbRegistrar)
                .addGap(85, 85, 85)
                .addComponent(jbModificar)
                .addGap(98, 98, 98)
                .addComponent(jbCancelar)
                .addGap(136, 136, 136))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbRegistrar)
                    .addComponent(jbModificar)
                    .addComponent(jbCancelar))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "DireccionID","Email","TiendaID","Activado","Nombre Usuario","Contraseña"
            }
        ));
        cargarEmpleadosTabla();
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void jbFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFotoActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filtro = 
                new FileNameExtensionFilter("Imagenes", "png", "jpg", "jpeg", "gif");
        fileChooser.setFileFilter(filtro);
               
        int seleccion= fileChooser.showOpenDialog(this);
        
        if(seleccion != JFileChooser.CANCEL_OPTION){
            File archivo = fileChooser.getSelectedFile();
           
            
            Image img = new ImageIcon(archivo.getPath()).getImage();
            ImageIcon imagen = new ImageIcon(
                    img.getScaledInstance(227, 277, Image.SCALE_SMOOTH));            
            jLabel1.setIcon(imagen);   
            this.setFoto(archivo);
        }
    }//GEN-LAST:event_jbFotoActionPerformed

    private void cargarTiendasCombo(){
         ArrayList<Tienda> listaTiendas = new ArrayList();
          listaTiendas=ControladorTienda.listadoTiendas("0");
                    
          for(int i=0;i<listaTiendas.size();i++){
              jcTienda.addItem(listaTiendas.get(i).getID());
                            
          }
        
    }
    
    
    private void jcTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcTiendaActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        txtID.setText("");            
        txtNombre.setText("");
        txtApellido.setText("");  
        txtEmail.setText("");
        txtDireccionID.setText("");
        jcTienda.setSelectedIndex(0);
        jcActivado.setSelectedIndex(0);
        txtNombreUsuario.setText("");
        txtContraseña.setText("");
        jbDireccion.setEnabled(true);
        
        if(jbNuevo.getText().equals("Nuevo")){
            jbRegistrar.setEnabled(true);
            
            txtNombre.setEnabled(true);
            txtApellido.setEnabled(true);
            txtEmail.setEnabled(true);
            jcTienda.setEnabled(true);
            jcActivado.setEnabled(true);
            txtNombreUsuario.setEnabled(true);
            txtContraseña.setEnabled(true);
            
            //txtClasificacion.setEnabled(true);
            //txtEspecial.setEnabled(true);
            //txtFull.setEnabled(true);
            jbModificar.setEnabled(false);
            jbNuevo.setText("Cancelar");            
            jTable1.setEnabled(false);
            jTable1.setVisible(false);
            txtID.requestFocusInWindow();
            jbFoto.setEnabled(true);
        }
        else{
            jbRegistrar.setEnabled(false);
            
            txtNombre.setEnabled(false);
            txtApellido.setEnabled(false);
            jbDireccion.setEnabled(false);           
            jcTienda.setEnabled(false); 
            jcActivado.setEnabled(false);
            txtEmail.setEnabled(false);
            txtNombreUsuario.setEnabled(false);
            txtContraseña.setEnabled(false);
            jbFoto.setEnabled(false);
            
            jbNuevo.setText("Nuevo");
            jbModificar.setEnabled(true);            
            jTable1.setEnabled(true);
            jTable1.setVisible(true);
            jbNuevo.requestFocusInWindow();
        }
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        // TODO add your handling code here:
        if (jcTienda.getSelectedItem().toString().trim().
                    equals("Seleccionar") || jcActivado.getSelectedItem().toString().trim().equals("seleccionar")){
                JOptionPane.showMessageDialog(this,"Seleccione Duracion Tienda y Valor de activo ");
                 }               
            else {
            
            Personal personal=new Personal();
            personal.setID(Integer.parseInt(txtID.getText()));
            personal.setNombre(txtNombre.getText());
            personal.setApellido(txtApellido.getText());
            personal.setDireccionID(Integer.parseInt(txtDireccionID.getText()));
            personal.setEmail(txtEmail.getText());
            personal.setTiendaID(jcTienda.getSelectedIndex());
            personal.setActivado(Boolean.parseBoolean(jcActivado.getSelectedItem().toString()));
            personal.setNombreUsuario(txtNombreUsuario.getText());
            personal.setContraseña(txtContraseña.getText());
            personal.setFoto(getFoto());
            
            int tamaño;
                tamaño=ControladorPersonal.listadoPersonal(personal.getID()+"").size();                
             
                
                if(tamaño==0){
                int resultado = 0;
                    resultado = ControladorPersonal.grabarPersonal(personal);
                    if(resultado == 1){
                        JOptionPane.showMessageDialog(this,
                                "Registro Grabado con éxito",
                                "Confirmación",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Error al grabar",
                                "Confirmación",JOptionPane.ERROR_MESSAGE);
                    }

                    cargarEmpleadosTabla();

            jbRegistrar.setEnabled(false);            
            txtNombre.setEnabled(false);
            txtApellido.setEnabled(false);
            txtEmail.setEnabled(false);           
            jcTienda.setEnabled(false); 
            jcActivado.setEnabled(false);
            txtNombreUsuario.setEnabled(false);
            txtContraseña.setEnabled(false);
            jbDireccion.setEnabled(false);
            jbFoto.setEnabled(false);
            
            jbNuevo.setText("Nuevo");
            jbModificar.setEnabled(true);
            
            jTable1.setEnabled(true);
            jTable1.setVisible(true);
            jbNuevo.requestFocusInWindow();
                                       
            }else{
                   JOptionPane.showMessageDialog(this,
                           "IDya registrado","Confirmación",
                           JOptionPane.ERROR_MESSAGE); 
                   
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
            txtNombre.setEnabled(true);
            txtApellido.setEnabled(true);
            txtEmail.setEnabled(true);
            jcTienda.setEnabled(true);
            jcActivado.setEnabled(true);
            txtNombreUsuario.setEnabled(true);
            txtContraseña.setEnabled(true);
            
            
            jbModificar.setText("Actualizar");
                       
            jbCancelar.setEnabled(true);
           
             }
        }else {
            
            
            jbNuevo.setEnabled(true);
            txtNombre.setEnabled(false);
            txtApellido.setEnabled(false);
            txtEmail.setEnabled(false);           
            jcTienda.setEnabled(false); 
            jcActivado.setEnabled(false);
            txtNombreUsuario.setEnabled(false);
            txtContraseña.setEnabled(false);
            
            jbModificar.setText("Modificar");
            jbModificar.setEnabled(true);
                                            
            jbCancelar.setEnabled(false);
            jTable1.setEnabled(true);
             
            //Se crea el objeto Programa 
             Personal personal = new Personal();
             
             //Se configura los datos en el objeto programa de la clase
             //Programa
             personal.setID(Integer.parseInt(txtID.getText()));
             personal.setNombre(txtNombre.getText());                                          
             personal.setApellido(txtApellido.getText());                                          
             personal.setEmail(txtEmail.getText()); 
             personal.setTiendaID(jcTienda.getSelectedIndex());
             personal.setActivado(Boolean.parseBoolean(jcActivado.getSelectedItem().toString()));
             personal.setNombreUsuario(txtNombreUsuario.getText());
             personal.setContraseña(txtContraseña.getText());
             
             
                         
             if(ControladorPersonal.modificarPersonal(personal) == 1){
                 JOptionPane.showMessageDialog(this,"Actualización exitosa");
                 this.cargarEmpleadosTabla();
             } else {
                 JOptionPane.showMessageDialog(this,"Actualización Fallida");
             }
             
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtEmail.setEnabled(false);           
        jcTienda.setEnabled(false); 
        jcActivado.setEnabled(false);
        txtNombreUsuario.setEnabled(false);
        txtContraseña.setEnabled(false);
        
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
            txtNombre.setText(modelo.getValueAt(
                    jTable1.getSelectedRow(), 1).toString());
            txtApellido.setText(modelo.getValueAt(
                    jTable1.getSelectedRow(), 2).toString());   
            txtDireccionID.setText(modelo.getValueAt(jTable1.getSelectedRow(),3).toString());
            txtEmail.setText(modelo.getValueAt(jTable1.getSelectedRow(),4).toString());
            
            jcTienda.setSelectedIndex(Integer.parseInt(modelo.getValueAt(jTable1.getSelectedRow(),5).toString()));
            jcActivado.setSelectedItem(modelo.getValueAt(jTable1.getSelectedRow(),6).toString());
            
            txtNombreUsuario.setText(modelo.getValueAt(jTable1.getSelectedRow(),7).toString());
            txtContraseña.setText(modelo.getValueAt(jTable1.getSelectedRow(),8).toString());
            
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    

    private void cargarEmpleadosTabla(){
        limpiarTabla();
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable1.getModel();
        ArrayList<Personal> listadoPersonal = new ArrayList();
        //p=new ArrayList();
        //p=Controlador.listadoPeliculas(c);
        listadoPersonal = ControladorPersonal.listadoPersonal("0");  
       //recorrer el listado y llenar cada fila
        for(int i= 0; i < listadoPersonal.size(); i++){                       
              modelo.addRow(new Object[]{
              listadoPersonal.get(i).getID(),
              listadoPersonal.get(i).getNombre(),
              listadoPersonal.get(i).getApellido(),
              listadoPersonal.get(i).getDireccionID(),
              listadoPersonal.get(i).getEmail(),
              listadoPersonal.get(i).getTiendaID(),
              listadoPersonal.get(i).getActivado(),
              listadoPersonal.get(i).getNombreUsuario(),
              listadoPersonal.get(i).getContraseña(),  
              
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbDireccion;
    private javax.swing.JButton jbFoto;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JComboBox jcActivado;
    private javax.swing.JComboBox jcTienda;
    private javax.swing.JLabel jlActivado;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlContraseña;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlTienda;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtDireccionID;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
