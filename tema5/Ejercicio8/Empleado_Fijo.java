package Ejercicio8;

public class Empleado_Fijo extends Empleado{


	private double salarioMensual;
	
	// Constructor
	public Empleado_Fijo(String nombre, double salarioMensual) {
		super(nombre);
		this.salarioMensual = salarioMensual;
	}
	
	public double calcularSalario() {
		return salarioMensual;
	}

	public double getSalarioMensual() {
		return salarioMensual;
	}

	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	
}