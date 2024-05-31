package recuperatorio30_05_24;

import java.util.ArrayList;
import java.util.List;

public class UsoBiblioteca {
    public static void main(String[] args) {
        // Creación de libros

        Libro libro1 = new Libro(2024,"José Carlos", "Comedia", "Las mañanitas");
        Libro libro2 = new Libro(2024,"José Carlos", "Comedia", "Los borreguitos");
        Libro libro3 = new Libro(2024,"Rafaela Carra", "Música", "Las rolas de Rafaela");
        Libro libro4 = new Libro(2024,"José C. Paz", "Historia", "Las calles");

        //Creación de usuarios:

        Usuario usuario1 = new Usuario("Uriel ", "Castellino", 44908444);
        Usuario usuario2 = new Usuario("Maria ", "Elena", 7733829);

        //Creo la bibliotecla y le asigno el listado de libros y los nombres;

        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.setNombreBibliteca("Biblioteca San Martin");
        List<Libro> libros = new ArrayList<Libro>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);
        biblioteca1.setListaLibros(libros);

        //Muestro la lista de libros de la biblioteca.

        System.out.println("Bienvenido a la biblioteca " + biblioteca1.getNombreBibliteca());
        System.out.println("Los libros que tenemos para prestar son: ");
            for (Libro lib : biblioteca1.getListaLibros()){
                System.out.println(lib.toString());
            }

        //Realizamos los procesos de devolución y de prestamo de libros.

        System.out.println("-----------------------------------------------");
        biblioteca1.prestarLibro(usuario1, libro1);
        biblioteca1.devolverLibro(usuario1,libro1);

        biblioteca1.prestarLibro(usuario2,libro3);

        biblioteca1.prestarLibro(usuario1,libro3);

        biblioteca1.devolverLibro(usuario2,libro3);

        biblioteca1.prestarLibro(usuario1,libro3);


        System.out.println("-----------------------------------------------");

        //Creamos un registro con la clase prestamo.

        Prestamo registro1 = new Prestamo("30/05/25","29/05/24",libro1,usuario1);
        Prestamo registro2 = new Prestamo("30/05/24","29/05/24",libro3,usuario2);

        //mostramos los registros.

        System.out.println(registro1.toString());
        System.out.println(registro2.toString());

    }
}
