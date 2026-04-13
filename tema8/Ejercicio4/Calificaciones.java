package Ejercicio4;

import java.util.ArrayList;

public class Calificaciones {
    public static void main(String[] args) {

        // Array(Strings)
        String[] notasEntrada = {"7.5", "4.2", "9.0", "3.8", "6.5"};

        // 1. Crear ArrayList<Double>
        ArrayList<Double> notas = new ArrayList<>();

        // 2. Conversión (Parsing) y añadir a la lista
        for (String notaTexto : notasEntrada) {
        notas.add(Double.parseDouble(notaTexto));
        }

        // Mostrar notas convertidas
        System.out.println("Notas: " + notas);

        // 3. Cálculo de la media (Unboxing automático)
        double suma = 0.0;
        for (Double nota : notas) {
            suma += nota; // unboxing automático de Double -> double
        }

        double media = suma / notas.size();
        System.out.println("Nota media: " + media);

        // 4. Filtrado de aprobados (>= 5.0)
        ArrayList<Double> aprobados = new ArrayList<>();

        for (Double nota : notas) {
            if (nota >= 5.0) {
                aprobados.add(nota);
            }
        }

        // Mostrar aprobados
        System.out.println("Aprobados: " + aprobados);
    }
}