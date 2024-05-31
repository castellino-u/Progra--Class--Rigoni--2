package recuperatorio30_05_24;

public class Prestamo {

    //Atributos de la clase.

    private String fechaDevolucion;
    private String fechaPrestamo;
    private Libro libro;
    private Usuario usuario;

    //Constructor vacío

    public Prestamo() {
    }

    //Constructor sobrecargado

    public Prestamo(String fechaDevolucion, String fechaPrestamo, Libro libro, Usuario usuario) {
        this.fechaDevolucion = fechaDevolucion;
        this.fechaPrestamo = fechaPrestamo;
        this.libro = libro;
        this.usuario = usuario;
    }

    //Método .toString para mostrar objetos por pantalla.

    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaDevolucion='" + fechaDevolucion + '\'' +
                ", fechaPrestamo='" + fechaPrestamo + '\'' +
                ", libro=" + libro +
                ", usuario=" + usuario +
                '}';
    }

    //Getters and Setters

    public String getFechaDevolucion() { return fechaDevolucion; }
    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

