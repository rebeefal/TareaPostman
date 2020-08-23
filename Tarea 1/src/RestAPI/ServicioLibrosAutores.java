package RestAPI;

import Clases.Autor;
import Clases.Libro;
import DAO.Datos;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


// The Java class will be hosted at the URI path "/Autores"
@Path("/Biblioteca")
public class ServicioLibrosAutores {

    private static List<Autor> autores = new ArrayList<Autor>();
    private Autor autor;
    private static List<Libro> libros = new ArrayList<Libro>();
    private Libro libro;
    private Datos datos  = new Datos();;

    @POST
    @Path("/agregarAutor")
    public Response agregarLibro(@QueryParam("id_autor" )int id_autor,
                                 @QueryParam("nombre") String nombre,
                                 @QueryParam("nacionalidad") String nacionalidad){
        datos.agregarAutor(id_autor,nombre,nacionalidad);
        return Response.status(200).entity(datos.getMensaje()).build();

    }

    @GET
    @Path("/autores")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerListaAutor(){
        return Response.status(Response.Status.ACCEPTED).entity(datos.listaAutores()).build();
    }


    @POST
    @Path("/agregarLibro")
    public Response agregarLibro(@QueryParam("id_autor" )int id_autor,
                                 @QueryParam("id_libro") int id_libro,
                                 @QueryParam("descripcion") String descripcion,
                                 @QueryParam("cantidadDisponible") boolean cantidadDisponible){
        datos.agregarLibro(id_autor,id_libro,descripcion,cantidadDisponible );
        return Response.status(200).entity(datos.getMensaje()).build();
    }


    @GET
    @Path("/libros")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerListaLibro(){

        return Response.status(Response.Status.ACCEPTED).entity(datos.listaLibros()).build();
    }

    @GET
    @Path("/librosPorAutor" )
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerListaLibroporAutor(@QueryParam("id_autor" )int id_autor){
       datos.obtenerLibrosPorAutor(id_autor);
       return Response.status(Response.Status.ACCEPTED).entity(datos.listaLibrosPorAutor()).build();
    }



    @DELETE
    @Path("/eliminaLibroAutor")
    public Response eliminaLibroPorAutor(@QueryParam("id_autor" )int id_autor,
                                         @QueryParam("id_libro" )int id_libro){

        datos.eliminaLibroDeUsuario(id_autor,id_libro);
        return Response.status(200).entity(datos.getMensaje()).build();
    }

}