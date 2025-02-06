package es.cursosprhib.ejemplo05;

import es.cursosprhib.ejemplo02.EMF;
import jakarta.persistence.EntityManager;

public class Test05 {

	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		
		Persona05 p = em.find(Persona05.class, new Persona05Id (12121212, 'A'));
		
		if (p != null) {
			System.out.println(p);
		} else {
			System.out.println("El registro no existe");
		}
	}

}
