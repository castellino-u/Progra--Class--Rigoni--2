package tp1.ejercicio10;

public class MainBook {
    public static void main(String[] args) {
        Novels n1 = new Novels("los juegos del hambre", "Suzanne, Collins", 15000, "Ciencia ficción");
        TextBooksU t1 = new TextBooksU("Estadistica Descriptiva","Sear, Jhon",25000,"Estadistica","ingenieria");
        TextBooks t2 = new TextBooks("Astronomía","Galileo Galilei",24500,"Fisica 2");


        n1.mess();
        t1.mess();
        t2.mess();
    }
}