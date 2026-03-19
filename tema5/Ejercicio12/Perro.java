package Ejercicio12;

public class Perro extends Animal {

    public Perro (String nombre, int edad){
        super(nombre,edad);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("Guau");
    }
    
    @Override
    public String moverse(){
        return "andar a 4 patas";
    }
}
