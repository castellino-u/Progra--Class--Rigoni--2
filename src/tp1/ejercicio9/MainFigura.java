package tp1.ejercicio9;

public class MainFigura {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(2);
        Rectangulo r1 = new Rectangulo(5,2.45);

        c1.calcArea();
        System.out.println();
        c1.calcPerimetro();
        System.out.println();
        r1.calcArea();
        System.out.println();
        r1.calcPerimetro();
    }
}