/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDatos;

/**
 *
 * @author USUARIO
 */
public class TipoUsuario {
    private int idtipousuario;
    private String tuNombre;

    public TipoUsuario() {
    }

    public TipoUsuario(int idtipousuario, String tuNombre) {
        this.idtipousuario = idtipousuario;
        this.tuNombre = tuNombre;
    }

    public int getIdtipousuario() {
        return idtipousuario;
    }

    public void setIdtipousuario(int idtipousuario) {
        this.idtipousuario = idtipousuario;
    }

    public String getTuNombre() {
        return tuNombre;
    }

    public void setTuNombre(String tuNombre) {
        this.tuNombre = tuNombre;
    }
            
   
}
