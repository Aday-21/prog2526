package Ejercicio8;

public class Main {

    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[5];

        empleados[0] = new Empleado_Fijo("Ana", 2000);
        empleados[1] = new Empleado_Por_Horas("Luis", 80, 15);
        empleados[2] = new Empleado_Fijo("Ana", 2000);
        empleados[3] = new Empleado_Por_Horas("Luis", 80, 15);
        empleados[4] = new Empleado_Por_Horas("Luis", 80, 15);
       
        for (Empleado e : empleados) {
            System.out.println("Nombre: " + e.getNombre() +
                               " - Salario: " + e.calcularSalario());
        }
    }
}