/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package CapaPresentacion;

import CapaDatos.Marca;
import CapaNegocio.MarcaBD;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class Marca_IU extends javax.swing.JInternalFrame {

    /**
     * Creates new form Marca_IU
     */
    public Marca_IU() {
        initComponents();
        reporte_marcas();
    }

    private void limpiar() {
        txtId.setText("");
        txtNombre.setText("");

    }

    private void exito(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "MENSAJE", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }

    private void error(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "MENSAJE", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

    }

    private void advertencia(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "MENSAJE", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

    }

    private void reporte_marcas() {
        try {
            setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
            DefaultTableModel tabla_temporal;
            MarcaBD oMarcaBD = new MarcaBD();
            tabla_temporal = oMarcaBD.reportarMarca();

            tabla_reporte_marca.setModel(tabla_temporal);
            int cant = tabla_temporal.getRowCount();
            txtCantidad.setText("" + cant);

            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        } catch (Exception e) {
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarMarca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reporte_marca = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setTitle("LABORATORIO");

        jLabel1.setText("ID");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("CANTIDAD");

        txtId.setEditable(false);

        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtCantidad.setEditable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Laboratorios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel4.setText("LABORATORIO");

        txtBuscarMarca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarMarcaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarMarcaFocusLost(evt);
            }
        });
        txtBuscarMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarMarcaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarMarca)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBuscarMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla_reporte_marca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_reporte_marca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_reporte_marcaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_reporte_marca);

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/application_form_edit.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar2.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombre)))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                        .addComponent(btnCerrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCerrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        // TODO add your handling code here:
        txtNombre.setBackground(Color.cyan);

    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        // TODO add your handling code here:
        txtNombre.setBackground(Color.white);

    }//GEN-LAST:event_txtNombreFocusLost

    private void txtBuscarMarcaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarMarcaFocusGained
        // TODO add your handling code here:
        txtBuscarMarca.setBackground(Color.cyan);

    }//GEN-LAST:event_txtBuscarMarcaFocusGained

    private void txtBuscarMarcaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarMarcaFocusLost
        // TODO add your handling code here:
        txtBuscarMarca.setBackground(Color.white);

    }//GEN-LAST:event_txtBuscarMarcaFocusLost

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnRegistrar.requestFocus();
        }

    }//GEN-LAST:event_txtNombreKeyPressed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        if (txtNombre.getText().length() > 0) {
            if (txtId.getText().length() == 0) {

                Marca oMarca = new Marca();
                MarcaBD oMarcaBD = new MarcaBD();

                oMarca.setMaNombre(txtNombre.getText().toUpperCase().trim());

                boolean rpta = oMarcaBD.registrarMarca(oMarca);

                if (rpta) {
                    exito("SE REGISTRO CON EXITO");
                    reporte_marcas();
                    limpiar();

                } else {
                    error("TIENES ROBLEMAS AL REGISTRAR");
                }
            } else {
                JOptionPane.showMessageDialog(null, "NO PUEDES REGISTRAR PORQUE YA EXISTE", "ERROR", JOptionPane.INFORMATION_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(null, "INGRESE EL NOMBRE");
            txtNombre.requestFocus();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void tabla_reporte_marcaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_reporte_marcaMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int fila_seleccionada = tabla_reporte_marca.getSelectedRow();
            txtId.setText(tabla_reporte_marca.getValueAt(fila_seleccionada, 0).toString());
            txtNombre.setText(tabla_reporte_marca.getValueAt(fila_seleccionada, 1).toString());

        }
    }//GEN-LAST:event_tabla_reporte_marcaMousePressed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (txtId.getText().length() > 0) {
            if (txtNombre.getText().length() > 0) {

                Marca oMarca = new Marca();
                MarcaBD oMarcaBD = new MarcaBD();
                oMarca.setIdmarca(Integer.parseInt(txtId.getText().trim()));
                oMarca.setMaNombre(txtNombre.getText().toUpperCase().trim());

                boolean rpta = oMarcaBD.modificarMarca(oMarca);
                if (rpta) {
                    exito("SE MODIFICO CON EXITO");
                    reporte_marcas();
                    limpiar();

                } else {
                    error("TIENES PROBLEMAS AL MODIFICAR");
                }
            } else {
                JOptionPane.showMessageDialog(null, "EL CAMPO NO PUEDE ESTAR VACIO");
                txtNombre.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTE EL CODIGO MODIFICAR");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (txtId.getText().length() > 0) {
            int aviso = JOptionPane.showConfirmDialog(rootPane, "ESTAS SEGURO DE ELIMINAR");

            if (aviso == 0) {
                int idmarca = Integer.parseInt(txtId.getText().trim());

                MarcaBD oMarcaBD = new MarcaBD();

                boolean rpta = oMarcaBD.eliminarMarca(idmarca);

                if (rpta) {
                    exito("SE ELIMINO CON EXITO");
                    reporte_marcas();
                    limpiar();
                } else {
                    error("TIENES PROBLEMAS AL ELIMINAR");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "INGRESE UN CODIGO");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtBuscarMarca.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtBuscarMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarMarcaKeyPressed
        // TODO add your handling code here:
        try {
            setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));

            DefaultTableModel tabla_temporal;
            String valor = txtBuscarMarca.getText();

            MarcaBD oMarcaBD = new MarcaBD();
            tabla_temporal = oMarcaBD.buscarMarca(valor);

            tabla_reporte_marca.setModel(tabla_temporal);

            int cantLista = tabla_temporal.getRowCount();
            txtCantidad.setText("" + cantLista);

            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        } catch (Exception ex) {
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            ex.printStackTrace();

        }
    }//GEN-LAST:event_txtBuscarMarcaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_reporte_marca;
    private javax.swing.JTextField txtBuscarMarca;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
