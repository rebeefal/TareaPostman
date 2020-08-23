package Clases;

public class Libro {

    int id_autor;
    int id_libro;
    String descripcion;
    boolean cantidadDisponible;


    public Libro() {
    }

    public Libro(int id_autor, int id_libro, String descripcion, boolean cantidadDisponible) {
        this.id_autor = id_autor;
        this.id_libro = id_libro;
        this.descripcion = descripcion;
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(boolean cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }


}
