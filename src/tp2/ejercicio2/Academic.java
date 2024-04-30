package tp2.ejercicio2;

public class Academic extends Book {
    private String carrera;
    //Constructor

    public Academic() {
    }

    public Academic(String titulo, String autor, int anioDePublicacion, boolean prestado, String carrera) {
        super(titulo, autor, anioDePublicacion, prestado);
        this.carrera = carrera;
    }

    //Getter and Setter
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}