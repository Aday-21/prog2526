
package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
   
    
    public static void main(String[] args){
        //1 es nula
        List l = null;
        System.out.println(l);
        
        //2 es vacia
        List li = new ArrayList();
        System.out.println(li);
        
        //3
        Persona aday = new Persona("Aday");
        Persona fabi = new Persona("Fabiola");
        Persona nora = new Persona("Nora");
        li.add(aday);
        li.add(fabi);
        li.add(nora);
        System.out.println(li);
        
        //4
        li.getLast();
        
        //5
        Persona persona;
        persona = (Persona)li.getFirst();
        persona.setNombre("Hugo");
        
        //6
        int indiceCentral = li.size()/2 - 1;
        li.remove(indiceCentral);
        
        //8
        for(int i = 0; i < li.size(); i++){
            System.out.println(li.get(i));
        }
        
        //9
        li.clear();
        System.out.println("9. Lista vaciada: " + li);

        boolean vacia = li.isEmpty();
        System.out.println("¿Lista vacía? " + vacia);
    }
}
