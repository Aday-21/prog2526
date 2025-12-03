/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author 09_1DAW_Alum
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //pregunta al usuario
        System.out.println("¿Está lloviendo?: ");
        boolean llueve = scanner.nextBoolean();

        System.out.println("¿Has terminado tus tareas?: ");
        boolean tareasTerminadas = scanner.nextBoolean();

        System.out.println("¿Necesitas ir a la biblioteca?: ");
        boolean irBiblioteca = scanner.nextBoolean();

        //para decidir si puede salir
        boolean puedeSalir = (!llueve && tareasTerminadas) || irBiblioteca;

        // Muestra resultado
        System.out.println("¿Puedes salir a la calle?: " + puedeSalir);
    }
}
