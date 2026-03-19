package Ejercicio1;

class CuentaBancaria {
private String titular;
private double saldo;

public  String getTitular() {
	return titular;
}

public double getSaldo() {
	return saldo;
}

public void ingresar (double saldo) {
	if (this.saldo >= 0) {
		this.saldo = saldo + saldo;
		System.out.println("El dinero se a ingresado correctamente");
	}
	else {
		System.out.println("Imposible realizar ingresos negativos, inténtalo de nuevo.");
	}
}

public void retirar (double saldo) {
	if (this.saldo >= saldo) {
		this.saldo = saldo - saldo;
		System.out.println("El dinero se a retirado correctamente");
	}
	else {
		System.out.println("Imposible retirar, no tienes dinero.");
	}
}


}