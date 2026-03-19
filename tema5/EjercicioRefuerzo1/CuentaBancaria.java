package EjercicioRefuerzo1;


public class CuentaBancaria {
    // Atributos
    private String titular;
    private double saldo;
    private int totalCuentas;
    
    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        totalCuentas =+1;
    }

    // Métodos
    void mostrarDatos(){
        System.out.println("El titular de la cuenta es; "+titular+" y el saldo es de; "+saldo);
    }
    
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }
    
     
     
}
