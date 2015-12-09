/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

/**
 *
 * @author Ferna
 */
public class Material {
    private int idMaterial;
    private int idTipo;
    private String nombre;
    private int costo;

    public Material() {
    }

    public Material(int idMaterial, int idTipo, String nombre, int costo) {
        this.idMaterial = idMaterial;
        this.idTipo = idTipo;
        this.nombre = nombre;
        this.costo = costo;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
           
    
}
