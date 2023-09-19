/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class ProductoBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql;

    public DefaultTableModel reportarProducto() {
        DefaultTableModel tabla_temporal;
        String[] cabecera = {"SERIE", "DESCRIPCION", "OBSERVACION", "DIGEMI", "CONDICION", "CATEGORIA", "MARCA", "PRESENTACION", "ID_CAT", "ID_MA", "ID_ME"};
        String[] registros = new String[11];
        tabla_temporal = new DefaultTableModel(null, cabecera);

        sql = "SELECT pSerie,pDescripcion,pObservacion,digemi,pCondicion,catNombre,maNombre,mPresentacion,c.idcategoria,m.idmarca,me.idmedida FROM producto AS p "
                + "INNER JOIN marca AS m ON p.idmarca=m.idmarca "
                + "INNER JOIN medida AS me ON p.idmedida=me.idmedida "
                + "INNER JOIN categoria AS c ON p.idcategoria=c.idcategoria LIMIT 0, 20 ";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("pSerie");
                registros[1] = rs.getString("pDescripcion");
                registros[2] = rs.getString("pObservacion");
                registros[3] = rs.getString("digemi");
                registros[4] = rs.getString("pCondicion");
                registros[5] = rs.getString("catNombre");
                registros[6] = rs.getString("maNombre");
                registros[7] = rs.getString("mPresentacion");
                registros[8] = rs.getString("idcategoria");
                registros[9] = rs.getString("idmarca");
                registros[10] = rs.getString("idmedida");

                tabla_temporal.addRow(registros);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERROR AL REPORTAR PRODUCTO BD", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return tabla_temporal;
    }

    public boolean registrarProducto(Producto p) {
        boolean rpta = false;
        sql = "INSERT INTO producto(pSerie,pDescripcion,pObservacion,digemi,pCondicion,idcategoria,idmarca,idmedida) "
                + "VALUES(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);

            pst.setString(1, p.getpSerie());
            pst.setString(2, p.getpDescripcion());
            pst.setString(3, p.getpObservacion());
            pst.setString(4, p.getDigemi());
            pst.setString(5, p.getpCondicion());
            pst.setInt(6, p.getIdcategoria());
            pst.setInt(7, p.getIdmarca());
            pst.setInt(8, p.getIdmedida());

            rpta = pst.executeUpdate() == 1 ? true : false;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "PROBLEMAS AL REGISTRAR PRODUCTO BD", JOptionPane.ERROR_MESSAGE);
            return rpta;
        }
        return rpta;
    }
    
}
