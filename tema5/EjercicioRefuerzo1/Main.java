package EjercicioRefuerzo1;

public class Main {

    public static void main(String[] args) {

        // Crear tres cuentas bancarias
        CuentaBancaria cuenta1 = new CuentaBancaria("Ana", 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Luis", 500);
        CuentaBancaria cuenta3 = new CuentaBancaria("María", 1500);

        // Mostrar datos de cada cuenta
        cuenta1.mostrarDatos();
        cuenta2.mostrarDatos();
        cuenta3.mostrarDatos();

        // Mostrar el total de cuentas creadas
        System.out.println("Total de cuentas creadas: ");
              
    }
}
