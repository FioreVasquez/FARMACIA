/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CapaPresentacion;

import java.awt.Dimension;

/**
 *
 * @author USUARIO
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario1_IU1 = new CapaPresentacion.Usuario1_IU();
        escritorio = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        btnProductos = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnIngresos = new javax.swing.JButton();
        btnEgresos = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnCaja = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_iten_tipousuario = new javax.swing.JMenuItem();
        menu_item_usuario = new javax.swing.JMenuItem();
        menu_itenTurno = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menu_Iten_Laboratorio = new javax.swing.JMenuItem();
        menu_iten_categoria = new javax.swing.JMenuItem();
        menu_iten_medida = new javax.swing.JMenuItem();
        menu_iten_producto = new javax.swing.JMenuItem();
        menu_compras = new javax.swing.JMenu();
        menu_inventario = new javax.swing.JMenu();
        menu_ventas = new javax.swing.JMenu();
        menu_caja = new javax.swing.JMenu();

        usuario1_IU1.setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FARMACIA");

        escritorio.setForeground(new java.awt.Color(153, 153, 255));

        jToolBar1.setForeground(new java.awt.Color(153, 204, 255));
        jToolBar1.setRollover(true);

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/box.png"))); // NOI18N
        btnProductos.setFocusable(false);
        btnProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnProductos);

        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compra.png"))); // NOI18N
        btnCompras.setFocusable(false);
        btnCompras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCompras);

        btnIngresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingresos.png"))); // NOI18N
        btnIngresos.setFocusable(false);
        btnIngresos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnIngresos);

        btnEgresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/egresos.png"))); // NOI18N
        btnEgresos.setFocusable(false);
        btnEgresos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEgresos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEgresos);

        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venta1.png"))); // NOI18N
        btnVenta.setFocusable(false);
        btnVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnVenta);

        btnCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja11.png"))); // NOI18N
        btnCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCaja);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar_1.png"))); // NOI18N
        btnCerrar.setFocusable(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCerrar);

        escritorio.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 340, Short.MAX_VALUE))
        );

        jMenu1.setText("MANTENIMIENTO");

        menu_iten_tipousuario.setText("Tipo de Usuario");
        menu_iten_tipousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_iten_tipousuarioActionPerformed(evt);
            }
        });
        jMenu1.add(menu_iten_tipousuario);

        menu_item_usuario.setText("Usuario");
        menu_item_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(menu_item_usuario);

        menu_itenTurno.setText("Turno");
        menu_itenTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_itenTurnoActionPerformed(evt);
            }
        });
        jMenu1.add(menu_itenTurno);
        jMenu1.add(jSeparator1);

        menu_Iten_Laboratorio.setText("Laboratorio");
        menu_Iten_Laboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_Iten_LaboratorioActionPerformed(evt);
            }
        });
        jMenu1.add(menu_Iten_Laboratorio);

        menu_iten_categoria.setText("Categoria");
        menu_iten_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_iten_categoriaActionPerformed(evt);
            }
        });
        jMenu1.add(menu_iten_categoria);

        menu_iten_medida.setText("Medida");
        menu_iten_medida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_iten_medidaActionPerformed(evt);
            }
        });
        jMenu1.add(menu_iten_medida);

        menu_iten_producto.setText("Producto");
        menu_iten_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_iten_productoActionPerformed(evt);
            }
        });
        jMenu1.add(menu_iten_producto);

        jMenuBar1.add(jMenu1);

        menu_compras.setText("COMPRAS");
        jMenuBar1.add(menu_compras);

        menu_inventario.setText("INVENTARIO");
        jMenuBar1.add(menu_inventario);

        menu_ventas.setText("VENTAS");
        jMenuBar1.add(menu_ventas);

        menu_caja.setText("CAJA");
        jMenuBar1.add(menu_caja);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_iten_tipousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_iten_tipousuarioActionPerformed
        // TODO add your handling code here:
        TipoUsuario1 frame = new TipoUsuario1();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);

        frame.show();
    }//GEN-LAST:event_menu_iten_tipousuarioActionPerformed

    private void menu_item_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_usuarioActionPerformed
        // TODO add your handling code here:
        Usuario1_IU frame = new Usuario1_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);

        frame.show();

    }//GEN-LAST:event_menu_item_usuarioActionPerformed

    private void menu_itenTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_itenTurnoActionPerformed
        // TODO add your handling code here:
        Turno_IU frame = new Turno_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);

        frame.show();
    }//GEN-LAST:event_menu_itenTurnoActionPerformed

    private void menu_Iten_LaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Iten_LaboratorioActionPerformed
        // TODO add your handling code here:
        Marca_IU frame = new Marca_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);

        frame.show();
    }//GEN-LAST:event_menu_Iten_LaboratorioActionPerformed

    private void menu_iten_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_iten_categoriaActionPerformed
        // TODO add your handling code here:
        Categoria_IU frame = new Categoria_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);

        frame.show();
    }//GEN-LAST:event_menu_iten_categoriaActionPerformed

    private void menu_iten_medidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_iten_medidaActionPerformed
        // TODO add your handling code here:
        Medida_IU frame = new Medida_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);

        frame.show();
    }//GEN-LAST:event_menu_iten_medidaActionPerformed

    private void menu_iten_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_iten_productoActionPerformed
        // TODO add your handling code here:
        Producto_IU frame = new Producto_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);

        frame.show();
    }//GEN-LAST:event_menu_iten_productoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaja;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnEgresos;
    private javax.swing.JButton btnIngresos;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnVenta;
    public static javax.swing.JDesktopPane escritorio;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menu_Iten_Laboratorio;
    public javax.swing.JMenu menu_caja;
    public javax.swing.JMenu menu_compras;
    public javax.swing.JMenu menu_inventario;
    private javax.swing.JMenuItem menu_item_usuario;
    private javax.swing.JMenuItem menu_itenTurno;
    private javax.swing.JMenuItem menu_iten_categoria;
    private javax.swing.JMenuItem menu_iten_medida;
    private javax.swing.JMenuItem menu_iten_producto;
    private javax.swing.JMenuItem menu_iten_tipousuario;
    public javax.swing.JMenu menu_ventas;
    private CapaPresentacion.Usuario1_IU usuario1_IU1;
    // End of variables declaration//GEN-END:variables
}
