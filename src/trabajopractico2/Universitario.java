package trabajopractico2;


public class Universitario extends Libro {
    private String carrera;

    public Universitario() {
    }

    public Universitario(String carrera) {
        this.carrera = carrera;
    }

    public Universitario(String titulo, String autor, int añoDePublicacion, boolean prestado, String carrera) {
        super(titulo, autor, añoDePublicacion, prestado);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
