/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControladorCliente;
import control.ControladorInventario;
import control.ControladorPago;
import control.ControladorPelicula;
import control.ControladorRenta;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Inventario;
import modelo.Pago;
import modelo.Pelicula;
import modelo.Renta;

/**
 *
 * @author user
 */
public class VAlquilarPelicula extends javax.swing.JInternalFrame {
    private int tiendaID;
    private int empleadoID;
    

    /**
     * Creates new form VAlquilarPelicula
     */
    public VAlquilarPelicula(int tienda_id,int empleado_id) {
        tiendaID=tienda_id;
        empleadoID=empleado_id;
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
        jlRentaID = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jlInventario = new javax.swing.JLabel();
        jlTienda = new javax.swing.JLabel();
        jlCliente = new javax.swing.JLabel();
        jlRetorno = new javax.swing.JLabel();
        jlDias = new javax.swing.JLabel();
        txtRenta = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtInventario = new javax.swing.JTextField();
        txtTiendaID = new javax.swing.JTextField();
        txtRetorno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDisponible = new javax.swing.JTextField();
        jcCliente = new javax.swing.JComboBox();
        jcDias = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jlPago = new javax.swing.JLabel();
        jlPersonal = new javax.swing.JLabel();
        jlRenta = new javax.swing.JLabel();
        jlClienteID = new javax.swing.JLabel();
        jlValor = new javax.swing.JLabel();
        txtPagoID = new javax.swing.JTextField();
        txtPersonalID = new javax.swing.JTextField();
        txtRentaID = new javax.swing.JTextField();
        txtClienteID = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jbRegistrar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbPagar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Alquilar Pelicula");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Alquilar:"));

        jlRentaID.setText("Renta ID:");

        jlFecha.setText("Fecha:");

        jlInventario.setText("Inventario ID:");

        jlTienda.setText("Tienda ID:");

        jlCliente.setText("Cliente ID:");

        jlRetorno.setText("Fecha Retorno:");

        jlDias.setText("Dias:");

        txtRenta.setEnabled(false);

        txtFecha.setEnabled(false);

        txtInventario.setEnabled(false);
        txtInventario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInventarioKeyPressed(evt);
            }
        });

        txtTiendaID.setEnabled(false);

        txtRetorno.setEnabled(false);

        jLabel1.setText("Disponible:");

        txtDisponible.setEnabled(false);

        jcCliente.setEnabled(false);
        jcCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        jcCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcClienteItemStateChanged(evt);
            }
        });
        jcCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcClienteActionPerformed(evt);
            }
        });

        jcDias.setEnabled(false);
        jcDias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1","2","3","4","5","6","7" }));
        cargarClientesCombo();
        jcDias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcDiasItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFecha)
                    .addComponent(jlInventario)
                    .addComponent(jlTienda)
                    .addComponent(jlCliente)
                    .addComponent(jlRetorno)
                    .addComponent(jlDias)
                    .addComponent(jlRentaID)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRenta)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTiendaID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInventario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDisponible)
                            .addComponent(jcDias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRentaID)
                    .addComponent(txtRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlInventario)
                    .addComponent(txtInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTienda)
                    .addComponent(txtTiendaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCliente)
                    .addComponent(jcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlRetorno)
                    .addComponent(txtRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDias)
                    .addComponent(jcDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pago:"));

        jlPago.setText("Pago ID:");

        jlPersonal.setText("Personal ID:");

        jlRenta.setText("Renta ID:");

        jlClienteID.setText("Cliente ID:");

        jlValor.setText("Valor:");

        txtPagoID.setEnabled(false);

        txtPersonalID.setEnabled(false);

        txtRentaID.setEnabled(false);

        txtClienteID.setEnabled(false);
        txtClienteID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteIDActionPerformed(evt);
            }
        });

        txtValor.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlPago)
                        .addGap(61, 61, 61)
                        .addComponent(txtPagoID, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlValor)
                            .addComponent(jlRenta))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRentaID)
                            .addComponent(txtValor)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlPersonal)
                            .addComponent(jlClienteID))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPersonalID)
                            .addComponent(txtClienteID))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPago)
                    .addComponent(txtPagoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPersonal)
                    .addComponent(txtPersonalID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRenta)
                    .addComponent(txtRentaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlClienteID)
                    .addComponent(txtClienteID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jbRegistrar.setText("Alquilar");
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
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbPagar.setEnabled(false);
        jbPagar.setText("Pagar");
        jbPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPagarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbPagar)
                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRegistrar)
                    .addComponent(jbModificar)
                    .addComponent(jbCancelar)
                    .addComponent(jbPagar)
                    .addComponent(jbNuevo))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Renta ID", "Fecha", "Inventario ID","Cliente ID","Fecha Retorno","Personal ID"
            }
        ));
        cargarRentasTabla();
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteIDActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        ArrayList<Renta> listadoRenta = new ArrayList();        
        listadoRenta = ControladorRenta.listadoRentas("0");
        txtRenta.setText(listadoRenta.get(listadoRenta.size()-1).getID()+1+"");
        txtRentaID.setText(listadoRenta.get(listadoRenta.size()-1).getID()+1+"");
        
        
        ArrayList<Pago> listadoPagos = new ArrayList();        
        listadoPagos = ControladorPago.listadoPagos("0");
        
        txtPagoID.setText(listadoPagos.get(listadoPagos.size()-1).getID()+1+"");
        
        txtPersonalID.setText(empleadoID+"");
        txtTiendaID.setText(tiendaID+"");
        
        txtFecha.setText("");
        jcCliente.setSelectedIndex(0);
        txtInventario.setText("");
        txtRetorno.setText("");
        txtClienteID.setText("");
        txtValor.setText(""); 
        txtDisponible.setText("");
        
        
        if(jbNuevo.getText().equals("Nuevo")){
            jbRegistrar.setEnabled(true);  
            
            txtFecha.setEnabled(true);
            txtInventario.setEnabled(true);
            jcCliente.setEnabled(true);
            txtRetorno.setEnabled(true);
            jcDias.setEnabled(true);
            
            
            jbModificar.setEnabled(false);
            jbNuevo.setText("Cancelar");
            
            jTable1.setEnabled(false);
            jTable1.setVisible(false);
            txtRentaID.requestFocusInWindow();
        }
        else{
            jbRegistrar.setEnabled(false);   
            
            txtFecha.setEnabled(false);
            txtInventario.setEnabled(false);
            jcCliente.setEnabled(false);
            txtRetorno.setEnabled(false);
            jcDias.setEnabled(false);
            
            jbNuevo.setText("Nuevo");
            jbModificar.setEnabled(true);
            
            jTable1.setEnabled(true);
            jTable1.setVisible(true);
            jbNuevo.requestFocusInWindow();
        }
        
        
        
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jcClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcClienteActionPerformed

    private void jcClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcClienteItemStateChanged
        // TODO add your handling code here:
        txtClienteID.setText(jcCliente.getSelectedIndex()+"");
    }//GEN-LAST:event_jcClienteItemStateChanged

    private void txtInventarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInventarioKeyPressed
        // TODO add your handling code here:
        if(VK_ENTER==evt.getKeyCode()){
          ArrayList<Inventario> listaInventario = new ArrayList();
          listaInventario=ControladorInventario.listadoInventarios(txtInventario.getText());
          
          
          txtDisponible.setText(listaInventario.get(0).getDisponible());
          
        }
        
        
    }//GEN-LAST:event_txtInventarioKeyPressed

    private void jcDiasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcDiasItemStateChanged
        // TODO add your handling code here:
        int selec = Integer.parseInt(jcDias.getSelectedItem().toString());
        ArrayList<Inventario> listaInventario = new ArrayList();
        listaInventario=ControladorInventario.listadoInventarios(txtInventario.getText());
        
        ArrayList<Pelicula> listaPeliculas = new ArrayList();
        listaPeliculas=ControladorPelicula.listadoPeliculas(listaInventario.get(0).getPeliculaID()+"");
        
        txtValor.setText(listaPeliculas.get(0).getTasa()*selec+"");
        
        
    }//GEN-LAST:event_jcDiasItemStateChanged

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        // TODO add your handling code here:
        if(txtDisponible.getText().equals("no")){
            JOptionPane.showMessageDialog(this,
                                "Pelicula No Disponible",
                                "Confirmación",JOptionPane.INFORMATION_MESSAGE);
        }else{
        Renta renta = new Renta();
        
        renta.setID(Integer.parseInt(txtRenta.getText()));
        renta.setFecha(txtFecha.getText());
        renta.setInventarioID(Integer.parseInt(txtInventario.getText()));
        renta.setClienteID(jcCliente.getSelectedIndex());
        renta.setFechaRetorno(txtRetorno.getText());
        renta.setPersonalID(Integer.parseInt(txtPersonalID.getText()));
        
         int tamaño;
                tamaño=ControladorRenta.listadoRentas(renta.getID()+"").size();
                
                if(tamaño==0){
                int resultado = 0;
                    resultado = ControladorRenta.grabarRenta(renta);
                    if(resultado == 1){
                        JOptionPane.showMessageDialog(this,
                                "Registro Grabado con éxito",
                                "Confirmación",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Error al grabar",
                                "Confirmación",JOptionPane.ERROR_MESSAGE);
                    }
                    
                    ArrayList<Inventario> listaInventario = new ArrayList();
                    listaInventario=ControladorInventario.listadoInventarios(txtInventario.getText());
                    Inventario i = new Inventario();
                    i=listaInventario.get(0);
                    i.setDisponible("no");
                    int resultado2=0;
                    resultado=ControladorInventario.modificarInventario(i);

                    
                    cargarRentasTabla();

            jbRegistrar.setEnabled(false);            
            txtFecha.setEnabled(false);
            txtInventario.setEnabled(false);
            jcCliente.setEnabled(false);
            txtRetorno.setEnabled(false);
            jcDias.setEnabled(false);
            
            
            
            jbNuevo.setText("Nuevo");
            jbModificar.setEnabled(true);
            jbPagar.setEnabled(true);
            jTable1.setEnabled(true);
            jTable1.setVisible(true);
            jbNuevo.requestFocusInWindow();
                                       
            }else{
                   JOptionPane.showMessageDialog(this,
                           "IDya registrado","Confirmación",
                           JOptionPane.ERROR_MESSAGE); 
                   txtRenta.requestFocusInWindow();
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
            jbRegistrar.setEnabled(false);
            txtDisponible.setEnabled(true);
            
            
            
            jbModificar.setText("Actualizar");
                        
            jbCancelar.setEnabled(true);
           
             }
        }else {
            
            jbNuevo.setEnabled(true);
            txtDisponible.setEnabled(false);
            
            
            
            jbModificar.setText("Modificar");
            jbModificar.setEnabled(true);
             
                                             
            jbCancelar.setEnabled(false);
            jTable1.setEnabled(true);
            
            Inventario i = new Inventario();
            ArrayList<Inventario> listaInventario = new ArrayList();
            listaInventario=ControladorInventario.listadoInventarios(txtInventario.getText());
             
            i=listaInventario.get(0);
            i.setDisponible(txtDisponible.getText());
           
                         
             if(ControladorInventario.modificarInventario(i) == 1){
                 JOptionPane.showMessageDialog(this,"Actualización exitosa");
                 this.cargarRentasTabla();
             } else {
                 JOptionPane.showMessageDialog(this,"Actualización Fallida");
             }
             
        }
        
        
        
    }//GEN-LAST:event_jbModificarActionPerformed

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
                                  
            txtRenta.setText(modelo.getValueAt(
                    jTable1.getSelectedRow(), 0).toString()); 
            txtFecha.setText(modelo.getValueAt(jTable1.getSelectedRow(),1).toString());
            txtInventario.setText(modelo.getValueAt(jTable1.getSelectedRow(), 2).toString());
            jcCliente.setSelectedIndex(Integer.parseInt(modelo.getValueAt(jTable1.getSelectedRow(),3).toString()));
            txtRetorno.setText(modelo.getValueAt(jTable1.getSelectedRow(),4).toString());
            
            ArrayList<Inventario> listaInventario = new ArrayList();
            listaInventario=ControladorInventario.listadoInventarios(txtInventario.getText());
            
            txtDisponible.setText(listaInventario.get(0).getDisponible());
            
           
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        
        txtDisponible.setEnabled(false);
        jbNuevo.setEnabled(true);
        jbRegistrar.setEnabled(false);
        jbModificar.setText("Modificar");
        jbCancelar.setEnabled(false);
        jTable1.setEnabled(true);
        
        
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPagarActionPerformed
        // TODO add your handling code here:
        Pago pago = new Pago();
        pago.setID(Integer.parseInt(txtPagoID.getText()));
        pago.setClienteID(Integer.parseInt(txtClienteID.getText()));
        pago.setPersonalID(Integer.parseInt(txtPersonalID.getText()));
        pago.setRentalID(Integer.parseInt(txtRentaID.getText()));
        pago.setValor(Double.parseDouble(txtValor.getText()));
        pago.setFecha(txtFecha.getText());
        
        
                int resultado = 0;
                    resultado = ControladorPago.grabarPago(pago);
                    if(resultado == 1){
                        JOptionPane.showMessageDialog(this,
                                "Registro Grabado con éxito",
                                "Confirmación",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Error al grabar",
                                "Confirmación",JOptionPane.ERROR_MESSAGE);
                    }
        
        jbPagar.setEnabled(false);
        
        
        
        
    }//GEN-LAST:event_jbPagarActionPerformed

    private void cargarClientesCombo(){
         ArrayList<Cliente> listaClientes = new ArrayList();
          listaClientes=ControladorCliente.listadoClientes("0");
                    
          for(int i=0;i<listaClientes.size();i++){
              jcCliente.addItem(listaClientes.get(i).getNombre());
               
          }
        
    }
    private void cargarRentasTabla(){
        limpiarTabla();
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable1.getModel();
        ArrayList<Renta> listadoRentas = new ArrayList();        
        listadoRentas = ControladorRenta.listadoRentas("0");         
        for(int i= 0; i < listadoRentas.size(); i++){                       
              modelo.addRow(new Object[]{
              listadoRentas.get(i).getID(),
              listadoRentas.get(i).getFecha(),
              listadoRentas.get(i).getInventarioID(),              
              listadoRentas.get(i).getClienteID(),
              listadoRentas.get(i).getFechaRetorno(),
              listadoRentas.get(i).getPersonalID()
             
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
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbPagar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JComboBox jcCliente;
    private javax.swing.JComboBox jcDias;
    private javax.swing.JLabel jlCliente;
    private javax.swing.JLabel jlClienteID;
    private javax.swing.JLabel jlDias;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlInventario;
    private javax.swing.JLabel jlPago;
    private javax.swing.JLabel jlPersonal;
    private javax.swing.JLabel jlRenta;
    private javax.swing.JLabel jlRentaID;
    private javax.swing.JLabel jlRetorno;
    private javax.swing.JLabel jlTienda;
    private javax.swing.JLabel jlValor;
    private javax.swing.JTextField txtClienteID;
    private javax.swing.JTextField txtDisponible;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtInventario;
    private javax.swing.JTextField txtPagoID;
    private javax.swing.JTextField txtPersonalID;
    private javax.swing.JTextField txtRenta;
    private javax.swing.JTextField txtRentaID;
    private javax.swing.JTextField txtRetorno;
    private javax.swing.JTextField txtTiendaID;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
