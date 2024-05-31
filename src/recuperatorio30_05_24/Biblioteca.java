package recuperatorio30_05_24;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Prestable {

    //Atributos de la clase.
    private List<Libro> listaLibros;
    private String nombreBibliteca;
    private List<Libro> librosPrestados; //Agregamos un atributo más de tipo lista para poder manejar los prestamos.


    //Constructores
    //Iniciamos la lista libros acá porque necesitamos inicializar la lista para poder manipularla después.

    public Biblioteca() {
        this.librosPrestados = new ArrayList<Libro>();

    }

    public Biblioteca(String nombreBibliteca) {
        this.listaLibros = new ArrayList<Libro>();
        this.nombreBibliteca = nombreBibliteca;
        this.librosPrestados = new ArrayList<Libro>();

    }

    //Método para poder mostrar por pantalla el objeto.
    @Override
    public String toString() {
        return "Biblioteca{" +
                "listaLibros=" + listaLibros +
                ", nombreBibliteca='" + nombreBibliteca + '\'' +
                '}';
    }

    //Métodos para las operaciones de prestar y devolver libros
    @Override
    public void devolverLibro(Usuario usuario, Libro libro) {
        if (!librosPrestados.contains(libro)){
            System.out.println("El libro no está en los registros de libros para devolver. ");
        } else{
            librosPrestados.remove(libro);
            System.out.println("El libro "+ libro.getTitulo() + " fue devuelto por " + usuario.getNombre() + " " + usuario.getApellido() );
        }

    }

    @Override
    public void prestarLibro(Usuario usuario, Libro libro) {
        if (!listaLibros.contains(libro)){
            System.out.println("El libro no está disponible. ");
        } else if (librosPrestados.contains(libro)) {
            System.out.println("El libro está prestado");
        }else{
            librosPrestados.add(libro);
            System.out.println("El libro " + libro.getTitulo() + " se prestó a: " + usuario.getNombre() + " " + usuario.getApellido());
        }

    }

    //Getters and Setters

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public String getNombreBibliteca() {
        return nombreBibliteca;
    }

    public void setNombreBibliteca(String nombreBibliteca) {
        this.nombreBibliteca = nombreBibliteca;
    }


    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(List<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
}
