package es.cursosprhib.jpa03ejerciciojpa.modelo;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/*/
Patron Singleton
/*/


public class EMF {
	
	private static EntityManagerFactory emf;
	
	public static EntityManagerFactory getInstance() {
		
		
		if (emf == null){
				emf = Persistence.createEntityManagerFactory("conexion_ejercicio_jpa");
		}
	
		return emf;
}
}