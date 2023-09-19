/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package CapaPresentacion;

import CapaDatos.Categoria;
import CapaDatos.Marca;
import CapaDatos.Medida;
import CapaDatos.Producto;
import CapaNegocio.CategoriaBD;
import CapaNegocio.MarcaBD;
import CapaNegocio.MedidaBD;
import CapaNegocio.ProductoBD;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class Producto_IU extends javax.swing.JInternalFrame {

    List<Categoria> lista_categoria;
    List<Marca> lista_marca;
    List<Medida> lista_medida;

    /**
     * Creates new form Producto_IU
     */
    public Producto_IU() {
        initComponents();
        cargarCategoria();
        cargarMarca();
        cargarMedida();

        reportar();

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

    private void reportar() {
        try {
            setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));

            limpiar_tabla_formulario();
            DefaultTableModel tabla_temporal;
            ProductoBD oProductoBD = new ProductoBD();

            tabla_temporal = oProductoBD.reportarProducto();

            int cantidad_productos_encontrados = tabla_temporal.getRowCount();
            txtCantidad.setText("" + cantidad_productos_encontrados);

            DefaultTableModel tabla_temporal_producto = (DefaultTableModel) this.tabla_reporte_producto.getModel();

            for (int i = 0; i < cantidad_productos_encontrados; i++) {
                String serie = tabla_temporal.getValueAt(i, 0).toString();
                String descripcion = tabla_temporal.getValueAt(i, 1).toString();
                String observacion = tabla_temporal.getValueAt(i, 2).toString();
                String digemi = tabla_temporal.getValueAt(i, 3).toString();
                String condicion = tabla_temporal.getValueAt(i, 4).toString();
                String categoria = tabla_temporal.getValueAt(i, 5).toString();
                String marca = tabla_temporal.getValueAt(i, 6).toString();
                String medida = tabla_temporal.getValueAt(i, 7).toString();

                Object[] data = {serie, descripcion, observacion, digemi, condicion, categoria, marca, medida};
                tabla_temporal_producto.addRow(data);

            }
            tabla_reporte_producto.setModel(tabla_temporal_producto);

            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        } catch (Exception ex) {
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            ex.printStackTrace();
        }

    }

    private void cargarMedida() {
        try {
            cmbMedida.removeAllItems();

            MedidaBD oMedidaBD = new MedidaBD();
            DefaultTableModel tabla_temporal;
            tabla_temporal = oMedidaBD.reportarMedida();

            lista_medida = new ArrayList<>();

            cmbMedida.addItem("SELECCIONAR");

            for (int i = 0; i < tabla_temporal.getRowCount(); i++) {
                int codigo = Integer.valueOf(tabla_temporal.getValueAt(i, 0).toString());
                String presentacion = String.valueOf(tabla_temporal.getValueAt(i, 1).toString());
                String equivalencia = String.valueOf(tabla_temporal.getValueAt(i, 2).toString());

                lista_medida.add(new Medida(codigo, presentacion, equivalencia));
                cmbMedida.addItem(presentacion);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERROR AL CARGAR MEDIDA", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void cargarMarca() {
        try {
            cmbMarca.removeAllItems();
            MarcaBD oMarcaBd = new MarcaBD();
            DefaultTableModel tabla_temporal;
            tabla_temporal = oMarcaBd.reportarMarca();

            lista_marca = new ArrayList<>();

            cmbMarca.addItem("SELECCIONAR");
            for (int i = 0; i < tabla_temporal.getRowCount(); i++) {
                int codigo = Integer.valueOf(tabla_temporal.getValueAt(i, 0).toString());
                String nombre = String.valueOf(tabla_temporal.getValueAt(i, 1).toString());

                lista_marca.add(new Marca(codigo, nombre));
                cmbMarca.addItem(nombre);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERROR AL CARGAR MARCA", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarCategoria() {
        try {
            cmbCategoria.removeAllItems();
            CategoriaBD oCategoriaBD = new CategoriaBD();
            lista_categoria = oCategoriaBD.reportarCategoria();

            cmbCategoria.addItem("SELECCIONAR");
            for (int i = 0; i < lista_categoria.size(); i++) {

                int idcategoria = lista_categoria.get(i).getIdcategoria();
                String nombre = lista_categoria.get(i).getCatNombre();

                cmbCategoria.addItem(nombre);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERROR AL CARGAR CATEGORIA", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void habilitar() {
        btnBuscar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnRegistrar.setEnabled(true);

    }

    private void deshabilitar() {
        btnBuscar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnRegistrar.setEnabled(false);

    }

    private void limpiar() {
        cmbCategoria.setSelectedIndex(0);
        cmbMarca.setSelectedIndex(0);
        cmbMedida.setSelectedIndex(0);

        txtSerie.setText("");
        txtDescripcion.setText("");
        txtObservacion.setText("");
        txtDigemi.setText("");
        txtIdCategoria.setText("");
        txtIdMarca.setText("");
        txtIdMedida.setText("");

    }

    private void limpiar_tabla_formulario() {
        DefaultTableModel tabla_temporal_productos = (DefaultTableModel) tabla_reporte_producto.getModel();
        tabla_temporal_productos.setRowCount(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtObservacion = new javax.swing.JTextField();
        txtDigemi = new javax.swing.JTextField();
        txtIdCategoria = new javax.swing.JTextField();
        cmbCondicion = new javax.swing.JComboBox<>();
        cmbCategoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtIdMarca = new javax.swing.JTextField();
        txtIdMedida = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reporte_producto = new javax.swing.JTable();
        cmbMarca = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbMedida = new javax.swing.JComboBox<>();
        btnComposicion = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();

        setTitle("MANTENIMIENTO DE PRODUCTOS");

        jLabel1.setText("SERIE");

        jLabel2.setText("DESCRIPCION");

        jLabel3.setText("OBSERVACION");

        jLabel4.setText("DIGEMI");

        jLabel5.setText("CATEGORIA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel6.setText("PRODUCTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProducto)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("CONDICION");

        txtIdCategoria.setEditable(false);

        cmbCondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "NORMAL ", "RECETA MEDICA" }));

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCategoriaItemStateChanged(evt);
            }
        });

        jLabel8.setText("LABORATORIO");

        txtIdMarca.setEditable(false);

        txtIdMedida.setEditable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNuevo.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/application.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disk.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setEnabled(false);
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/report_magnify.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setEnabled(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/report_edit_1.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setEnabled(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setEnabled(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar_1.png"))); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.setActionCommand("CERRAR");
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addContainerGap())
        );

        tabla_reporte_producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla_reporte_producto);

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMarcaItemStateChanged(evt);
            }
        });

        jLabel9.setText("MEDIDA");

        cmbMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMedida.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMedidaItemStateChanged(evt);
            }
        });

        btnComposicion.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnComposicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar_lista.png"))); // NOI18N
        btnComposicion.setText("COMPOSICIÓN ");
        btnComposicion.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnComposicion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnComposicion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnComposicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComposicionActionPerformed(evt);
            }
        });

        jLabel10.setText("CANTIDAD");

        txtCantidad.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDigemi, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbCondicion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDescripcion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(250, 250, 250)
                                .addComponent(txtIdMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtObservacion)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnComposicion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtDigemi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(cmbMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnComposicion)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        habilitar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        if (txtSerie.getText().length() > 0) {
            if (txtDescripcion.getText().length() > 0) {
                if (txtIdCategoria.getText().length() > 0) {
                    if (txtIdMarca.getText().length() > 0) {
                        if (txtIdMedida.getText().length() > 0) {

                            Producto oProducto = new Producto();
                            ProductoBD oProductoBD = new ProductoBD();

                            oProducto.setpSerie(txtSerie.getText().trim());
                            oProducto.setpDescripcion(txtDescripcion.getText().trim());
                            oProducto.setpObservacion(txtObservacion.getText().trim());
                            oProducto.setDigemi(txtDigemi.getText().trim());
                            oProducto.setpCondicion(cmbCondicion.getSelectedItem().toString());
                            oProducto.setIdcategoria(Integer.parseInt(txtIdCategoria.getText()));
                            oProducto.setIdmarca(Integer.parseInt(txtIdMarca.getText()));
                            oProducto.setIdmedida(Integer.parseInt(txtIdMedida.getText()));

                            boolean rpta = oProductoBD.registrarProducto(oProducto);
                            
                            if (rpta) {
                                exito("SE REGISTRO CON EXITO");
                                reportar();
                                limpiar();
                                deshabilitar();
                            } else {
                                error("TIENES PROBLEMAS AL REGISTRAR");
                            }
                            
                        } else {
                            error("SELECCIONE UNA MEDIDA");
                        }
                    } else {
                        error("SELECCIONE UN LABORATORIO");
                    }
                } else {
                    error("SELECCIONE UNA CATEGORIA");
                }

            } else {
                error("INGRESE LA DESCRIPCION DEL PRODUCTO");
                txtDescripcion.requestFocus();
            }
        } else {
            error("INGRESE EL CODIGO DEL PRODUCTO");
            txtSerie.requestFocus();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnComposicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComposicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComposicionActionPerformed

    private void cmbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategoriaItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String textoSelecionado = (String) cmbCategoria.getSelectedItem();
            if (textoSelecionado.equals("SELECCIONAR")) {
                txtIdCategoria.setText("");

            } else {
                int i = cmbCategoria.getSelectedIndex() - 1;
                txtIdCategoria.setText("" + lista_categoria.get(i).getIdcategoria());
            }
        }
    }//GEN-LAST:event_cmbCategoriaItemStateChanged

    private void cmbMarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMarcaItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String textoSeleccionado = (String) cmbMarca.getSelectedItem();

            if (textoSeleccionado.equals("SELECCIONAR")) {
                txtIdMarca.setText("");

            } else {
                int i = cmbMarca.getSelectedIndex() - 1;
                txtIdMarca.setText("" + lista_marca.get(i).getIdmarca());
            }
        }
    }//GEN-LAST:event_cmbMarcaItemStateChanged

    private void cmbMedidaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMedidaItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String textoSeleccionado = (String) cmbMedida.getSelectedItem();

            if (textoSeleccionado.equals("SELECCIONAR")) {
                txtIdMedida.setText("");
            } else {
                int i = cmbMedida.getSelectedIndex() - 1;
                txtIdMedida.setText("" + lista_medida.get(i).getIdmedida());
            }
        }
    }//GEN-LAST:event_cmbMedidaItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnComposicion;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbCondicion;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JComboBox<String> cmbMedida;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_reporte_producto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDigemi;
    private javax.swing.JTextField txtIdCategoria;
    private javax.swing.JTextField txtIdMarca;
    private javax.swing.JTextField txtIdMedida;
    private javax.swing.JTextField txtObservacion;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables
}
