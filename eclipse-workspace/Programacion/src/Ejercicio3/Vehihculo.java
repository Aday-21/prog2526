package Ejercicio3;

public class Vehihculo {
	String matricula;
	String marca;
	int anioFabricacion;
	double precio;
	TipoVehiculo tipo;

	Vehihculo(String matricula, String marca, int anioFabricacion, double precio, TipoVehiculo tipo){
		this(matricula, marca, anioFabricacion, precio);
		this.tipo = tipo;
	}

	public Vehihculo(String matricula2, String marca2, int anioFabricacion2, double precio2) {
		// TODO Auto-generated constructor stub
	}
}
