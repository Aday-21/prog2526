
package Ejemplos;

import Ejemplos.Ejemplo1;

public class Persona {
    // Atributos
    public String nombre;
    public int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    @Override
    public boolean equals(Object obj){
        return this.nombre == ((Persona)obj).nombre &&
                this.edad == ((Persona) obj).edad;
    }
}
