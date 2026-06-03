package Ejercicio4;

import ejercicio3.EventoMusical;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import ejercicio4.EventoMusical.GeneroMusical;

public class Ejercicio4 {

    public static void main(String[] args) {
	EventoMusical conciertoHades = new EventoMusical("Puro Latino", 
            new Date(2026, 7, 12), new BigDecimal (10000), EventoMusical.GeneroMusical.TRAP);
		
	EventoMusical conciertoLuarLaL = new EventoMusical("SHOKO", 
            new Date(2026, 3, 6), new BigDecimal (125000), EventoMusical.GeneroMusical.TRAP);
		
	EventoMusical conciertoClarent = new EventoMusical("MOMART", 
            new Date(2026, 4, 24), new BigDecimal (2530000), EventoMusical.GeneroMusical.TRAP);
		
	Artista hades = new Artista();
	hades.setNombre("Hades");
	hades.setPais("Puerto Rico");
	conciertoHades.agregarArtista(hades);
		
	// Actividad 4
	//Abrir conexión
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventos.odb");
	EntityManager em = emf.createEntityManager();
		
	//Iniciatros la transaccion
	em.getTransaction().begin();
		
	//Operaciones
	em.persist(conciertoHades);
		
	//Finalizar la transaccion: salvar la información
	em.getTransaction().commit();
		
	//Cerramos conexion
	em.close();
	emf.close();
		
	}

}
