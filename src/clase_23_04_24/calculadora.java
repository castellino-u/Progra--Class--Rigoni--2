package clase_23_04_24;


import java.util.InputMismatchException;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1;
        double n2;
        int option;
        double result = 0;

        try {
            System.out.print("Bienvenido, por favor ingrese un número: ");
            n1 = sc.nextDouble();
            System.out.print("Ingrese otro número: ");
            n2 = sc.nextDouble();
            System.out.println("Ingrese [1] para sumar, [2] para restar, [3] para multiplicar o [4] para dividir: ");
            option = sc.nextInt();

            switch (option){
                case 1:
                    result = n1 + n2;
                    break;
                case 2:
                    result = n1 - n2;
                    break;
                case 3:
                    result = n1 * n2;
                    break;
                case 4:
                    try {
                        if (n2 == 0){
                            throw new ArithmeticException(); //throw es lanzar la excepción
                        }
                        result = n1 / n2;
                    } catch ( ArithmeticException e) {
                        System.out.println("Error, no se puede dividir por cero. " + e.getMessage());
                        return;
                    }

                    break;
            }
        } catch (InputMismatchException e ){
            System.out.println(" error " + e.getMessage());
        }



        if (result != 0) {
            System.out.println("El resultado de la operación es: " + result);
        }
    }
}
