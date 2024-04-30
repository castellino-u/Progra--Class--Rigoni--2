package tp2.ejercicio2;


public class Childish extends Book{
    private int edadRecomendada;
    //Constructor
    public Childish(){
    }

    public Childish(String titulo, String autor, int añoDePublicacion, boolean prestado, int edadRecomendada) {
        super(titulo, autor, añoDePublicacion, prestado);
        this.edadRecomendada = edadRecomendada;
    }

    //Getter ans Setter
    public int getEdadRecomendada() {
        return edadRecomendada;
    }
    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

}