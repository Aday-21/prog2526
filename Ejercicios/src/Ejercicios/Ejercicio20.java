/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;
import java.awt.BorderLayout;
import java.util.Scanner;
/**
 *
 * @author 09_1DAW_Alum
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la nota; ");
        int nota = scanner.nextInt();
        
        switch (nota){
            case 1,2,3,4: System.out.println("Suspenso");
            break;
            case 5,6: System.out.println("Suficiente");
            break;
            case 7,8: System.out.println("Notable");
            break;
            case 9,10: System.out.println("Sobresaliente");
        };
    }
}
