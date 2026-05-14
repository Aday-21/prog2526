package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Parte 1
        System.out.println("Introduzca varios caracteres y después pulse intro para finalizar:");

        String texto = teclado.nextLine();

        System.out.println("Ha escrito: " + texto);

        // Parte 2
        System.out.println("Introduzca su nombre:");

        String nombre = teclado.nextLine();

        System.out.println("Hola " + nombre + "!");

        teclado.close();
    }
}
