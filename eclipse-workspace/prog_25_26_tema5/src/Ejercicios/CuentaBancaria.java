package Ejercicios;

public class CuentaBancaria{

	// Atributos
	
	private String titular;
	private int saldo;
	
	// Métodos públicos
	
	public String getTitular() {
		return titular;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	 public void ingresar(double cantidad) {
		 if (cantidad > 0) {
	            saldo += cantidad;
	     }
	 }

	 public void retirar(double cantidad) {
		 if (cantidad > 0 && saldo >= cantidad) {
	            saldo -= cantidad;
		 }
	 }
}

