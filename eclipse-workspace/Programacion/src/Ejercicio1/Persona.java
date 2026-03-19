package Ejercicio1;
import Ejercicio2.Sexo;

public class Persona {
	// Atributos
	String nombre;
	int edad;
	double estatura;
	DiaDeLaSemana dia;
	float sexo;

	// Constructor
	public Persona(String nombre, int string, float estatura, float f, Sexo sexo) {
		this.nombre = nombre;
	    this.edad = string;
	    this.estatura = estatura;
	    this.sexo = f;
	}

	public Persona(String string, int i, double d) {
		
	}

		public Persona(String nombre2, String string, int estatura2, float f, Sexo masculino) {
		// TODO Auto-generated constructor stub
	}

		

		// Método saludar
	    public void saludar() {
	        System.out.println("Hola, mi nombre es " + nombre);
	    }

	    // Método cumplirAños
	    public void cumplirAños() {
	        edad += 1;
	    }

	    // Método crecer
	    public void crecer(double incremento) {
	        incremento = estatura * 0.08;
	        estatura += incremento;
	    }
	} 