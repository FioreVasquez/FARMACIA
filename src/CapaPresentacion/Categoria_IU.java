/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package CapaPresentacion;

import CapaDatos.Categoria;
import CapaNegocio.CategoriaBD;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class Categoria_IU extends javax.swing.JInternalFrame {

    /**
     * Creates new form Categoria_IU
     */
    public Categoria_IU() {
        initComponents();
        reporte_categoria();
    }

    private void reporte_categoria() {
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));

        try {
            limpiar_tabla_formulario();

            DefaultTableModel tabla_temporal = (DefaultTableModel) this.tabla_reporte_categoria.getModel();
            CategoriaBD oCategoriaBD = new CategoriaBD();

            List<Categoria> lista_categorias = oCategoriaBD.reportarCategoria();
            for (int i = 0; i < lista_categorias.size(); i++) {
                int idcategoria = lista_categorias.get(i).getIdcategoria();
                String maNombre = lista_categorias.get(i).getCatNombre();

                Object[] data = {idcategoria, maNombre};
                tabla_temporal.addRow(data);

            }
            tabla_reporte_categoria.setModel(tabla_temporal);

            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        } catch (Exception e) {
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            e.printStackTrace();
        }

    }

    private void limpiar_tabla_formulario() {
        DefaultTableModel tabla_temporal_categorias = (DefaultTableModel) tabla_reporte_categoria.getModel();
        tabla_temporal_categorias.setRowCount(0);

    }

    private void limpiar() {
        txtId.setText("");
        txtCantidad.setText("");
        txtNombre.setText("");

        reporte_categoria();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reporte_categoria = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarCategorias = new javax.swing.JTextField();

        setTitle("CATEGORIA");

        tabla_reporte_categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE"
            }
        ));
        tabla_reporte_categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_reporte_categoriaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_reporte_categoria);

        jLabel1.setText("ID");

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRE");

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/application_form_edit.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel3.setText("CANTIDAD");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar2.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtId.setEditable(false);

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

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

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        txtCantidad.setEditable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Categorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel4.setText("LABORATORIO");

        txtBuscarCategorias.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarCategoriasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarCategoriasFocusLost(evt);
            }
        });
        txtBuscarCategorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarCategoriasKeyPressed(evt);
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
                .addComponent(txtBuscarCategorias)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBuscarCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
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

    private void tabla_reporte_categoriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_reporte_categoriaMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int fila_seleccionada = tabla_reporte_categoria.getSelectedRow();
            txtId.setText(tabla_reporte_categoria.getValueAt(fila_seleccionada, 0).toString());
            txtNombre.setText(tabla_reporte_categoria.getValueAt(fila_seleccionada, 1).toString());

        }
    }//GEN-LAST:event_tabla_reporte_categoriaMousePressed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        if (txtId.getText().length() == 0) {
            if (txtNombre.getText().length() > 0) {

                Categoria oCategoria = new Categoria();
                CategoriaBD oCategoriaBD = new CategoriaBD();

                oCategoria.setCatNombre(txtNombre.getText().toUpperCase().trim());

                boolean rpta = oCategoriaBD.registrarCategoria(oCategoria);

                if (rpta) {
                    exito("SE REGISTRO CON EXITO");
                    reporte_categoria();
                    limpiar();
                    txtNombre.requestFocus();

                } else {
                    error("TIENES ROBLEMAS AL REGISTRAR");
                }
            } else {
                advertencia("INGRESE EL NOMBRE");
                txtNombre.requestFocus();

            }
        } else {
            advertencia("NO PUEDES REGISTRAR PORQUE YA EXISTE");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (txtId.getText().length() > 0) {
            if (txtNombre.getText().length() > 0) {

                Categoria oCategoria = new Categoria();
                CategoriaBD oCategoriaBD = new CategoriaBD();
                oCategoria.setIdcategoria(Integer.parseInt(txtId.getText().toUpperCase().trim()));
                oCategoria.setCatNombre(txtNombre.getText().toUpperCase().trim());

                boolean rpta = oCategoriaBD.modificarCategoria(oCategoria);
                if (rpta) {
                    exito("SE MODIFICO CON EXITO");
                    reporte_categoria();
                    limpiar();
                    txtNombre.requestFocus();

                } else {
                    error("TIENES PROBLEMAS AL MODIFICAR");
                }
            } else {
                advertencia("INGRESE EL NOMBRE");
                txtNombre.requestFocus();
            }
        } else {
            advertencia("NO PUEDES MODIFICAR PORQUE YA EXISTE");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (txtId.getText().length() > 0) {
            int aviso = JOptionPane.showConfirmDialog(rootPane, "ESTAS SEGURO DE ELIMINAR");

            if (aviso == 0) {
                int idmarca = Integer.parseInt(txtId.getText().trim());

                Categoria oCategoria = new Categoria();
                CategoriaBD oCategoriaBD = new CategoriaBD();

                oCategoria.setIdcategoria(idmarca);

                boolean rpta = oCategoriaBD.eliminarCategoria(oCategoria);

                if (rpta) {
                    exito("SE ELIMINO CON EXITO");
                    reporte_categoria();
                    limpiar();

                } else {
                    error("TIENES PROBLEMAS AL ELIMINAR");
                }
            }
        } else {
            advertencia("INGRESE UN CODIGO PARA ELIMINAR CATEGORIA");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtBuscarCategorias.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        // TODO add your handling code here:
        txtNombre.setBackground(Color.cyan);
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        // TODO add your handling code here:
        txtNombre.setBackground(Color.white);
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnRegistrar.requestFocus();
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtBuscarCategoriasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarCategoriasFocusGained
        // TODO add your handling code here:
        txtBuscarCategorias.setBackground(Color.cyan);
    }//GEN-LAST:event_txtBuscarCategoriasFocusGained

    private void txtBuscarCategoriasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarCategoriasFocusLost
        // TODO add your handling code here:
        txtBuscarCategorias.setBackground(Color.white);
    }//GEN-LAST:event_txtBuscarCategoriasFocusLost

    private void txtBuscarCategoriasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCategoriasKeyPressed
        // TODO add your handling code here:
        try {
            limpiar_tabla_formulario();

            DefaultTableModel tabla_temporal = (DefaultTableModel) this.tabla_reporte_categoria.getModel();
            CategoriaBD oCategoriaBD = new CategoriaBD();

            String valor = txtBuscarCategorias.getText().trim();

            List<Categoria> lista_categorias = oCategoriaBD.buscarCategoria(valor);

            for (int i = 0; i < lista_categorias.size(); i++) {

                int idcategoria = lista_categorias.get(i).getIdcategoria();
                String maNombre = lista_categorias.get(i).getCatNombre();
                Object[] data = {idcategoria, maNombre};
                tabla_temporal.addRow(data);
            }
            tabla_reporte_categoria.setModel(tabla_temporal);
            
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            
        } catch (Exception ex) {
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            ex.printStackTrace();

        }
    }//GEN-LAST:event_txtBuscarCategoriasKeyPressed


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
    private javax.swing.JTable tabla_reporte_categoria;
    private javax.swing.JTextField txtBuscarCategorias;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
