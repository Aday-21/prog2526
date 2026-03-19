package Ejercicio12;

public abstract class Animal {
    
    protected String nombre;
    protected int edad;
    
    public Animal(String nombre, int edad){
        this.edad = edad;
        this.nombre = nombre;
        
    }
    
    public abstract void hacerSonido();
    
    public String moverse(){
        return null;
    }
    
    
}
