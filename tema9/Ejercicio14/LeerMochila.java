package Ejercicio14;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LeerMochila {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("mochila.bin");
            ObjectInputStream entrada = new ObjectInputStream(archivo);

            ArrayList<Item> mochila = (ArrayList<Item>) entrada.readObject();

            entrada.close();
            archivo.close();

            int valorTotal = 0;

            System.out.println("Contenido de la mochila:");

            for (Item item : mochila) {
                System.out.println(item);
                valorTotal += item.getValor();
            }

            System.out.println("Valor total: " + valorTotal);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
