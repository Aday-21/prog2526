
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class SelectorAlumnos {

    public static void main(String[] args) {
        String[] alumnos = {
            "Aday", "Jhonal", "Marchante", "Oscal", "Dani", "Copete",
            "Raul pueblo", "Raul bueno", "Davilillo", "Pera",
            "Monster Caliente", "Esguince Parche"
        };

        List<String> disponibles = new ArrayList<>(Arrays.asList(alumnos));
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Selecciona el primer alumno aleatorio
        String seleccionado = disponibles.remove(random.nextInt(disponibles.size()));
        System.out.println("Alumno seleccionado: " + seleccionado);

        while (true) {
            System.out.println("\nEscribe 'siguiente' para otro alumno o 'salir' para terminar:");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("salir")) break;
            if (input.equalsIgnoreCase("siguiente")) {
                if (disponibles.isEmpty()) {
                    disponibles = new ArrayList<>(Arrays.asList(alumnos)); // Reinicia cuando todos han salido
                }
                seleccionado = disponibles.remove(random.nextInt(disponibles.size()));
                System.out.println("Alumno seleccionado: " + seleccionado);
            }
        }

        sc.close();
    }
}


