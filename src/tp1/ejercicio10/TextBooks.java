package tp1.ejercicio10;


public class TextBooks extends Book{
    private String course;

    //Constructor
    public TextBooks(String title, String author, int price, String curse) {
        super(title, author, price);
        this.course = curse;
    }

    //Getter and Setter

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    //Metodos


    @Override
    public void mess() {
        super.mess();
        System.out.println("Curso asociado al libro: "+this.course);
    }
}