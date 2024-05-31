package recuperatorio30_05_24;

public class Libro {

    //Atributos de la clase
    private int anioPublicacion;
    private String autor;
    private String gnero;
    private String titulo;

    //Constructor vacío.

    public Libro() {
    }

    //Constructor sobrecargado.

    public Libro(int anioPublicacion, String autor, String gnero, String titulo) {
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
        this.gnero = gnero;
        this.titulo = titulo;
    }

    //Método .toString para mostrar el objeto por pantalla.

    @Override
    public String toString() {
        return "Libro: " +
                "Año de Publicacion=" + anioPublicacion +
                ", Autor ='" + autor + '\'' +
                ", Género ='" + gnero + '\'' +
                ", Titulo ='" + titulo + '\'' +
                '.';
    }

    //Getters and Setters

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGnero() {
        return gnero;
    }

    public void setGnero(String gnero) {
        this.gnero = gnero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
