package tp2.ejercicio2;


public class Novel extends Book{
    private String genero;

    //Constructor
    public Novel() {
    }

    public Novel(String titulo, String autor, int añoDePublicacion, boolean prestado, String genero) {
        super(titulo, autor, añoDePublicacion, prestado);
        this.genero = genero;
    }

    //Getter and setter
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}