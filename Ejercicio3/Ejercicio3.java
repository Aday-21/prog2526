package ejercicio3;

import Ejercicio2.Artista;
import java.math.BigDecimal;
import java.sql.Date;

import ejercicio3.EventoMusical.GeneroMusical;


public class Ejercicio3 {

	public static void main(String[] args) {
		EventoMusical conciertoHades = new EventoMusical("Puro Latino", 
				new Date(2026, 7, 12), new BigDecimal (10000), GeneroMusical.TRAP);
		
		Artista hades = new Artista();
		hades.setNombre("Hades");
		hades.setPais("Puerto Rico");
		conciertoHades.agregarArtista(hades);

	}

}