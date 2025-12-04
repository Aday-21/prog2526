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
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero decimal: ");
        double num = sc.nextDouble();

        // Comprobar si es casi-cero o no
        if (num != 0 && Math.abs(num) < 1) {
            System.out.println("Es un numero casi-cero.");
        } else {
            System.out.println("NO es un numero casi-cero.");
        }
    }
}
