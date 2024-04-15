package trabajopractico2;


public class Novela extends Libro {
    private String genero;

    public Novela() {
    }

    public Novela(String titulo, String autor, int fechaDePublicacion, boolean prestado, String genero) {
        super(titulo, autor, fechaDePublicacion, prestado);
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
