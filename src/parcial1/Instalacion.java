package parcial1;

public class Instalacion {
    //atributos
    private String categoria;
    private String locazion;
    private String nombre;
    private String tipo;

    //constructores
    public Instalacion(){

    }
    public Instalacion(String categoria, String locazion, String nombre, String tipo){
        this.categoria = categoria;
        this.locazion= locazion;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    //getters and setters
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLocazion() {
        return locazion;
    }

    public void setLocazion(String locazion) {
        this.locazion = locazion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //metodos
    public void mostrarInfo() {
        System.out.print("Información de la Instalación:" );
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Categoria: " + this.getCategoria() );
        System.out.println("Localización: " + this.getLocazion());
        System.out.println("Tpo: "+ this.getTipo());
    }


}
