/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author 09_1DAW_Alum
 */
public class Vaca {
    //Atributos
    String nombre;
    String color;
    boolean hambre = true;
    //Metodos
    void come() {
        hambre = false;
    }
    
    void mugir() {
        System.out.println("Muuuuu");
    }
}