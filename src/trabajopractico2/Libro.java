package trabajopractico2;


public class Libro implements Prestable {
    private String titulo;
    private String autor;
    private int fechaDePublicacion;
    private boolean prestado;

    public Libro() {
    }

    public Libro(String titulo, String autor, int fechaDePublicacion, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaDePublicacion = fechaDePublicacion;
        this.prestado = prestado;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getFechaDePublicacion() {
        return this.fechaDePublicacion;
    }

    public void setFechaDePublicacion(int fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public boolean isPrestado() {
        return this.prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestar() {
        if (this.prestado) {
            System.out.println(this.titulo + " ya está prestado.");
        } else {
            System.out.println(this.titulo + " ha sido prestado.");
            this.prestado = true;
        }

    }

    public void devolver() {
        if (this.prestado) {
            this.prestado = false;
            System.out.println("El libro ha sido devuelto");
        } else {
            System.out.println("No estaba prestado ese libro.");
        }

    }
}

