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
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Introduce el radio del circulo; ");
        Scanner sc = new Scanner(System.in);
        int Radio = sc.nextInt();
        final double PI = 3.141592;
        double longitud = (double) (2 * PI * Radio);
        double area = (double) (PI * (Radio * Radio));
        System.out.println("La longitud del circulo es de; "+ longitud);
        System.out.println("El area del circulo es; "+ area);
    }
}
