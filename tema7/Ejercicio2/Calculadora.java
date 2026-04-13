
package Ejercicio2;

import java.io.IOException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int resultado = dividir(a, b);

            System.out.println(resultado);

        } catch (ArithmeticException ex) {
            System.out.println("Error división por 0");
        }
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}