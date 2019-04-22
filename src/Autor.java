/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmaciasb
 */
public class Autor {
    private String nombre;
    private String apellido;

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public String setNombre(String nombre){
       return this.nombre=nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String setApellido(String apellido){
        return this.nombre=apellido;
    }
}
