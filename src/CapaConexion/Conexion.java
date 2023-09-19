package CapaConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Conexion {
    
private static String clase = "com.mysql.cj.jdbc.Driver";

private static String url = "jdbc:mysql://localhost:3307/Farmacia?serverTimezone=UTC";
private static String usuario = "root";
private static String clave = "123456";

public Connection conectar(){
    Connection link = null;
    
    try {
        Class.forName(clase);
        link = DriverManager.getConnection(url, usuario, clave);
        
    } catch (Exception e) {
        JOptionPane.showConfirmDialog(null, e);
    }
    return link;
}
}
