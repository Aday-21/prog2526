
package Ejercicios;

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
