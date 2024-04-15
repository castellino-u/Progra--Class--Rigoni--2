package trabajopractico2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros = new ArrayList();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
        return this.libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libroX) {
        this.libros.add(libroX);
        System.out.println("El libro se ha agregado a la Biblioteca.");
    }

    public void prestarLibro(String Titulo) {
        Iterator var2 = this.libros.iterator();

        while(var2.hasNext()) {
            Libro libroX = (Libro)var2.next();
            if (libroX.getTitulo().equals(Titulo)) {
                libroX.prestar();
                System.out.println("Tiene una semana para devolver el libro.");
            } else {
                System.out.println("No se ha encontrado un libro con este titulo: " + Titulo);
            }
        }

    }

    public void devolverLibro(String Titulo) {
        Iterator var2 = this.libros.iterator();

        while(var2.hasNext()) {
            Libro libroX = (Libro)var2.next();
            if (libroX.getTitulo().equals(Titulo)) {
                libroX.devolver();
            } else {
                System.out.println("No se ha encontrado un libro con este titulo: " + Titulo);
            }
        }

    }

    public void librosDisponibles() {
        System.out.println("Lista de los libros disponibles: Titulo - Autor");
        Iterator var1 = this.libros.iterator();

        while(var1.hasNext()) {
            Libro libroX = (Libro)var1.next();
            if (!libroX.isPrestado()) {
                PrintStream var10000 = System.out;
                String var10001 = libroX.getTitulo();
                var10000.println(var10001 + " - " + libroX.getAutor());
            }
        }

    }
}

