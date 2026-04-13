package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>();
		nombres.add("Hugo");
		nombres.add("Aday");
		nombres.add("Alejandro");
		nombres.add("JoseManuel");
		nombres.add("David");
		
		escribe(nombres);
		
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		nombres.add(nombre);
		
		escribe(nombres);
		
		System.out.println("Que nombre quieres eliminar: ");
		String eliminarNombres = sc.nextLine();
		if (nombres.remove(eliminarNombres)) {
			System.out.println("Realizado con exito");
		} else {
			System.out.println("No existe");
		}
		
		System.out.println("Total de nombres: " + nombres.size());
		
	}
	
	private static void escribe (List<String> lista) {
		for (String string : lista) {
			System.out.println(string);
		}
	}

}