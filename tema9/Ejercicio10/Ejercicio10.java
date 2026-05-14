package Ejercicio10;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio10 {

	public static void main(String[] args) throws IOException {
		//Crear Fichero 
		File fichero = new File("c:\\Users\\09_1DAW_Alum\\ejercicio10.txt");
		
		// Preguntar si existe (si no, muestra mensaje y sale)
		if (fichero.exists()) {
			System.out.println("Archivo encontrado: " + fichero.getName());
			System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
			
			//Escribimos en el fichero
			FileWriter fw = new FileWriter(fichero, true); //true, añade al fichero lo que le mandemos
			// si quitamos true, sobreescribe el fichero
			fw.write("Hola");
			fw.close(); //Cerramos
			
			//Leemos el fichero
			FileReader fr = new FileReader(fichero);
			int unByte;
			while ((unByte = fr.read()) != -1) {
				System.out.print(unByte + " ");
			}
			fr.close();
			
		} else {
			System.out.println("El archivo no existe.");
		}
		
	}

}