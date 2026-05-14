package Ejercicio13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ejercicio13 {
    public static void main(String[] args){
        // creamos el objeto
        Persona miFamoso = new Persona("Cristian Ronaldo", "Dos Santos", 41);

        // guardamos en el fichero
        try 
        {
            FileOutputStream fichero = new FileOutputStream("persona.dat");
            ObjectOutputStream out = new ObjectOutputStream(fichero);

            out.writeObject(miFamoso);

            out.close();

            System.out.println("Se a guardado correctamente");

        }catch(IOException e){
            System.out.println("Error al guardar");
        }
     }
    
}
