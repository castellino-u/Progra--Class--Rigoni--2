package parcial1;

//esta es una clase derivada, que hereda de persona

public class Atleta extends Persona implements Contrato, Math {
    private double altura;
    private int edad;
    private double peso;

    //constructores


    public Atleta() {
    }

    public Atleta(int dni, String nombre, double altura, int edad, double peso) {
        super(dni, nombre);
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
    }

    //métodos implementados de la interfaz contrato
    @Override
    public void calculaIMC() {

    }

    @Override
    public void hayPesoExtra() {

    }

    @Override
    public void tomarPulsaciones() {

    }

}
