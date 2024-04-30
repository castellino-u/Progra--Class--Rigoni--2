package tp2.ejercicio2;

import java.util.ArrayList;

public class Library {
    private String nombre;
    private ArrayList<Book> libros = new ArrayList<>();

    //Constructor
    public Library(String nombre) {
        this.nombre = nombre;
    }

    //GETTER and SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Book> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Book> libros) {
        this.libros = libros;
    }

    //Method
    public void agregarLibro(Book libroX){
        libros.add(libroX);
        System.out.println("El libro se ha agregado a la Biblioteca.");
    }

    public void prestarLibro(String Titulo){
        for(Book libroX : libros){
            if(libroX.getTitulo().equals(Titulo)){
                libroX.prestar(); //analizo antes si el estado del libro esta pprestado porque lo hace el metodo del libro(.prestar())
                System.out.println("Tiene una semana para devolver el libro.");
            }else {
                System.out.println("No se ha encontrado un libro con este titulo: "+ Titulo);
            }
        }
    }

    public void devolverLibro(String Titulo){
        for(Book libroX : libros){
            if(libroX.getTitulo().equals(Titulo)){
                libroX.devolver(); //analizo antes si el estado del libro esta pprestado porque lo hace el metodo del libro(.devoler())
            }else {
                System.out.println("No se ha encontrado un libro con este titulo: "+ Titulo);
            }
        }
    }

    public void librosDisponibles(){
        System.out.println("Lista de los libros disponibles: Titulo - Autor");
        for (Book libroX :libros){
            if (!libroX.isPrestado()){  //Es ! porque los libros disponibles son los que tienen el atributo prestado = false
                System.out.println(libroX.getTitulo()+" - "+libroX.getAutor() );
            }

        }
    }



}