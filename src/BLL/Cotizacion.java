/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

/**
 *
 * @author fernando
 */
public class Cotizacion {
    private String nombre;
    private int costo;
    private int id_ctz;

    public Cotizacion() {
    }

    public Cotizacion(String nombre, int costo) {
        this.nombre = nombre;
        this.costo = costo;
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

    public int getId_ctz() {
        return id_ctz;
    }

    public void setId_ctz(int id_ctz) {
        this.id_ctz = id_ctz;
    }
    
}
