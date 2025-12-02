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
public class Ejercicio3 {
     public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce tu anio de nacimiento; ");
        Scanner sc = new Scanner(System.in);
        int anio_nac = sc.nextInt();
        
        System.out.println("Introduce el anio que estas actualmente; ");
        int anio_actual = sc.nextInt();
        
        int Anios = anio_actual - anio_nac;
        
         System.out.println("Estos son los anios que tienes; "+ Anios);        
        
    }
    
}
