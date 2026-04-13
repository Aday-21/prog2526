package Ejercicio1;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Pon la cantidad que quieras dividir: ");
            int dividendo = sc.nextInt();

            System.out.print("Pon la cantidad en la que lo quieras dividir: ");
            int divisor = sc.nextInt();

            int resultado = dividendo / divisor;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException ex) {
            System.out.println("Imposible dividir por 0");
            System.out.println(ex);           // mostrar mensaje de ex
            ex.printStackTrace();             // mostrar traza del error
        } finally {
            sc.close();                       // cerrar flujo
            System.out.println("Fin del programa");
        }
    }
}