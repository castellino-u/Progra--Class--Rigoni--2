package clase_23_04_24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcuRuth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0;
        try {
            System.out.println("Calculadora Simple");
            System.out.println("Ingrese el primer número:");
            double numero1 = scanner.nextDouble();

            System.out.println("Ingrese el segundo número:");
            double numero2 = scanner.nextDouble();

            System.out.println("Ingrese la operación (+, -, *, /):");
            char operacion = scanner.next().charAt(0);

            if (operacion == '+') {
                resultado = numero1 + numero2;
            } else if (operacion == '-') {
                resultado = numero1 - numero2;
            } else if (operacion == '*') {
                resultado = numero1 * numero2;
            } else if (operacion == '/') {
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    throw new ArithmeticException();
                }
            }else{
                throw new Exception();
            }
            /*switch (operacion) {
                case '+':
                    resultado = numero1 + numero2;
                    break;
                case '-':
                    resultado = numero1 - numero2;
                    break;
                case '*':
                    resultado = numero1 * numero2;
                    break;
                case '/':
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        throw new ArithmeticException();
                    }
                default:
                    throw new Exception();
            }*/
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }catch (InputMismatchException e) {
            System.out.println("Error: Entrada no válida. Por favor, ingrese números válidos.");
        }catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }

        System.out.println("El resultado de la operación es: " + resultado);
    }
}
