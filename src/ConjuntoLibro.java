/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmaciasb
 */
public class ConjuntoLibro {
    private Libro[] libros;
    
    public ConjuntoLibro(){
        this.libros = new Libro[10];
    }
    public boolean anadirLibro(Libro libro){
        for(int i = 0; i<libros.length; i++){
            if(this.libros[i]==null){
                this.libros[i] = libro;
                return true;
            }
        }
        return false;
    }







}


