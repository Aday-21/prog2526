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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos las dos notas
        System.out.print("Introduce la primera nota (entera): ");
        int nota1 = sc.nextInt();

        System.out.print("Introduce la segunda nota (entera): ");
        int nota2 = sc.nextInt();

        // Cálculo de la media (usamos double para que permita decimales)
        double media = (nota1 + nota2) / 2.0;

        // Mostramos el resultado
        System.out.println("La media es: " + media);
    }
}

    

