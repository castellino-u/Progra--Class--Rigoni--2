package tp1.ejercicio9;


public class Rectangulo extends FiguraGeometrica {
    private double longitud;
    private double anchura;

    public Rectangulo(){

    }



    public Rectangulo(double longitud, double anchura) {
        this.longitud = longitud;
        this.anchura = anchura;


    }


    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }


    @Override
    public void calcArea() {
        System.out.println("El area del rectangulo es: " + (this.getLongitud() * this.getAnchura()));
    }

    @Override
    public void calcPerimetro() {
        System.out.println("El perimetro del rectangulo es: " + ((this.getLongitud() * 2) + (this.getAnchura() * 2)));
    }
}