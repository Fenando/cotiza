/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import MisExs.ExRutNoValido;

/**
 *
 * @author fernando
 */
public class Usuario {

    private String nombre;
    private String apellido;
    private String rutG;
    private int rut;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public boolean setRutG(String rutG) {
        boolean validacion = false;
        try {
            rutG = rutG.toUpperCase();
            rutG = rutG.replace(".", "");
            rutG = rutG.replace("-", "");
            int rutAux = Integer.parseInt(rutG.substring(0, rutG.length() - 1));
            System.out.println(rutAux);

            char dv = rutG.charAt(rutG.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
                this.setRut(rutAux);
            }else{
                throw new ExRutNoValido();
            }
            
        } catch (java.lang.NumberFormatException e) {
        } catch (ExRutNoValido eR) {
            return validacion;
        }
        
        return validacion;
    }
    
 public static void main(String[] args) {
        System.out.println(new Usuario().setRutG("15478653-8"));
    }
}

   

