/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisExs;

/**
 *
 * @author fernando
 */
public class ExRutNoValido extends Exception{

    public ExRutNoValido() {
        super();
    }

    @Override
    public String getMessage() {
//        return super.getMessage(); //To change body of generated methods, choose Tools | Templates.
        String m = "Rut no valido";
        return m;
    }
    
}
