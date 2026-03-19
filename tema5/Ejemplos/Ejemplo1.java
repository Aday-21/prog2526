
package Ejemplos;

import Ejemplos.Ejemplo1;

public class Ejemplo1 {
    public static void main(String [] args){
        Persona p1 = new Persona("FRAN", 20);
        Persona p2 = new Persona("FRAN", 20);
        System.out.println(p1.equals(p2));
    }
    
}
