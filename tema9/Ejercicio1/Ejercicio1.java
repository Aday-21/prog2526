
package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String [] args){
        
       Scanner sc = new Scanner(System.in);
       // Pedimos que el usuario introduzca el valor de nombre
       String entrada = sc.next();
       System.out.println("Introduce 4 caracteres; ");
       
       // Pasamos a caracter
       char c1 = entrada.charAt(0);
       char c2 = entrada.charAt(1);
       char c3 = entrada.charAt(2);
       char c4 = entrada.charAt(3);
       
        System.out.write(c1);
        System.out.flush();
        
        System.out.print(c2);
        
        System.out.println(c3);
        
        System.out.printf("El ultimo caracter es; %c", c4);
    }
}
