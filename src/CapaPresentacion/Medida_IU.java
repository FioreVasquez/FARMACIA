/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package CapaPresentacion;

import CapaDatos.Medida;
import CapaNegocio.MedidaBD;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class Medida_IU extends javax.swing.JInternalFrame {

    /**
     * Creates new form Medida_IU
     */
    public Medida_IU() {
        initComponents();
        reporte_medida();
    }

    private void reporte_medida() {
        try {
            setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
            DefaultTableModel tabla_temporal;
            MedidaBD oMedidaBD = new MedidaBD();
            tabla_temporal = oMedidaBD.reportarMedida();

            tabla_reporte_medida.setModel(tabla_temporal);
            int cant = tabla_temporal.getRowCount();
            txtCantidad.setText("" + cant);

            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        } catch (Exception e) {
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            JOptionPane.showMessageDialog(this, e, "PROBLEMAS EN REPORTAR MEDIDA_IU", JOptionPane.ERROR_MESSAGE);

        }

    }

    private void limpiar_caja() {
        txtCodigo.setText("");
        txtCantidad.setText("");
        txtEquivalencia.setText("");
        txtPresentacion.setText("");
    }

    private void exito(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "MENSAJE", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }

    private void error(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "ERROR", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }

    private void advertencia(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "ADVERTENCIA", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtPresentacion = new javax.swing.JTextField();
        txtEquivalencia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reporte_medida = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnMofificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setTitle("MEDIDA");

        jLabel1.setText("CODIGO");

        jLabel2.setText("PRESENTACION");

        jLabel3.setText("EQUIVALENCIA");

        txtCodigo.setEditable(false);

        txtPresentacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPresentacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPresentacionFocusLost(evt);
            }
        });
        txtPresentacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPresentacionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPresentacionKeyTyped(evt);
            }
        });

        txtEquivalencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEquivalenciaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEquivalenciaFocusLost(evt);
            }
        });
        txtEquivalencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEquivalenciaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEquivalenciaKeyTyped(evt);
            }
        });

        jLabel4.setText("CANTIDAD");

        txtCantidad.setEditable(false);

        tabla_reporte_medida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_reporte_medida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_reporte_medidaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_reporte_medida);

        btnRegistrar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnMofificar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnMofificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/application_form_edit.png"))); // NOI18N
        btnMofificar.setText("MODIFICAR");
        btnMofificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMofificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar2.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
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
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPresentacion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEquivalencia)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMofificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                        .addComponent(btnCerrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtEquivalencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnMofificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCerrar))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        if (txtPresentacion.getText().length() > 0) {
            if (txtEquivalencia.getText().length() > 0) {
                if (txtCodigo.getText().length() == 0) {

                    Medida oMedida = new Medida();
                    MedidaBD oMedidaBD = new MedidaBD();
                    oMedida.setPrePresentacion(txtPresentacion.getText().toUpperCase().trim());
                    oMedida.setPreEquivalencia(txtEquivalencia.getText().toUpperCase().trim());

                    boolean rpta = oMedidaBD.registrarMedida(oMedida);
                    if (rpta) {
                        exito("SE REGISTRO CON EXITO");
                        reporte_medida();
                        limpiar_caja();
                        txtPresentacion.requestFocus();

                    } else {
                        error("TIENE PROBLEMAS AL REGISTRAR MEDIDA");
                    }

                } else {
                    advertencia("YA EXISTE ESTA MEDIDA");
                }
            } else {
                advertencia("INGRESAR EQUIVALENCIA");
                txtEquivalencia.requestFocus();
            }
        } else {
            advertencia("INGRESE LA PRESENTACION");
            txtPresentacion.requestFocus();

        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void tabla_reporte_medidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_reporte_medidaMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            limpiar_caja();
            int fila_seleccionada = tabla_reporte_medida.getSelectedRow();
            txtCodigo.setText(tabla_reporte_medida.getValueAt(fila_seleccionada, 0).toString());
            txtPresentacion.setText(tabla_reporte_medida.getValueAt(fila_seleccionada, 1).toString());
            txtEquivalencia.setText(tabla_reporte_medida.getValueAt(fila_seleccionada, 2).toString());
        }
    }//GEN-LAST:event_tabla_reporte_medidaMousePressed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnMofificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMofificarActionPerformed
        // TODO add your handling code here:
        if (txtPresentacion.getText().length() > 0) {
            if (txtEquivalencia.getText().length() > 0) {
                if (txtCodigo.getText().length() > 0) {

                    Medida oMedida = new Medida();
                    MedidaBD oMedidaBD = new MedidaBD();

                    oMedida.setIdmedida(Integer.parseInt(txtCodigo.getText().trim()));
                    oMedida.setPreEquivalencia(txtPresentacion.getText().toUpperCase().trim());
                    oMedida.setPrePresentacion(txtEquivalencia.getText().toUpperCase().trim());

                    boolean rpta = oMedidaBD.modificarMedida(oMedida);
                    if (rpta) {
                        exito("SE MODIFICO CON EXITO");
                        reporte_medida();
                        limpiar_caja();
                        txtPresentacion.requestFocus();
                    } else {
                        error("SE MODIFICO CON EXITO");
                    }
                } else {
                    advertencia("TIENES QUE SELECCIONAR LA MEDIDA A MODIFICAR");
                }
            } else {
                advertencia("INGRESA EQUIVALENCIA");
                txtEquivalencia.requestFocus();
            }
        } else {
            advertencia("INGRESE LA PRESENTACION");
            txtPresentacion.requestFocus();
        }
    }//GEN-LAST:event_btnMofificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar_caja();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (txtCodigo.getText().length() > 0) {
            int aviso = JOptionPane.showConfirmDialog(rootPane, "ESTAS SEGURO DE ELIMINAR");
            if (aviso == 0) {
                int codigo = Integer.parseInt(txtCodigo.getText().trim());
                Medida oMedida = new Medida();
                MedidaBD oMedidaBD = new MedidaBD();

                oMedida.setIdmedida(codigo);

                boolean rpta = oMedidaBD.eliminarMedida(codigo);
                if (rpta) {
                    exito("SE ELIMINO CORRECTAMENTE");
                    reporte_medida();
                    limpiar_caja();

                } else {
                    error("HAY PROBLEMAS AL ELIMINAR");
                }
            }
        } else {
            advertencia("INGRESE UN CODIGO");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtPresentacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPresentacionKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtEquivalencia.requestFocus();
        }
    }//GEN-LAST:event_txtPresentacionKeyPressed

    private void txtEquivalenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEquivalenciaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnRegistrar.requestFocus();
        }
    }//GEN-LAST:event_txtEquivalenciaKeyPressed

    private void txtPresentacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPresentacionKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPresentacionKeyTyped

    private void txtEquivalenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEquivalenciaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEquivalenciaKeyTyped

    private void txtPresentacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPresentacionFocusGained
        // TODO add your handling code here:
        txtPresentacion.setBackground(Color.cyan);

    }//GEN-LAST:event_txtPresentacionFocusGained

    private void txtEquivalenciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEquivalenciaFocusGained
        // TODO add your handling code here:
        txtEquivalencia.setBackground(Color.cyan);

    }//GEN-LAST:event_txtEquivalenciaFocusGained

    private void txtPresentacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPresentacionFocusLost
        // TODO add your handling code here:
        txtPresentacion.setBackground(Color.white);

    }//GEN-LAST:event_txtPresentacionFocusLost

    private void txtEquivalenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEquivalenciaFocusLost
        // TODO add your handling code here:
        txtEquivalencia.setBackground(Color.white);

    }//GEN-LAST:event_txtEquivalenciaFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMofificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_reporte_medida;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEquivalencia;
    private javax.swing.JTextField txtPresentacion;
    // End of variables declaration//GEN-END:variables
}
