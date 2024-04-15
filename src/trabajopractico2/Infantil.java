package trabajopractico2;


public class Infantil extends Libro {
    private int edadRecomendada;

    public Infantil() {
    }

    public Infantil(String titulo, String autor, int fechaDePublicacion, boolean prestado, int edadRecomendada) {
        super(titulo, autor, fechaDePublicacion, prestado);
        this.edadRecomendada = edadRecomendada;
    }

    public int getEdadRecomendada() {
        return this.edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }
}
