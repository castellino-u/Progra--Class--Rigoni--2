package tp1.ejercicio10;

public class TextBooksU extends TextBooks{
    private String department;

    //Constructores
    public TextBooksU(String title, String author, int price, String curse, String department) {
        super(title, author, price, curse);
        this.department = department;
    }

    //Getter and Setter

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //Metodos


    @Override
    public void mess() {
        super.mess();
        System.out.println("Facultad que lo publicó: "+this.department);
    }
}