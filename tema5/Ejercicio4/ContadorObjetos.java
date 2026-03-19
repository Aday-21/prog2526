package Ejercicio4;

public class ContadorObjetos {
    // Atributo estático
    private static int totalObjetos = 0;

    // Constructor
    ContadorObjetos() {
        this.totalObjetos += 1;
    }

    // Método estático
    static void mostrarTotalObjetos() {
        System.out.println("Total de objetos creados: " + totalObjetos);
    }
}
