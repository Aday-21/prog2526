package Ejercicio14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class GuardarMochila {
    public static void main(String[] args){
        // Creamos la lista mochila para guardar los objetos
        ArrayList<Item> mochila = new ArrayList<>();
        
        // añadimos objetos a mochila
        mochila.add(new Item("Pistola", 2,5, 300));
        mochila.add(new Item("Cuchillo", 0,5, 250));
        mochila.add(new Item("Cuerda", 0,3, 100));
        mochila.add(new Item("Papel", 0,2, 50));
        mochila.add(new Item("Tijeras", 1,0, 70));
        
        try {
            FileOutputStream archivo = new FileOutputStream("mochila.bin");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);

            salida.writeObject(mochila);

            salida.close();
            archivo.close();

            System.out.println("Mochila guardada correctamente.");
        }catch(IOException e){
             e.printStackTrace();
        }
    }
}
