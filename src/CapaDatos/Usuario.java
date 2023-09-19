/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDatos;

/**
 *
 * @author USUARIO
 */
public class Usuario {
    private String uDni;
    private String uNombre;
    private String uApellidos;
    private String uDireccion;
    private String uClave;
    private String uCelular;
    private int uTipo;
    private String tienda;

    public Usuario() {
    }

    public String getuDni() {
        return uDni;
    }

    public void setuDni(String uDni) {
        this.uDni = uDni;
    }

    public String getuNombre() {
        return uNombre;
    }

    public void setuNombre(String uNombre) {
        this.uNombre = uNombre;
    }

    public String getuApellidos() {
        return uApellidos;
    }

    public void setuApellidos(String uApellidos) {
        this.uApellidos = uApellidos;
    }

    public String getuDireccion() {
        return uDireccion;
    }

    public void setuDireccion(String uDireccion) {
        this.uDireccion = uDireccion;
    }

    public String getuClave() {
        return uClave;
    }

    public void setuClave(String uClave) {
        this.uClave = uClave;
    }

    public String getuCelular() {
        return uCelular;
    }

    public void setuCelular(String uCelular) {
        this.uCelular = uCelular;
    }

    public int getuTipo() {
        return uTipo;
    }

    public void setuTipo(int uTipo) {
        this.uTipo = uTipo;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }
    
    
}
