package tp1.ejercicio10;


public class Novels extends Book{
    // histórica, romántica, policíaca, realista, ciencia
    //ficción o aventuras

    private String genre;

    //Constructores

    public Novels(String title, String author, int price, String genre) {
        super(title, author, price);
        this.genre = genre;
    }

    //Getter and Setter

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void mess() {
        super.mess();
        System.out.println("El genero del libro: "+this.genre);
    }
}