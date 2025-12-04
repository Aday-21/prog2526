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
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota del primer trimestre");
        double notaPrimerTrimestre = sc.nextDouble();
        System.out.println("Introduce la nota del segundo trimestre");
        double notaSegundoTrimestre = sc.nextDouble();
        System.out.println("Introduce la nota del tercer trimestre");
        double notaTercerTrimestre = sc.nextDouble();

        double calcularMediaDecimales = (notaPrimerTrimestre + notaSegundoTrimestre + notaTercerTrimestre) / 3;
        System.out.println("La media del curso es: " + calcularMediaDecimales);

        int calcularMediaEnteros = (int) calcularMediaDecimales;
        System.out.println("La media del curso sin decimales es: " + calcularMediaEnteros);
    }
}
