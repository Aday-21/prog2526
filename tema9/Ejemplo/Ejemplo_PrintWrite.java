package Ejemplo;

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Ejemplo_PrintWrite {

    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter ejemplo = new PrintWriter("archivo.txt");

        ejemplo.println("Hola mundo");

        ejemplo.close();
    }
}