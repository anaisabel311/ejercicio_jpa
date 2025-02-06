package es.cursosprhib.ejemplo08;

import es.cursosprhib.ejemplo02.EMF;
import jakarta.persistence.EntityManager;

public class Test08 {

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Persona06 p=em.find(Persona06.class, 6);
		System.out.println(p);
	}

}
