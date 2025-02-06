package es.cursosprhib.ejemplo02;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/*/
Patron Singleton
/*/


public class EMF {
	
	private static EntityManagerFactory emf;
	
	public static EntityManagerFactory getInstance() {
		
		
		if (emf == null){
				emf = Persistence.createEntityManagerFactory("conexionjpa2");
		}
	
		return emf;
}
}