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
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero entero");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el segundo numero entero");
        int numero2 = sc.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los números son iguales.");
        } else {
            if (numero1 > numero2) {
                System.out.println("El mayor es: " + numero1);
            } else {
                System.out.println("El mayor es: " + numero2);
            }
        }
    }
 
}
