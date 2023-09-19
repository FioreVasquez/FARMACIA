/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.Medida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class MedidaBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql;

    public DefaultTableModel reportarMedida() {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "PRESENTACION", "EQUIVALENCIA"};
        String[] registros = new String[3];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idmedida,mPresentacion,mEquivalencia FROM medida";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("idmedida");
                registros[1] = rs.getString("mPresentacion");
                registros[2] = rs.getString("mEquivalencia");

                modelo.addRow(registros);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERROR AL REPORTAR MEDIDA BD", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }

    public boolean registrarMedida(Medida m) {
        sql = "INSERT INTO medida(idmedida,mPresentacion, mEquivalencia) VALUES(0,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, m.getPrePresentacion());
            pst.setString(2, m.getPreEquivalencia());

            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "PROBLEMAS AL REGISTRAR MEDIDA BD", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean modificarMedida(Medida m) {
        sql = "UPDATE medida SET mPresentacion=?,mEquivalencia=? WHERE idmedida=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);

            pst.setString(1, m.getPrePresentacion());
            pst.setString(2, m.getPreEquivalencia());
            pst.setInt(3, m.getIdmedida());

            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERROR AL MODIFICAR MEDIDA BD", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return false;
    }

    public boolean eliminarMedida(int codigo) {
        sql = "DELETE FROM medida WHERE idmedida=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, codigo);
            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "PROBLEMAS AL ELIMINAR MEDIDA BD", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
