package Clases;

public class Autor {


    int id_autor;
    String nombre;
    String nacionalidad;

    public Autor() {
    }

    public Autor(int id_autor, String nombre, String nacionalidad) {
        this.id_autor = id_autor;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }


    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }



}
