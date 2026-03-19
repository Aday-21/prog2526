package Ejercicio8;

public class Oficina {
	public static void main(String[] args) {

        Empleado[] empleados = new Empleado[2];

        empleados[0] = new Empleado_Fijo("Ana", 1800);
        empleados[1] = new Empleado_Por_Horas("Luis", 10, 120);

        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() + " - Salario: " + empleado.calcularSalario()
            );
        }
	}

}