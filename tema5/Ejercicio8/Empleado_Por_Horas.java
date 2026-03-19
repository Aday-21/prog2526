package Ejercicio8;

public class Empleado_Por_Horas extends Empleado {

    private int horasTrabajadas;
    private double precioHora;

    public Empleado_Por_Horas(String nombre, int horasTrabajadas, double precioHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;
    }


    public double calcularSalario() {
        return horasTrabajadas * precioHora;
    }
}