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
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        System.out.println("Introduce otro numero: ");
        int numero1 = sc1.nextInt();
       
        String cadena = numero > numero1? numero+ " es mayor que "+ numero1 : numero1+ " es mayor que "+ numero;
        System.out.println(cadena);
        
        
        
    }
}
