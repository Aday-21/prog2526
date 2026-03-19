package Ejercicio9;

public class Círculo extends Figura {

    private double radio;

    public Círculo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}