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
public class Ejercicio19 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero; ");
        int num1 = scanner.nextInt();
        
        System.out.println("Introduce el segundo numero; ");
        int num2 = scanner.nextInt();
        
        System.out.println("Introduce el tercer numero; ");
        int num3 = scanner.nextInt();
        
        if (num1 > num2 && num2 > num3) {
            System.out.println("El orden es; "+ num1 +", "+ num2+ ", "+ num3);
        } else if (num1 < num2 && num2 < num3) {
            System.out.println("El orden es; "+ num3 +", "+ num2+ ", "+ num1);
        } else if (num1 < num2 && num2 < num3){
            System.out.println("El orden es; "+ num2 +", "+ num1+ ", "+ num3);
        } else if (num1 > num3 && num3 <num2){
            System.out.println("El orden es; "+ num1+ ", "+ num3+ ", "+ num2);
        }   
    }
}
