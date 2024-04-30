package tp1.ejercicio9;

public class Circulo  extends FiguraGeometrica {

    private double radio;

    public Circulo(){

    }
    public Circulo(double radio) {
        this.radio = radio;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcArea() {
        System.out.printf("El area del circulo es: " + (Math.PI * (this.radio * this.radio)));
    }

    @Override
    public void calcPerimetro() {
        System.out.printf("El perimetro del circulo es: " + ((2 * Math.PI) * this.radio));
    }
}