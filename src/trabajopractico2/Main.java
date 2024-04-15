package trabajopractico2;


public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Biblioteca sanMartin = new Biblioteca("Biblioteca José de San Martín");
        Libro l1 = new Universitario("Física I", "Sears", 1990, false, "Ingenieria");
        Libro l2 = new Universitario("Calculo Vectorial", "Claudio, Pita", 1985, false, "Ingenieria");
        Libro l3 = new Universitario("Química Organica", "Monica, Gutierrez y Leticia, Lopez", 2000, false, "Profesorado en Química");
        Libro l4 = new Novela("Orgullo y prejuicio", "Jean Austen", 1813, false, "novela");
        Libro l5 = new Novela("Frankenstein", "Mary Shane", 1818, false, "novela");
        Libro l6 = new Novela("Cumbres Borroscosas", "Emily Brotë", 1847, false, "novela");
        Libro l7 = new Infantil("El libro de la selva", "Rudyard Kipling", 1894, false, 8);
        Libro l8 = new Infantil("El principito", "Antoine de Saint-Exupéry", 1943, false, 12);
        Libro l9 = new Infantil("Las aventuras de Alicia en el país de Las Maravillas", "Lewis Carrol", 1865, false, 11);
        sanMartin.agregarLibro(l1);
        sanMartin.agregarLibro(l2);
        sanMartin.agregarLibro(l3);
        sanMartin.agregarLibro(l4);
        sanMartin.agregarLibro(l5);
        sanMartin.agregarLibro(l6);
        sanMartin.agregarLibro(l7);
        sanMartin.agregarLibro(l8);
        sanMartin.agregarLibro(l9);
        sanMartin.librosDisponibles();
        sanMartin.prestarLibro("Física I");
        sanMartin.prestarLibro("Química Organica");
        sanMartin.prestarLibro("Orgullo y prejuicio");
        sanMartin.prestarLibro("El principito");
        sanMartin.librosDisponibles();
        sanMartin.devolverLibro("El principito");
        sanMartin.prestarLibro("El libro de la selva");
        sanMartin.prestarLibro("Frankenstein");
        sanMartin.librosDisponibles();
    }
}
