package Ejercicio2;

import java.io.FileWriter;

public class ExperimentoFlush {
    public static void main(String[] args) throws Exception {
        // Creamos el escritor hacia un archivo
        FileWriter escritor = new FileWriter("prueba.txt");
        
        // Escribimos algo
        escritor.write("¿Donde está mi texto?");
        
        escritor.close();
        
        System.out.println("He escrito en el archivo... ¿o no?");
        
        // El programa se queda esperando aquí para que no termine
        Thread.sleep(10000); // Espera 10 segundos
        
        // No hemos puesto ni flush() ni close()
    }
}
/*
¿Se ha escrito algo en prueba.txt? ¿por qué?

No, porque al solo poner el .write lo que hace es que lo guarda pero no lo envia al fichero 
porque debe de hacer un flush.

¿Cómo lo arreglarias? Hazlo y compruebalo. 

Se arregla primero que nada cerrando despues de poner el .write, asi si se hace el 
flush automaticamente y se envia al fichero

*/