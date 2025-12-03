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
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Precios por kilo
        double precioManzana = 2.35;
        double precioPera = 1.95;

        // Solicitar ventas de manzanas
        System.out.print("Kilos de manzanas vendidos en el primer semestre: ");
        double manzanas1 = scanner.nextDouble();

        System.out.print("Kilos de manzanas vendidos en el segundo semestre: ");
        double manzanas2 = scanner.nextDouble();

        // Solicitar ventas de peras
        System.out.print("Kilos de peras vendidos en el primer semestre: ");
        double peras1 = scanner.nextDouble();

        System.out.print("Kilos de peras vendidos en el segundo semestre: ");
        double peras2 = scanner.nextDouble();

        // Calcular beneficios
        double totalManzanas = (manzanas1 + manzanas2) * precioManzana;
        double totalPeras = (peras1 + peras2) * precioPera;

        double totalBeneficio = totalManzanas + totalPeras;

        // Mostrar resultado
        System.out.println("El beneficio total anual es: " + totalBeneficio + " €");
    }
}
