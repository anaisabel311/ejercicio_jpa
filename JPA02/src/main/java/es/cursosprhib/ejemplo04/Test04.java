package es.cursosprhib.ejemplo04;

import es.cursosprhib.ejemplo02.EMF;
import jakarta.persistence.EntityManager;

public class Test04 {

	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		
		Persona04 p = em.find(Persona04.class, new Persona04Id (121212, 'A'));
		
		if (p != null) {
			System.out.println(p);
		} else {
			System.out.println("El registro no existe");
		}
	}

}
