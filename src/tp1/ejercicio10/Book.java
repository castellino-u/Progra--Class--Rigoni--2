package tp1.ejercicio10;

public abstract class Book {
    private String title;
    private String author;
    private int price;

    //Constructor
    public Book() {
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Getter ans Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //Metodos
    public void mess(){
        System.out.println("El título del libro: "+this.title);
        System.out.println("El autor del libro: "+this.author);
        System.out.println("El precio del libro: "+this.price);
    }
}