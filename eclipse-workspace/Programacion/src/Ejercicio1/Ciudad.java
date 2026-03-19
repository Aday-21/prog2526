package Ejercicio1;
import Ejercicio2.Sexo;

public class Ciudad {
    public static void main(String[] args){
    	
    	// Atributos
    	Persona p = new Persona("Juan", "Perez", 20, 1.80f, Sexo.MASCULINO);
       
    	Persona Juan = new Persona("Paco", 21, 1.65);
        Juan.nombre = "Juan";
        Juan.edad = 20;
        Juan.estatura = 1.79;

        Persona Toni = new Persona("Paco", 21, 1.65);
        Toni.nombre = "Toni";
        Toni.edad = 20;
        Toni.estatura = 1.79;

        Persona Antonio = new Persona("Paco", 21, 1.65);
        Antonio.nombre = "Antonio";
        Antonio.edad = 20;
        Antonio.estatura = 1.79;
      
        Persona Hugo = new Persona("Paco", 21, 1.65);
        Hugo.nombre = "Hugo";
        Hugo.edad = 20;
        Hugo.estatura = 1.79;
        
        // Imprime la referencia
        System.out.println(Juan);
        // Imprime el nombre la edad y la estatura
        System.out.println("Hola soy "+ Juan.nombre +" y tengo "+ Juan.edad +", mido "+ Juan.estatura +".");
        System.out.println("Hola soy "+ Toni.nombre +" y tengo "+ Toni.edad +", mido "+ Toni.estatura +".");
        System.out.println("Hola soy "+ Antonio.nombre +" y tengo "+ Antonio.edad +", mido "+ Antonio.estatura +".");
        System.out.println("Hola soy "+ Hugo.nombre +" y tengo "+ Hugo.edad +", mido "+ Hugo.estatura +".");
        
        // Parte 4
        Persona Paco = new Persona("Paco", 21, 1.65);
        System.out.println("Hola soy "+ Paco.nombre +" y tengo "+ Paco.edad +", mido "+ Paco.estatura +".");
        Persona Pepe = new Persona("Pepe", 25, 1.85);
        System.out.println("Hola soy "+ Pepe.nombre +" y tengo "+ Pepe.edad +", mido "+ Pepe.estatura +".");
        
        
    }
}
