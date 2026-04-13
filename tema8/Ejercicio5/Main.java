package Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main (String[] args){
        // 1.
        Set<Integer> ConjuntoEntero = new HashSet<>();
        
        // 2.
        ConjuntoEntero.add(6);
        ConjuntoEntero.add(8);
        ConjuntoEntero.add(7);
        ConjuntoEntero.add(10);
        ConjuntoEntero.add(9);
        
        // 3.
        System.out.println(ConjuntoEntero); // Imprime el valor.
        
        // 4.
        ConjuntoEntero.add(7); // no permite duplicados
    }
}
