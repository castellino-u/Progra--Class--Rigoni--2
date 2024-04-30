package tp2.ejercicio2;


public class MainBook{
    public static void main(String[] args) {
        //Crear una biblioteca
        Library sanMartin = new Library("Biblioteca José de San Martín");

        //Crear los libros
        Book l1 = new Academic("Física I","Sears",1990,false,"Ingenieria");
        Book l2 = new Academic("Calculo Vectorial","Claudio, Pita",1985,false,"Ingenieria");
        Book l3 = new Academic("Química Organica","Monica, Gutierrez y Leticia, Lopez",2000,false,"Profesorado en Química");
        //Terminar de llenar la info de los libros
        Book l4 = new Novel("Orgullo y prejuicio", "Jean Austen", 1813, false, "novela");
        Book l5 = new Novel("Frankenstein", "Mary Shane", 1818, false, "novela");
        Book l6 = new Novel("Cumbres Borroscosas", "Emily Brotë", 1847, false, "novela");

        Book l7 = new Childish("El libro de la selva", "Rudyard Kipling", 1894, false, 8);
        Book l8 = new Childish("El principito", "Antoine de Saint-Exupéry", 1943, false, 12);
        Book l9 = new Childish("Las aventuras de Alicia en el país de Las Maravillas", "Lewis Carrol", 1865, false, 11);

        //Agregar Estos libros a la biblioteca
        sanMartin.agregarLibro(l1);
        sanMartin.agregarLibro(l2);
        sanMartin.agregarLibro(l3);
        sanMartin.agregarLibro(l4);
        sanMartin.agregarLibro(l5);
        sanMartin.agregarLibro(l6);
        sanMartin.agregarLibro(l7);
        sanMartin.agregarLibro(l8);
        sanMartin.agregarLibro(l9);

        //Iniciamos los libros en false así que en el metodo ListarDisponibles tiene que salir todos
        sanMartin.librosDisponibles();

        //Uriel necesita el libro de física, pide prestado "Física I"
        sanMartin.prestarLibro("Física I");

        //Uriel pide prestado un libro para su amigo, "Química Organica"
        sanMartin.prestarLibro("Química Organica");

        //Rodrigo Pide prestado de la biblioteca una novela, "Orgullo y prejuicio"
        //tambien pide un libro infantil para su hermanito
        sanMartin.prestarLibro("Orgullo y prejuicio");
        sanMartin.prestarLibro("El principito");

        //Listamos los libros disponibles(En este caso tenemos 4 libros menos
        sanMartin.librosDisponibles();

        //Rodrigo volvio a los dias a devolver el libro del principito y se llevo otros dos libros
        sanMartin.devolverLibro("El principito");
        sanMartin.prestarLibro("El libro de la selva");
        sanMartin.prestarLibro("Frankenstein");


        sanMartin.librosDisponibles();
    }
}