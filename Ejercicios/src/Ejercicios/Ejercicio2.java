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
public class Ejercicio2 {
     /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce tu edad; ");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        edad = edad + 1;
         System.out.println("El anio que viene tienes; "+ edad + " anios");
    }
    
}
