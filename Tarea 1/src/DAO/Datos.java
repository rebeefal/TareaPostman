package DAO;

import Clases.Autor;
import Clases.Libro;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Datos {

    String mensaje;

    private static List<Autor> autores = new ArrayList<Autor>();
    private Autor autor;

    private static List<Libro> libros = new ArrayList<Libro>();
    private Libro libro;

    private static List<Libro> librosPorAutor = new ArrayList<Libro>();



    //  Manejo de autores
    public void agregarAutor(int id_autor,
                             String nombre,
                             String nacionalidad ){
        if(!autorExiste(id_autor)){
            autor = new Autor();
            autor.setId_autor(id_autor);
            autor.setNombre(nombre);
            autor.setNacionalidad(nacionalidad);
            autores.add(autor);
            muestraMensaje(1);

        }else{
            muestraMensaje(0);
        }
    }

    public List<Autor> listaAutores(){
        return autores;
    }


    public boolean autorExiste(int id_autor){
        boolean existe = false;
        for(Autor a : autores ){
            if (a.getId_autor() == id_autor){
                existe = true;
            }
        }
        return existe;
    }


    // Fin Codigo Manejo de Autores

    // Manejo de Libros





    public void agregarLibro(int id_autor,
                             int id_libro,
                             String descripcion,
                             boolean cantidadDisponible ){

        if(!autorExiste(id_autor)){
            muestraMensaje(3);

        }else if(libroExiste(id_libro)){
            muestraMensaje(0);

        }else{
            libro = new Libro();
            libro.setId_autor(id_autor);
            libro.setId_libro(id_libro);
            libro.setDescripcion(descripcion);
            libro.setCantidadDisponible(cantidadDisponible);
            libros.add(libro);
            muestraMensaje(1);
        }
    }

    public List<Libro> listaLibros(){
        return libros;
    }


    public boolean libroExiste(int id_libro){
        boolean existe = false;
        for(Libro l : libros ){
            if (l.getId_libro() == id_libro){
                existe = true;
            }
        }
        return existe;
    }




    private String muestraMensaje(int codigo){

        if (codigo == 0){ // codigo 0
            setMensaje( "Ya existe");

        }else if (codigo == 1){ // codigo 0
            setMensaje( "Se ha ingresado correctamente");

        }else if (codigo == 2){
            setMensaje( "Se elimino el libro ");

        }else if (codigo == 3){
            setMensaje( "El autor de ese libro no ha sido ingresado: ");
        }
        return mensaje;
    }


    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }



    public void obtenerLibrosPorAutor(int id){
        for ( Libro l : libros){
            if (l.getId_autor() == id ){
                librosPorAutor.add(l);
            }
        }
    }


    public List<Libro> listaLibrosPorAutor(){
        return librosPorAutor;
    }


    public void eliminaLibroDeUsuario(int id_a, int id_l){
            for ( Libro l : libros){
                Libro n =  l;
                if (l.getId_autor() == id_a  &&  l.getId_libro() == id_l  ){
                    libros.remove(n);
                    muestraMensaje(2);
                }
            }
    }
}





