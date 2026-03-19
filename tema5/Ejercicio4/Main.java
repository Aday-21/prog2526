package Ejercicio4;

public class Main {

    
    public static void main(String[] args) {
         // Creación de varios objetos
        ContadorObjetos obj1 = new ContadorObjetos();
        ContadorObjetos obj2 = new ContadorObjetos();
        ContadorObjetos obj3 = new ContadorObjetos();
        
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        // Mostrar el total de objetos creados
        ContadorObjetos.mostrarTotalObjetos();
        obj1.mostrarTotalObjetos();   
        ContadorObjetos.mostrarTotalObjetos();
    }
    
}
