/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package CapaPresentacion;

import CapaDatos.TipoUsuario;
import CapaDatos.Usuario;
import CapaNegocio.TipoUsuarioBD;
import CapaNegocio.UsuarioBD;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class Usuario1_IU extends javax.swing.JInternalFrame {

    List<TipoUsuario> lista_tipo_usuario;

    /**
     * Creates new form Usuario1_IU
     */
    public Usuario1_IU() {
        initComponents();
        cargarTipoUsuario();
        reportar_usuarios();
    }

    private void cargarTipoUsuario() {
        try {
            cmbTipoUsuario.removeAllItems();

            TipoUsuarioBD oMedidaBD = new TipoUsuarioBD();
            DefaultTableModel tabla_temporal;
            tabla_temporal = oMedidaBD.reportarTipoUsuario();

            lista_tipo_usuario = new ArrayList<>();
            cmbTipoUsuario.addItem("SELECCIONAR");
            for (int i = 0; i < tabla_temporal.getRowCount(); i++) {
                int idtipousuario = Integer.valueOf(tabla_temporal.getValueAt(i, 0).toString());
                String tuNombre = String.valueOf(tabla_temporal.getValueAt(i, 1));

                lista_tipo_usuario.add(new TipoUsuario(idtipousuario, tuNombre));
                cmbTipoUsuario.addItem(tuNombre);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERROR AL CARGAR TIPO USUARIO", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void reportar_usuarios() {
        try {
            setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
            DefaultTableModel tabla_temporal;
            UsuarioBD oUsuarioBD = new UsuarioBD();
            tabla_temporal = oUsuarioBD.reportarUsuarios();
            tabla_reporte_usuarios.setModel(tabla_temporal);

            int cantLista = tabla_temporal.getRowCount();
            txtCantidad.setText("" + cantLista);
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        } catch (Exception ex) {
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            ex.printStackTrace();
        }

    }

    private void limpiar() {
        txtDni.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDireccion.setText("");
        txtClave.setText("");
        txtBuscar_apellidos.setText("");
        txtCelular.setText("");
        txtId_tipo_usuario.setText("");

        cmbTipoUsuario.setSelectedIndex(0);
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
        tabla_reporte_usuarios = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtBuscar_apellidos = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtId_tipo_usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbTipoUsuario = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbTienda = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();

        setTitle("USUARIO");

        tabla_reporte_usuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla_reporte_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_reporte_usuariosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_reporte_usuarios);

        jLabel9.setText("BUSCAR APELLIDOS");

        txtBuscar_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscar_apellidosActionPerformed(evt);
            }
        });
        txtBuscar_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscar_apellidosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscar_apellidosKeyTyped(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/printer.png"))); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disk.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/report_edit.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bin_empty.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("DNI");

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cross.png"))); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRES");

        txtId_tipo_usuario.setEditable(false);

        jLabel3.setText("APELLIDOS");

        cmbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "ADMINISTRADOR", "VENDEDOR", "CONTADOR", "CAJERO(A)", "LOGISTICA" }));
        cmbTipoUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoUsuarioItemStateChanged(evt);
            }
        });

        jLabel4.setText("DIRECCION");

        cmbTienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRINCIPAL", "SECUNDARIA" }));

        jLabel5.setText("CLAVE");

        jLabel10.setText("CANTIDAD");

        jLabel6.setText("CELULAR");

        jLabel7.setText("TIPO");

        jLabel8.setText("TIENDA");

        txtDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDniFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDniFocusLost(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        txtNombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombresFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombresFocusLost(evt);
            }
        });
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombresKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosFocusLost(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDireccionKeyPressed(evt);
            }
        });

        txtClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtClaveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtClaveFocusLost(evt);
            }
        });
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveKeyPressed(evt);
            }
        });

        txtCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCelularFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelularFocusLost(evt);
            }
        });
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCelularKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRegistrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnModificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEliminar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnImprimir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCerrar)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cmbTienda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbTipoUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCelular)
                            .addComponent(txtClave)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombres)
                            .addComponent(txtDni, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtId_tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(txtBuscar_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnModificar)
                                    .addComponent(btnRegistrar)
                                    .addComponent(btnEliminar)
                                    .addComponent(btnImprimir)))
                            .addComponent(btnCerrar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId_tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_reporte_usuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_reporte_usuariosMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int fila_seleccionada = tabla_reporte_usuarios.getSelectedRow();

            txtDni.setText(tabla_reporte_usuarios.getValueAt(fila_seleccionada, 0).toString());
            txtNombres.setText(tabla_reporte_usuarios.getValueAt(fila_seleccionada, 1).toString());
            txtApellidos.setText(tabla_reporte_usuarios.getValueAt(fila_seleccionada, 2).toString());
            txtDireccion.setText(tabla_reporte_usuarios.getValueAt(fila_seleccionada, 3).toString());
            txtClave.setText(tabla_reporte_usuarios.getValueAt(fila_seleccionada, 4).toString());
            txtCelular.setText(tabla_reporte_usuarios.getValueAt(fila_seleccionada, 5).toString());
            cmbTipoUsuario.setSelectedItem(tabla_reporte_usuarios.getValueAt(fila_seleccionada, 6).toString());
            cmbTienda.setSelectedItem(tabla_reporte_usuarios.getValueAt(fila_seleccionada, 7).toString());

        }
    }//GEN-LAST:event_tabla_reporte_usuariosMousePressed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        try {
            if (txtDni.getText().length() > 0) {
                if (txtNombres.getText().length() > 0) {
                    if (txtApellidos.getText().length() > 0) {
                        if (txtDireccion.getText().length() > 0) {
                            if (txtCelular.getText().length() > 0) {
                                if (txtClave.getText().length() > 0) {

                                    Usuario oUsuario = new Usuario();
                                    UsuarioBD oUsuarioBD = new UsuarioBD();
                                    oUsuario.setuDni(txtDni.getText().toUpperCase().toString());
                                    oUsuario.setuNombre(txtNombres.getText().toUpperCase().toString());
                                    oUsuario.setuApellidos(txtApellidos.getText().toUpperCase().toString());
                                    oUsuario.setuDireccion(txtDireccion.getText().toUpperCase().toString());
                                    oUsuario.setuClave(txtClave.getText().toUpperCase().toString());
                                    oUsuario.setuCelular(txtCelular.getText().toUpperCase().toString());
                                    oUsuario.setuTipo(Integer.parseInt(txtId_tipo_usuario.getText()));
                                    oUsuario.setTienda(cmbTienda.getSelectedItem().toString());

                                    boolean rpta = oUsuarioBD.registrarUsuario(oUsuario);
                                    if (rpta) {
                                        exito("SE REGISTRO CON EXITO");
                                        reportar_usuarios();
                                        limpiar();
                                    } else {
                                        error("TIENES PROBLEMAS AL REGISTRAR");
                                    }

                                } else {
                                    advertencia("INGRESE CLAVE");
                                    txtClave.requestFocus();
                                }
                            } else {
                                advertencia("INGRESE CELULAR");
                                txtCelular.requestFocus();
                            }

                        } else {
                            advertencia("INGRESE DIRECCION");
                            txtDireccion.requestFocus();
                        }
                    } else {
                        advertencia("INGRESE APELLIDOS");
                        txtApellidos.requestFocus();
                    }
                } else {
                    advertencia("INGRESE NOMBRE");
                    txtNombres.requestFocus();
                }
            } else {
                advertencia("INGRESE DNI");
                txtDni.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        try {
            if (txtDni.getText().length() > 0) {
                if (txtNombres.getText().length() > 0) {
                    if (txtApellidos.getText().length() > 0) {
                        if (txtDireccion.getText().length() > 0) {
                            if (txtCelular.getText().length() > 0) {
                                if (txtClave.getText().length() > 0) {

                                    Usuario oUsuario = new Usuario();
                                    UsuarioBD oUsuarioBD = new UsuarioBD();
                                    oUsuario.setuDni(txtDni.getText().toUpperCase().toString());
                                    oUsuario.setuNombre(txtNombres.getText().toUpperCase().toString());
                                    oUsuario.setuApellidos(txtApellidos.getText().toUpperCase().toString());
                                    oUsuario.setuDireccion(txtDireccion.getText().toUpperCase().toString());
                                    oUsuario.setuClave(txtClave.getText().toUpperCase().toString());
                                    oUsuario.setuCelular(txtCelular.getText().toUpperCase().toString());
                                    oUsuario.setuTipo(Integer.parseInt(txtId_tipo_usuario.getText()));
                                    oUsuario.setTienda(cmbTienda.getSelectedItem().toString());

                                    boolean rpta = oUsuarioBD.modificarUsuario(oUsuario);
                                    if (rpta) {
                                        exito("SE MODIFICO CON EXITO");
                                        reportar_usuarios();
                                        limpiar();
                                    } else {
                                        error("TIENES PROBLEMAS AL REGISTRAR");
                                    }

                                } else {
                                    advertencia("INGRESE CLAVE");
                                    txtClave.requestFocus();
                                }
                            } else {
                                advertencia("INGRESE CELULAR");
                                txtCelular.requestFocus();
                            }

                        } else {
                            advertencia("INGRESE DIRECCION");
                            txtDireccion.requestFocus();
                        }
                    } else {
                        advertencia("INGRESE APELLIDOS");
                        txtApellidos.requestFocus();
                    }
                } else {
                    advertencia("INGRESE NOMBRE");
                    txtNombres.requestFocus();
                }
            } else {
                advertencia("INGRESE DNI");
                txtDni.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            if (txtDni.getText().length() > 0) {
                int aviso = JOptionPane.showConfirmDialog(rootPane, "ESTAS SEURO DE ELIMINAR");
                if (aviso == 0) {
                    UsuarioBD oUsuarioBD = new UsuarioBD();

                    String dni = txtDni.getText();
                    boolean rpta = oUsuarioBD.eliminarUsuario(dni);
                    if (rpta) {
                        exito("SE ELIMINO EL USUARIO CORRECTAMENTE");
                        reportar_usuarios();
                        limpiar();
                        txtDni.requestFocus();

                    } else {
                        error("PROBLEMAS AL ELIMINAR");
                    }

                }

            } else {
                error("INGRESE DNI PARA ELIMINAR");

                txtDni.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void cmbTipoUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoUsuarioItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            String textoSeleccionado = (String) cmbTipoUsuario.getSelectedItem();

            if (textoSeleccionado.equals("SELECCIONAR")) {
                txtId_tipo_usuario.setText("");

            } else {
                int i = cmbTipoUsuario.getSelectedIndex() - 1;

                txtId_tipo_usuario.setText("" + lista_tipo_usuario.get(i).getIdtipousuario());

            }
        }
    }//GEN-LAST:event_cmbTipoUsuarioItemStateChanged

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtBuscar_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscar_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscar_apellidosActionPerformed

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNombres.requestFocus();
        }

    }//GEN-LAST:event_txtDniKeyPressed

    private void txtNombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtApellidos.requestFocus();
        }
    }//GEN-LAST:event_txtNombresKeyPressed

    private void txtApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDireccion.requestFocus();
        }
    }//GEN-LAST:event_txtApellidosKeyPressed

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtClave.requestFocus();
        }
    }//GEN-LAST:event_txtDireccionKeyPressed

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCelular.requestFocus();
        }
    }//GEN-LAST:event_txtClaveKeyPressed

    private void txtCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularKeyPressed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || txtDni.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || txtCelular.getText().length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtBuscar_apellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscar_apellidosKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscar_apellidosKeyTyped

    private void txtBuscar_apellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscar_apellidosKeyPressed
        // TODO add your handling code here:
        try {
            setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
            DefaultTableModel tabla_temporal;

            String apellidos = txtBuscar_apellidos.getText();

            UsuarioBD OUsuarioBD = new UsuarioBD();
            tabla_temporal = OUsuarioBD.buscarUsuario(apellidos);
            tabla_reporte_usuarios.setModel(tabla_temporal);

            int canLista = tabla_temporal.getRowCount();
            txtCantidad.setText("" + canLista);

            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        } catch (Exception e) {
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            e.printStackTrace();

        }
    }//GEN-LAST:event_txtBuscar_apellidosKeyPressed

    private void txtDniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniFocusGained
        // TODO add your handling code here:
        txtDni.setBackground(Color.cyan);

    }//GEN-LAST:event_txtDniFocusGained

    private void txtDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniFocusLost
        // TODO add your handling code here:
        txtDni.setBackground(Color.white);

    }//GEN-LAST:event_txtDniFocusLost

    private void txtNombresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresFocusGained
        // TODO add your handling code here:
        txtNombres.setBackground(Color.cyan);

    }//GEN-LAST:event_txtNombresFocusGained

    private void txtNombresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresFocusLost
        // TODO add your handling code here:
        txtNombres.setBackground(Color.white);

    }//GEN-LAST:event_txtNombresFocusLost

    private void txtApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusGained
        // TODO add your handling code here:
        txtApellidos.setBackground(Color.cyan);

    }//GEN-LAST:event_txtApellidosFocusGained

    private void txtApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusLost
        // TODO add your handling code here:
        txtApellidos.setBackground(Color.white);

    }//GEN-LAST:event_txtApellidosFocusLost

    private void txtDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusGained
        // TODO add your handling code here:
        txtDireccion.setBackground(Color.cyan);

    }//GEN-LAST:event_txtDireccionFocusGained

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
        // TODO add your handling code here:
        txtDireccion.setBackground(Color.white);

    }//GEN-LAST:event_txtDireccionFocusLost

    private void txtClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClaveFocusGained
        // TODO add your handling code here:
        txtClave.setBackground(Color.cyan);

    }//GEN-LAST:event_txtClaveFocusGained

    private void txtClaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClaveFocusLost
        // TODO add your handling code here:
        txtClave.setBackground(Color.white);

    }//GEN-LAST:event_txtClaveFocusLost

    private void txtCelularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusGained
        // TODO add your handling code here:
        txtCelular.setBackground(Color.cyan);

    }//GEN-LAST:event_txtCelularFocusGained

    private void txtCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusLost
        // TODO add your handling code here:
        txtCelular.setBackground(Color.white);

    }//GEN-LAST:event_txtCelularFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbTienda;
    private javax.swing.JComboBox<String> cmbTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_reporte_usuarios;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar_apellidos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtId_tipo_usuario;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
