package Ejericicio2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List li = new ArrayList();
        
        Persona aday = new Persona("Aday");
        Persona fabi = new Persona("Fabiola");
        Persona nora = new Persona("Nora");
        li.add(aday);
        li.add(fabi);
        li.add(nora);
        
        // Copia con el constructor
        List copia = new LinkedList(li);
	System.out.println(copia);
		
	// Copia con el add
	List copia2 = new LinkedList();
	for(Object x: li) {
	copia2.add(x);
	}
	copia2.addAll(li);
	System.out.println(copia2);
		
	// Intercambiar primera y última
	if(!copia.isEmpty()) {
	int primero = 0;
	int ultimo = copia.size() - 1;
	Object aux =  copia.get(ultimo);
	copia.set(ultimo, copia.get(primero));
	copia.set(primero, aux);
	}
        System.out.println(copia);
    }
}
